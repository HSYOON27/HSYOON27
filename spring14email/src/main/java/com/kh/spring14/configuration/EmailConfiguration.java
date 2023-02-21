package com.kh.spring14.configuration;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

//이메일 전송도구를 생성해서 등록하는 설정 구현
@Configuration
public class EmailConfiguration {

	@Autowired
	private CustomEmailProperties emailProperties;

	// 등록하고 싶은 객체를 생성하여 반환하는 메소드를 만들고,
	// @Bean 이라고 표시한다
	// - 메소드의 접근 제한은 public 이어야 한다.
	// - 메소드의 반환형은 생성할 데이터 형태여야 한다.
	// - 메소드의 일므은 식별자로 사용된다.
	// - (선택) 가급적 상위 형태로 반환하여 사용하는 것을 권장(약결합 구조)
	
	@Bean
	public JavaMailSenderImpl sender() {
		// 전송도구 - JavaMailSender(lmpl)
		JavaMailSenderImpl sender = new JavaMailSenderImpl();

		// 이용할 업체(Gmail)에 대한 정보 설정
		sender.setHost(emailProperties.getHost());
		sender.setPort(emailProperties.getPort());
		sender.setUsername(emailProperties.getUsername());
		sender.setPassword(emailProperties.getPassword());

		// 통신과 관련된 추가 설정(보안이나 이런거)
		// - Properties는 <String, String> 형태의 Map
		Properties props = new Properties();
		props.setProperty("mail.smtp.auth", "true"); // 인증 후 이용(필수)
		props.setProperty("mail.smtp.debug", "true"); // 디버깅 사용 설정 (선택) 디버깅이란? 문제 생겼을때 메세지가 생긴 이력추적
		props.setProperty("mail.smtp.starttls.enable", "true"); // TLS 사용 설정(필수)
		props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");// TLS 버전 설정(필수)
		props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com"); // 신뢰할 수 있는지 (필수)

		sender.setJavaMailProperties(props);

		return sender;

	}

}
