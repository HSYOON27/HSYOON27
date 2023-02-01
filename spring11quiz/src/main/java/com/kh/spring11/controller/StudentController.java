package com.kh.spring11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.spring11.dao.StudentDao;
import com.kh.spring11.dto.StudentDto;

@Controller
public class StudentController {

	@Autowired
	private StudentDao dao;
	@RequestMapping("/student/insert")
	@ResponseBody
	public String insert(@ModelAttribute StudentDto dto) {
		dao.insert(dto);
		return "등록 완료";
	}
	
	//목록&검색 통합페이지
	@RequestMapping("/student/list")
	@ResponseBody
	public String list(@RequestParam(required=false, defaultValue="name") String column,
			@RequestParam(required=false, defaultValue="")String keyword) {
		boolean search = !keyword.equals("");
		
		List<StudentDto> list;
		if(search) {
			list = dao.selectList(column, keyword);
		}
		else {
			list = dao.selectList();
		}
		StringBuffer buffer = new StringBuffer();
		for(StudentDto dto : list) {
			buffer.append(dto.toString());
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	
	//상세 페이지
	@RequestMapping("/student/detail")
	@ResponseBody
	public String detail(@RequestParam int no) {
		StudentDto dto = dao.selectOne(no);
		
		if(dto==null) {
			return "없어";
		}
		else {
			return dto.toString();
		}
	}
	//수정 페이지
		@RequestMapping("/student/edit")
		@ResponseBody
		
		public String edit(@ModelAttribute StudentDto dto) {
		boolean success =	dao.update(dto);
		
		if(success) {
			return "변경 완료";
		}
		else {
			return "대상 없음";
		}
		}
	
	//삭제 페이지 
		@RequestMapping("/student/delete")
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
