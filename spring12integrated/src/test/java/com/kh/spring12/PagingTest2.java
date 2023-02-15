package com.kh.spring12;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring12.dao.MemberDao;
import com.kh.spring12.vo.PaginationVO;

//테스트를 하려면 반드시 목표가 목적이가 있어야 한당. 
//목표 : 페이지 번호, 크기, 검색항목, 키워드, 데이터 수를 알려주면, 
//자동으로 불러와야 하는 데이터의 행 번호와 하단에 표시될 블록번호를 계산하는 도구를 개발하고 싶음.

@SpringBootTest
public class PagingTest2 {
	
	@Test
	public void test() {
		PaginationVO vo = new PaginationVO();
		vo.setPage(151);
		vo.setSize(10);
		vo.setCount(1201);
		
		System.out.println(vo.getBegin()); //시작 행 번호
		System.out.println(vo.getEnd()); //종료 행번호 
		System.out.println(vo.getCount()); //총 글의 갯수
		System.out.println(vo.getStartBlock());
		System.out.println(vo.getFinishBlock());
		System.out.println(vo.getTotalPage());
		System.out.println("처음?" + vo.isFirst());
		System.out.println("마지막" + vo.isLast());
		//전체 페이지 수
		//시작 블록번호
		//종료 블록번호 
	
	}
}
