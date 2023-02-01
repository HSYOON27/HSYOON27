package com.kh.spring11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.spring11.dao.SubjectDao;
import com.kh.spring11.dto.SubjectDto;

@Controller
public class SubjectController {

	// 등록
	@Autowired
	private SubjectDao dao;

	@RequestMapping("/subject/insert")
	@ResponseBody
	public String insert(@ModelAttribute SubjectDto dto) {
		dao.insert(dto);
		return "등록 완료";
	}
// 등록 완료 후 텍스트 메시지가 아니라 다른곳으로 보내고 싶다면,
// 사용자에게 재접속을 요청하도록 처리할 수 있다.(Redirect, 리다이렉트)
// @ResponseBody 제거하고 redirect:로 시작하는 문자열을 반환한다
// @RequestMapping("/subject/insert")
// public String insert(@ModelAttribute SubjectDto dto) {
// dao.insert(dto);
// return "redirect:list"; //상대경로	
// return "redirect:/subject/list"; //절대경로 
	
	// 목록&검색 통합페이지
	@RequestMapping("/subject/list")
	@ResponseBody
	public String list(@RequestParam(required = false, defaultValue = "name") String column,
			@RequestParam(required = false, defaultValue = "") String keyword) {
		boolean search = !keyword.equals("");

		List<SubjectDto> list;
		if (search) {
			list = dao.selectList(column, keyword);
		} else {
			list = dao.selectList();
		}
		StringBuffer buffer = new StringBuffer();
		for (SubjectDto dto : list) {
			buffer.append(dto.toString());
			buffer.append("<br>");
		}
		return buffer.toString();
	}

	// 상세 페이지
	@RequestMapping("/subject/detail")
	@ResponseBody
	public String detail(@RequestParam int no) {
		SubjectDto dto = dao.selectOne(no);

		if (dto == null) {
			return "없어";
		} else {
			return dto.toString();
		}
	}

	// 수정 페이지
	@RequestMapping("/subject/edit")
	@ResponseBody

	public String edit(@ModelAttribute SubjectDto dto) {
		boolean success = dao.update(dto);

		if (success) {
			return "변경 완료";
		} else {
			return "대상 없음";
		}
	}

	// 삭제 페이지
	@RequestMapping("/subject/delete")
	@ResponseBody
	public String delete(@RequestParam int no) {
		boolean success = dao.delete(no);

		if (success) {
			return "삭제 완료";
		} else {
			return "대상 없음";
		}
	}

}
