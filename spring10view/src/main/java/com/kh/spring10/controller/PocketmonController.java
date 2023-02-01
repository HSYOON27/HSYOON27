package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.spring10.dao.PocketmonDao;
import com.kh.spring10.dto.PocketmonDto;

@Controller
@RequestMapping("/pocketmon")
public class PocketmonController {
	// 아래와 같은 코드는 더이상 사용하지 않음. 고깃집 가서 본인이 불판 가져오고 하는격(스프링 거치지 않고 객체생성)
	// private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	// 이미 스프링에 생성되어 등록된 요소(spring bean)를 달라고 부탁해야 한다.
	// - 만약 등록되지 않은 요소를 달라고 했다면 당연히 오류가 발생.
	// - 내가 만든 도구들도 등록만 되어 있다면 주세요가 가능하다.
	// - 주세요를 DI(Dependency Injection, 의존성 주입) 이라고 부른다.
	@Autowired
	private PocketmonDao dao;
	
	@RequestMapping("/insert")
	@ResponseBody
	public String insert(@ModelAttribute PocketmonDto dto) {
		dao.insert(dto);
		return "등록 완료";
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public String list() {
		List<PocketmonDto> list = dao.selectList();
		
		StringBuffer buffer = new StringBuffer();
		for(PocketmonDto dto : list) {
			buffer.append(dto.toString());
			buffer.append("<br>");//줄바꿈
		}
		return buffer.toString();
	}
	
	@RequestMapping("/search")
	@ResponseBody
	public String search(@RequestParam String column, 
									@RequestParam String keyword) {
		List<PocketmonDto> list = dao.selectList(column, keyword);
		
		StringBuffer buffer = new StringBuffer();
		for(PocketmonDto dto : list) {
			buffer.append(dto.toString());
			buffer.append("<br>");//줄바꿈
		}
		return buffer.toString();
	}
	
	//목록 & 검색 통합 페이지
	@RequestMapping("/all-in-one")//주소에는 대시(-)를 사용할 수 있다
	@ResponseBody
	public String allInOne(
		@RequestParam(required = false, defaultValue = "name") String column,
		@RequestParam(required = false, defaultValue = "") String keyword) {
		boolean search = !keyword.equals("");
		
		List<PocketmonDto> list;
		if(search) {
			list = dao.selectList(column, keyword);
		}
		else {
			list = dao.selectList();
		}
		
		StringBuffer buffer = new StringBuffer();
		for(PocketmonDto dto : list) {
			buffer.append(dto.toString());
			buffer.append("<br>");//줄바꿈
		}
		return buffer.toString();
	}
	
	//상세 페이지
	@RequestMapping("/detail")
	@ResponseBody
	public String detail(@RequestParam int no) {
		PocketmonDto dto  = dao.selectOne(no);
		
		if(dto == null) {
			return "없어";
		}
		else {
			return dto.toString();
		}
	}

	//수정 페이지
	@RequestMapping("/edit")
	@ResponseBody
	public String edit(@ModelAttribute PocketmonDto dto) {
		boolean success = dao.update(dto);

		if(success) {
			return "변경 완료";
		}
		else {
			return "대상 없음";
		}
	}

	//삭제 페이지
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(@RequestParam int no) {
		boolean success = dao.delete(no);

		if(success) {
			return "삭제 완료";
		}
		else {
			return "대상 없음";
		}
	}
}