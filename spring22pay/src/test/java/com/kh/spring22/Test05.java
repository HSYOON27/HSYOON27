package com.kh.spring22;

import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring22.service.KakaoPayService;
import com.kh.spring22.vo.KakaoPayApproveRequestVO;
import com.kh.spring22.vo.KakaoPayApproveResponseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test05 {

	@Autowired
	private KakaoPayService kakaoPayService;

	@Test
	public void test( ) throws URISyntaxException {

		KakaoPayApproveRequestVO vo = new KakaoPayApproveRequestVO();
		vo.setPartner_order_id("33aeea01-4183-4e0a-8fc3-e9883e072c24");
		vo.setPartner_user_id("574bb4f6-64a5-49bc-a6a1-a97155fd2beb");
		vo.setTid("T451dff65b8c2c02b8b6");
		vo.setPg_token("86d72adfb4a2fc4b4017");

		KakaoPayApproveResponseVO response = kakaoPayService.approve(vo);
		log.debug("response = {}", response);
	}

}