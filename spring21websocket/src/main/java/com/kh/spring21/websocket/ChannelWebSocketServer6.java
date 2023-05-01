package com.kh.spring21.websocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.kh.spring21.service.ChatService;

//목표 : 최초 접속 시 대기실로 입장하고 채널을 선택해서 들어가도록 구현
@Service
public class ChannelWebSocketServer6 extends TextWebSocketHandler {

	@Autowired
	private ChatService chatService;
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		super.afterConnectionEstablished(session);
	}
	

}