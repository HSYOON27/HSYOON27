package com.kh.spring17;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring17.dto.SubjectDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test07 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		SubjectDto dto = new SubjectDto();
		dto.setNo(61);
		dto.setName("라이츄");
		dto.setPrice(900000);
		int result = sqlSession.update("subject.editAllInOne", dto);
		log.debug("result = {}", result);
	}
	
	
}
