package com.kh.spring21.service;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kh.spring21.dto.ChatRoomDto;
import com.kh.spring21.dto.ChatUserDto;
import com.kh.spring21.repo.ChatRoomRepo;
import com.kh.spring21.repo.ChatUserRepo;
import com.kh.spring21.vo.ChannelReceiveVO;
import com.kh.spring21.vo.MemberMessageVO;
import com.kh.spring21.vo.RoomVO;
import com.kh.spring21.vo.UserVO;
import com.kh.spring21.websocket.WebSocketConstant;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ChatServiceImpl implements ChatService {

   // 여러 개의 방을 관리할 저장소
   Map<String,RoomVO> rooms = Collections.synchronizedMap(new HashMap<>());
   
   // 메세지 해석기
   private ObjectMapper mapper = new ObjectMapper();
   
   @Autowired
   private ChatRoomRepo chatRoomRepo;
   
   @Autowired
   private ChatUserRepo chatUserRepo;
   
   // - 방 생성/제거/확인
      public void createRoom(String roomName) {
         if(containsRoom(roomName)) return;
         rooms.put(roomName,new RoomVO());
         
         // 방 등록(DB)
         boolean isWaitingRoom = roomName.equals(WebSocketConstant.WAITING_ROOM);
         
         if(!isWaitingRoom && chatRoomRepo.find(roomName) == null) {      
            ChatRoomDto dto = new ChatRoomDto();
            dto.setRoomName(roomName);
            chatRoomRepo.create(dto);
         }
         
                  
      }
      
      public void deleteRoom(String roomName) {
         rooms.remove(roomName);
      }
      
      public boolean containsRoom(String roomName) {
         return rooms.containsKey(roomName);
      }
      
      // - 사용자를 방에 입장/퇴장
      public void join(UserVO user, String roomName) {
         createRoom(roomName); // 방 생성(있으면 안만들어짐)
      
         
         RoomVO room = rooms.get(roomName);
         room.enter(user);
         
         // 참여자 등록(DB) - 기존이 참여중이 아닌경우 실행
         boolean isWaitingRoom = roomName.equals(WebSocketConstant.WAITING_ROOM);
         ChatUserDto userDto = new ChatUserDto();
         userDto.setRoomName(roomName);
         userDto.setMemberId(roomName);
         boolean isJoin = chatUserRepo.check(userDto);
         
         if(isWaitingRoom && !isJoin) {
         ChatUserDto dto = new ChatUserDto();
         dto.setRoomName(roomName);
         dto.setMemberId(user.getMemberId());
         chatUserRepo.add(dto); 
         
         log.debug("{} 님이 {}번 방으로 참여하였습니다.",user.getMemberId(),roomName);
         }
      }
      
      public void exit(UserVO user, String roomName) {
         if(!containsRoom(roomName)) return;
         RoomVO room = rooms.get(roomName);
         room.leave(user);
         
         // 참여자 제거(DB)
         
         log.debug("{} 님이 {}번 방에서 퇴장하였습니다.",user.getMemberId(),roomName);
      }

      // - 방에 메세지를 전송하는 기능(그룹채팅)
      public void broadcastRoom(TextMessage jsonMessage, String roomName) throws IOException {
         if(!containsRoom(roomName)) return;
         
         RoomVO room = rooms.get(roomName);
         room.broadcast(jsonMessage);
      }
      
      // - 사용자가 존재하는 방을 찾는 기능
//         모든 방을 뒤져서 나오면 해당 방 이름을 반환 
      public String findUser(UserVO user) {
         for(String roomName : rooms.keySet()) { // 모든 방의 이름을 꺼내서
            RoomVO room = rooms.get(roomName); // 방 객체를 추출하고
            if(room.contains(user)) { // 해당 방 객체에 사용자가 있다면
               return roomName; // 방 이름을 반환
            }
         }
         return null;
      }
      // - 사용자를 방에서 방으로 이동시키는 기능
      public void moveUser(UserVO user,String roomName) {
         String beforeRoomName = findUser(user); // 사용자 위치를 찾아라
         exit(user,beforeRoomName); // 나가라
         join(user, roomName); // 들어가라
      }
      // - 방 개수
      // - 전체 방에 메세지를 전송하는 기능(공지)
   
   
   
   @Override
   public void connectHandler(WebSocketSession session) {
      UserVO user = new UserVO(session);
      String roomName = WebSocketConstant.WAITING_ROOM;
      this.join(user, roomName);
      

   }

   @Override
   public void disconnectHandler(WebSocketSession session) {
      // 삭제의 조건
      // [1] 자료형이 일치해야 함(UserVO)
      // [2] 비교기준이 설정되어있어야 함(hashCode,equals)
      
      UserVO user = new UserVO(session);   
      String roomName = this.findUser(user);
      this.exit(user, roomName);
   }

   @Override
   public void receiveHandler(WebSocketSession session, TextMessage message) throws IOException {
      // 회원 정보를 생성
            UserVO user = new UserVO(session);
         
         
            
            // 메세지를 수신(ChannelReceiveVO)
            // - 이 메세지의 type을 분석하여 작업에 맞는 처리를 수행
            ChannelReceiveVO receiveVO = mapper.readValue(message.getPayload(),ChannelReceiveVO.class);
            
            // 채팅메세지인 경우
            if(receiveVO.getType() == WebSocketConstant.CHAT) {
               // receiveVO.content에 채팅 메세지가 있다.
               
               // 비회원 차단
               if(!user.isMember()) return;
               
               String roomName = this.findUser(user); // 찾아
               if(roomName == null) return; // 없으면 하지마
               
               // (옵션) 대기실인경우 메세지 전송이 불가
               if(roomName.equals("waitingRoom")) return;
               
               // 보낼 메세지 생성
               MemberMessageVO msg = new MemberMessageVO();
               msg.setContent(receiveVO.getContent());  // 전송내용
               msg.setTime(System.currentTimeMillis()); // 전송시각
               msg.setMemberId(user.getMemberId());     // 아이디
               msg.setMemberLevel(user.getMemberLevel()); // 등급
               
               String jsonStr = mapper.writeValueAsString(msg);
               TextMessage jsonMessage = new TextMessage(jsonStr);
               
               this.broadcastRoom(jsonMessage,roomName); // 방에 메세지 보내
               
            // 입장메세지인 경우   
            }else if(receiveVO.getType() == WebSocketConstant.JOIN) {
               // receiveVO.room에 방 번호가 있다.
               String roomName = receiveVO.getRoom();
               this.moveUser(user,roomName);
            }
            
            
         }
   

}