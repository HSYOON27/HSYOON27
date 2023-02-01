package com.kh.spring09.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.spring09.dao.MemberDao;
import com.kh.spring09.dto.MemberDto;

@Controller
@RequestMapping("/member") //공용주소
public class MemberController {
	@Autowired
	private MemberDao dao;
	
	@RequestMapping("join") //맾핑주소 
	@ResponseBody
	public String join(@ModelAttribute MemberDto dto) {
		dao.join(dto);
		return "등록완료";
	}
}
