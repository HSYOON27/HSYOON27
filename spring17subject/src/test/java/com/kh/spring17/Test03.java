package com.kh.spring17;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring17.dto.SubjectDto;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class Test03 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		SubjectDto dto = new SubjectDto();
		
		dto.setName("마이 바티스 과정");
		dto.setPeriod(60);
		dto.setPrice(1000000);
		dto.setType("온라인");
		
		sqlSession.insert("subject.submit", dto);
		
	}
}
