package com.kh.spring17;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring17.dto.SubjectDto;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class Test05 {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {

		SubjectDto dto = new SubjectDto();
		
		dto.setNo(101);

		sqlSession.delete("subject.delete", dto);
		
	}

}
