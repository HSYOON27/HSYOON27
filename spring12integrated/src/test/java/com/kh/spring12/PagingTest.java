package com.kh.spring12;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring12.dao.MemberDao;

//Spring Test
//- 거대해지는 애플리케이션에서 단위 기능을 테스트하기 위해 사용하는 도구
//- ex:DAO를 개발하고 테스트하기 위해 컨트롤러까지 만드는게 맞는건가? 라는 의문에서 시작
//- JUnit이라는 원천 기술을 Spring Test로 래핑하여 사용
//- 클래스에 @SpringBootTest를 추가하면 Spring에 등록된 모든 도구 사용 가능 

@SpringBootTest
public class PagingTest {

	@Autowired
	private MemberDao memberDao;
		//JUnit에서는 테스트 하기 위해 만든 메소드에 @Test를 붙여야 한다.
		//- 접근 제한은 package 이상, 반환형 void, 매개변수가 없어야 한다.
	
	@Test
	public void test() {
		int count = memberDao.selectCount();
		System.out.println("count = " + count);
	}
}
