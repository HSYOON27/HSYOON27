package com.kh.spring12.controller;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.annotation.PostConstruct;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.kh.spring12.configuration.CustomFileuploadProperties;
import com.kh.spring12.dao.AttachmentDao;
import com.kh.spring12.dto.AttachmentDto;

@CrossOrigin
@RestController
@RequestMapping("/rest/attachment")
public class AttachmentRestController {
	
	//준비물
	   @Autowired
	   private AttachmentDao attachmentDao;
	   
	   @Autowired
	   private CustomFileuploadProperties fileUploadProperties;
	   
	   private File dir;
	   
	   @PostConstruct
	   public void init() {
		   dir = new File(fileUploadProperties.getPath());
		   dir.mkdirs();
	   }
	
	//업로드
	   @PostMapping("/upload")
	   public AttachmentDto upload(@RequestParam MultipartFile attach) throws IllegalStateException, IOException {
	
	      if(!attach.isEmpty()) { 

	    	 int attachmentNo = attachmentDao.sequence();
	         
	         File target = new File(dir, String.valueOf(attachmentNo));
	         attach.transferTo(target);
	         
	         attachmentDao.insert(AttachmentDto.builder()
	                              .attachmentNo(attachmentNo)
	                              .attachmentName(attach.getOriginalFilename())
	                              .attachmentType(attach.getContentType())
	                              .attachmentSize(attach.getSize())
	                           .build());
	         return attachmentDao.selectOne(attachmentNo); //DTO를 반환 
	      }
	      	 return null;//또는 예외 발생
	   }
	   
	
	   //다운로드
	   @GetMapping("/download/{attachmentNo}")
  		public ResponseEntity<ByteArrayResource> download(@PathVariable int attachmentNo) throws IOException{
  			
  				//DB 조회
  				AttachmentDto attachmentDto = attachmentDao.selectOne(attachmentNo); //단일 조회 하려면 Dao로 
  				if(attachmentDto == null) {
  					return ResponseEntity.notFound().build();
  				}
  				
  				//파일 찾기 
//  				File dir = new File("D:/upload");
  				File target = new File(dir, String.valueOf(attachmentNo));
  				
  				//보낼 데이터 생성
  				byte[] data = FileUtils.readFileToByteArray(target);
  				ByteArrayResource resource = new ByteArrayResource(data);
  				
  				//헤더와 바디를 설정하여 ResponseEntity를 만들어 반환하면 끝 
//  				return ResponseEntity.ok()
//  							.header("Content-Type", attachmentDto.getAttachmentType())	//형태에 맞춰 다운받아라
////							.header("Content-Type", "application/octet-stream")  //어떠한 경우에도 다운받아라
//  							.header("Content-Length", String.valueOf(attachmentDto.getAttachmentSize())) //형태가 String이라 이렇게
//  							.header("Content-Disposition", "attachment; filename="+attachmentDto.getAttachmentName()) //이 파일에 어떻게 접근하는지 까지 알려줘야함
//  							.header("Content-Encoding", "UTF-8")
//  						.body(resource);
//  				
  				
  				//제공되는 모든 상수와 명령을 동운해서 최대한 편하게 작성해보자 다운로드를 
  				return ResponseEntity.ok()
//  						.header(HttpHeaders.CONTENT_TYPE,
//  								MediaType.APPLICATION_OCTET_STREAM_VALUE)
  						.contentType(MediaType.APPLICATION_OCTET_STREAM)
  						.contentLength(attachmentDto.getAttachmentSize())
  						.header(HttpHeaders.CONTENT_ENCODING, 
  									StandardCharsets.UTF_8.name())
  						.header(HttpHeaders.CONTENT_DISPOSITION, 
  								ContentDisposition.attachment()
  									.filename(attachmentDto.getAttachmentName(),
  											StandardCharsets.UTF_8		
  												).build().toString()
  								)
  						.body(resource);
  		}
  		
  		}

	
