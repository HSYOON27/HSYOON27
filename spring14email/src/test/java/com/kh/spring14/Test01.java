package com.kh.spring14;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import com.kh.spring14.configuration.CustomEmailProperties;

//목표 : 3rd party 이메일 전송 도구인 Gmail을 사용한 이메일 발송 테스트 

@SpringBootTest
public class Test01 {

	@Autowired
	private CustomEmailProperties emailProperties;
	
	@Test
	public void test() {
		//전송도구 - JavaMailSender(lmpl)
		JavaMailSenderImpl sender = new JavaMailSenderImpl();
		
		//이용할 업체(Gmail)에 대한 정보 설정
		sender.setHost(emailProperties.getHost());
		sender.setPort(emailProperties.getPort());
		sender.setUsername(emailProperties.getUsername());
		sender.setPassword(emailProperties.getPassword());
		
		//통신과 관련된 추가 설정(보안이나 이런거)
		//- Properties는 <String, String> 형태의 Map
		Properties props = new Properties();
		props.setProperty("mail.smtp.auth", "true"); //인증 후 이용(필수)
		props.setProperty("mail.smtp.debug", "true"); //디버깅 사용 설정 (선택) 디버깅이란? 문제 생겼을때 메세지가 생긴 이력추적
		props.setProperty("mail.smtp.starttls.enable", "true"); // TLS 사용 설정(필수)
		props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");// TLS 버전 설정(필수)
		props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com"); //신뢰할 수 있는지 (필수)
		
		sender.setJavaMailProperties(props);
		
		//도구가 준비되었으니 이메일 메세지를 작성해서 전송
		//- SimpleMailMessage - 간단한 텍스트가 담긴 메세지 
		//- MimeMessage - 지정한 MIME 데이터가 담긴 메세지
		
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setTo("kots524@naver.com", "yoonhyeongdon@gmail.com", "lsh392766@gmail.com");
		message.setSubject("성현띠");
		message.setText("오늘 맥날먹자");
		
		sender.send(message);
		
		
	}
}
