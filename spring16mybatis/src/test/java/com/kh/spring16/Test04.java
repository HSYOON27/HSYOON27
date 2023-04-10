package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.dto.PocketmonDto;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class Test04 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		PocketmonDto dto = new PocketmonDto();
		dto.setNo(2);
		dto.setName("성현리갱긴리");
		dto.setType("왕근육");
		
		sqlSession.update("pocketmon.edit", dto);
	}
}
