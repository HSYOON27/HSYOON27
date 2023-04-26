package com.kh.spring19.rest;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.mail.MessagingException;

import org.springdoc.api.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring19.dto.CertDto;
import com.kh.spring19.service.EmailService;

@CrossOrigin
@RestController
@RequestMapping("/cert")
public class EmailRestController {

	@Autowired
	private EmailService emailService;
	
	@PostMapping("/")
	public void send(@RequestBody CertDto certDto) throws FileNotFoundException, MessagingException, IOException {
		emailService.sendCert(certDto.getEmail());
		
	}
}
