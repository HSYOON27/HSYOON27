package com.kh.spring22;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

//목표 : 결제 승인 테스트 (Test02를 반드시 먼저 실행한 뒤 해야함)
@Slf4j
@SpringBootTest
public class Test03 {

	@Test
	public void test() throws URISyntaxException {
		
		//데이터
		String partner_order_id = "f15c9253-20da-444f-9b06-244b3877c161";
		String partner_user_id = "addfc404-298d-471c-8c5c-c52e085ae12c";
		String tid = "T450a47641ce08910547";
		String pg_token = "17474a326e5102baaa0f";
		
		//전송 도구 생성
	    RestTemplate template = new RestTemplate();
	      
	    //주소 설정
	    URI uri = new URI("https://kapi.kakao.com/v1/payment/approve");
	    
	    //헤더 설정
	    HttpHeaders headers = new HttpHeaders();
	    headers.add("Authorization", "KakaoAK b6ff6593efe1b46d05ddaab6c1bf3bca");
	    headers.add("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
	    
	    //바디 설정
	    MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
	    body.add("cid", "TC0ONETIME");
	    body.add("partner_order_id", partner_order_id);
	    body.add("partner_user_id", partner_user_id);
	    body.add("tid", tid);
	    body.add("pg_token", pg_token); 

	    //헤더 + 바디
	    HttpEntity entity = new HttpEntity(body, headers);
	    
	    //요청 및 응답 저장 
	    Map response = template.postForObject(uri, entity, Map.class);
	    log.debug("response = {}", response);
	    
	      
	}
}
