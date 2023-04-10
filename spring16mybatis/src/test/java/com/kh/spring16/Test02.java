package com.kh.spring16;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.dto.PocketmonDto;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class Test02 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		//목표 : pocketmon 단일 조회 구문을 불러서 조회 수행
		int no = 1;
		PocketmonDto dto = sqlSession.selectOne("pocketmon.selectOne", no);
		log.debug("dto={}", dto);

	}
}
