package com.kh.spring15;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;


//롬복이 로거도 생성해줌 
@Slf4j
@SpringBootTest
public class Test02 {

	//private static final Logger log = LoggerFactory.getLogger(Test02.class) 이게 숨어져 있는거임 롬복으로 자동생성
	
	@Test
	public void test() {
		log.debug("롬복은 참 좋은거 같아여");
		
		log.debug("10+20 = 30");
		
		int a = 10, b = 20, c = 30;
		
		log.debug(a + "+" + b + " = " + c);
		log.debug("{} + {} = {}", a, b, c);
	}
}
