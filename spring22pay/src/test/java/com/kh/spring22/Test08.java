package com.kh.spring22;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.kh.spring22.vo.KakaoPayReadyResponseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test08 {

	
	@Test
	public void test() {
		//기본 주소를 지정하여 생성
//		WebClient client = WebClient.create("https://kapi.kakao.com");

		//헤더까지 지정하여 생성
		WebClient client = WebClient.builder()
					.baseUrl("https://kapi.kakao.com")
					.defaultHeader("Authorization", "KakaoAK b6ff6593efe1b46d05ddaab6c1bf3bca")
					.defaultHeader("Content-type", "application/x-www-form-urlencoded;charset=utf-8")
				.build();
		
		//client를 이용하여 요청 및 수신을 할대 클래스를 지정하여 처리할 수 있다.
		//- form-data와 JSON중에서 보내는 유형을 선택할 수 있다. 
		//- JSON은 클래스 자동변환을 제공함 
		//- form-data는 MultiValueMap 또는 별도의 등록 클래스를 사용해야 함
		 MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
	      body.add("cid", "TC0ONETIME");
	      body.add("partner_order_id", UUID.randomUUID().toString());
	      body.add("partner_user_id", UUID.randomUUID().toString());
	      body.add("item_name", "최신형 맥북");
	      body.add("quantity", "1");
	      body.add("total_amount", "888000");
	      body.add("tax_free_amount", "0");
	      body.add("approval_url", "http://localhost:8080/test1/success");
	      body.add("cancel_url", "http://localhost:8080/cancel");
	      body.add("fail_url", "http://localhost:8080/fail");
	      
	      
	      KakaoPayReadyResponseVO response = client.post()
	            .uri("/v1/payment/ready")
	            .bodyValue(body)
	            .retrieve()
	            .bodyToMono(KakaoPayReadyResponseVO.class)
	            .block();
	      log.debug("response={}",response);
	      
	      
	   }
	   
	}