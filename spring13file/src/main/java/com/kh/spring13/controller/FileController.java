package com.kh.spring13.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kh.spring13.dao.AttachmentDao;
import com.kh.spring13.dao.PocketmonDao;
import com.kh.spring13.dao.PocketmonImageDao;
import com.kh.spring13.dto.AttachmentDto;
import com.kh.spring13.dto.PocketmonDto;
import com.kh.spring13.dto.PocketmonImageDto;

@Controller
public class FileController {
   @Autowired
   private AttachmentDao attachmentDao;
   
   @Autowired
   private PocketmonDao pocketmonDao;
   
   @Autowired
   private PocketmonImageDao pocketmonImageDao;
   
   @GetMapping("/")
   public String home() {
      return "/WEB-INF/views/home.jsp";
   }
   
   // 파일 업로드는 PostMapping만 가능
   // - 전송된 파일은 MultipartFile 이라는 형태로 수신이 가능하다
   // - 파일 전송 완료 후에는 반드시 redirect를 해야 한다(안하면 새로고침시 재업로드)
   // - (주의) 파일을 전송하지 않아도 attach는 null이 아니므로 추가 검사 필요
   @PostMapping("/upload3")
   public String upload3(@RequestParam MultipartFile attach) throws IllegalStateException, IOException {
      System.out.println(attach.isEmpty());
      System.out.println("name = " + attach.getName()); // parameter 이름
      System.out.println("orginal file name = " + attach.getOriginalFilename()); // 사용자가 올린 파일명
      System.out.println("content type = " + attach.getContentType()); 
      System.out.println("size = " + attach.getSize()); // byte
      
      if(!attach.isEmpty()) { // 파일이 있을 경우
         // 번호 생성
         int attachmentNo = attachmentDao.sequence();
         
         // 파일 저장(저장 위치는 임시로 생성)
         File dir = new File("D:/upload");
         dir.mkdirs();
         
         File target = new File(dir, String.valueOf(attachmentNo));
         attach.transferTo(target);
         
         // DB저장
         attachmentDao.insert(AttachmentDto.builder()
                              .attachmentNo(attachmentNo)
                              .attachmentName(attach.getOriginalFilename())
                              .attachmentType(attach.getContentType())
                              .attachmentSize(attach.getSize())
                           .build());
      }
      return "redirect:/";
   }
   
   // 실전 : 기존 테이블에 이미지를 연결하여 저장하고 싶은 경우(포켓몬+이미지)
   // - 포켓몬 정보는 포켓몬 테이블에, 이미지는 첨부파일 테이블에 저장
   // - 두 테이블의 항목간 연결 관계를 나타내는 추가 테이블이 필요
   @PostMapping("/upload4")
   public String upload4(
         @ModelAttribute PocketmonDto pocketmonDto,
         @RequestParam MultipartFile attach) throws IllegalStateException, IOException {
      
      // 1. 포켓몬 등록
      pocketmonDao.insert(pocketmonDto);
      
      if(!attach.isEmpty()) {
    	  
         // 2. 첨부파일 저장 및 등록(있으면)
         int attachmentNo = attachmentDao.sequence(); // sequence from DB
         
         File dir = new File("D:/upload");
         dir.mkdirs(); // 이미 있으면 안만들어짐.
         
         File target = new File(dir, String.valueOf(attachmentNo)); // DB에서 sequence 가져와야함
         attach.transferTo(target); // 저장
         
         attachmentDao.insert(AttachmentDto.builder()
                                 .attachmentNo(attachmentNo)
                                 .attachmentName(attach.getOriginalFilename())
                                 .attachmentType(attach.getContentType())
                                 .attachmentSize(attach.getSize())
                              .build());
         
         // 3. 포켓몬과 첨부파일 정보를 연결(첨부파일이 있으면)
         pocketmonImageDao.insert(PocketmonImageDto.builder()
                  .pocketmonNo(pocketmonDto.getNo())
                  .attachmentNo(attachmentNo)
               .build());
      }
      
      return "redirect:/";
   }
   
   //전송되는 파일이 여러개라면 (1)배열 (2)리스트 형태로 수신한다.
   @PostMapping("/upload5")
   public String upload5(@RequestParam List<MultipartFile>attaches) {
	   System.out.println("전송개수 = " + attaches.size());
	   return "redirect:/";
   }
   
   

}