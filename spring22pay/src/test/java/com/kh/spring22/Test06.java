package com.kh.spring22;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring22.service.KakaoPayService;
import com.kh.spring22.vo.KakaoPayOrderRequestVO;
import com.kh.spring22.vo.KakaoPayOrderResponseVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test06 {

	@Autowired
	private KakaoPayService kakaoPayService;
	
	@Test
	public void test() throws URISyntaxException {
		KakaoPayOrderRequestVO vo = new KakaoPayOrderRequestVO();
		vo.setTid("T451dff65b8c2c02b8b6");
		
		KakaoPayOrderResponseVO response = kakaoPayService.order(vo);
		
		log.debug("response={}", response);
		
	}
}
