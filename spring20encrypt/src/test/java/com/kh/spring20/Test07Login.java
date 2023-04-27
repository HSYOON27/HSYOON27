package com.kh.spring20;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring20.dto.SecurityDto;
import com.kh.spring20.repo.SecurityRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test07Login {

	@Autowired
	private SecurityRepo securityRepo;

	@Test
	public void test( ) {
		SecurityDto dto = new SecurityDto();
		dto.setMemberId("kots5244");
		dto.setMemberPw("dbsgudtjr!");

		boolean result = securityRepo.login(dto);
		log.debug("result={}", result);
	}

}
