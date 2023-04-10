package com.kh.spring17;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring17.dto.SubjectDto;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class Test04 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		SubjectDto dto = new SubjectDto();
		
		dto.setNo(101);
		dto.setName("마이 바티스 과정");
		dto.setPeriod(60);
		dto.setPrice(1000000);
		dto.setType("오프라인");
		
		sqlSession.update("subject.update", dto);
	}
}
