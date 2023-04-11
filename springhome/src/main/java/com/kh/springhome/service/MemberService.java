package com.kh.springhome.service;

import java.io.File;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kh.springhome.configuration.CustomFileuploadProperties;
import com.kh.springhome.dao.AttachmentDao;
import com.kh.springhome.dao.MemberDao;
import com.kh.springhome.dao.MemberImageDao;
import com.kh.springhome.dto.AttachmentDto;
import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.dto.MemberImageDto;

@Service
public class MemberService {

	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private AttachmentDao attachmentDao;
	   
	 @Autowired
	private MemberImageDao memberImageDao;
	 
	 @Autowired 
	private CustomFileuploadProperties fileuploadProperties;
	 
	 private File dir;
	 
	//최초 1회만 실행되는 메소드
	@PostConstruct
	public void init() {
		dir = new File(fileuploadProperties.getPath());
		dir.mkdirs();
	}
public void join(MemberDto memberDto, MultipartFile attach) throws IllegalStateException, IOException {
		
	      // 1. 멤버 이미지 등록
	      memberDao.insert(memberDto);
	      
	      if(!attach.isEmpty()) {
	    	  
	         // 2. 첨부파일 저장 및 등록(있으면)
	         int attachmentNo = attachmentDao.sequence(); // sequence from DB
	         	         
	         File target = new File(dir, String.valueOf(attachmentNo)); // DB에서 sequence 가져와야함
	         attach.transferTo(target); // 저장
	         
	         attachmentDao.insert(AttachmentDto.builder()
	                                 .attachmentNo(attachmentNo)
	                                 .attachmentName(attach.getOriginalFilename())
	                                 .attachmentType(attach.getContentType())
	                                 .attachmentSize(attach.getSize())
	                              .build());
	         
	         // 3. 멤버 이미지와 첨부파일 정보를 연결(첨부파일이 있으면)
	         memberImageDao.insert(MemberImageDto.builder()
	                  .memberId(memberDto.getMemberId())
	                  .attachmentNo(attachmentNo)
	               .build());
	      }
	}
}
