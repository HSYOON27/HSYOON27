package com.kh.spring21.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.spring21.dto.MemberDto;
import com.kh.spring21.repo.MemberRepo;

@Controller
@RequestMapping("/view")
public class ViewController {
	
	@GetMapping("/basic")
	public String basic() {
		//return "/WEB-INF/views/basic.jsp";
		return "basic";
	}
	
	@GetMapping("/chat")
	public String chat() {
		return "chat";
	}
	
	@GetMapping("/sockjs")
	public String sockjs() {
		//return "/WEB-INF/views/sockjs.jsp";
		return "sockjs";
	}
	
	@GetMapping("/json")
	public String json() {
		//return "WEB-INF/views/json.jsp";
		return "json";
	}
	
	@GetMapping("/")
	public String home() {
		//return "/WEB-INF/views/home.jsp";
		return "home";
	}

	@Autowired
	private MemberRepo memberRepo;

	@PostMapping("/login")
	public String login(
				@ModelAttribute MemberDto memberDto,//사용자가 입력한 정보
				HttpSession session
			) {
		MemberDto findDto = memberRepo.login(memberDto);
		if(findDto != null) {//로그인 성공
			session.setAttribute("memberId", findDto.getMemberId());
			session.setAttribute("memberLevel", findDto.getMemberLevel());
		}
		return "redirect:/view/";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("memberId");
		session.removeAttribute("memberLevel");
		return "redirect:/view/";
	}
	
	@GetMapping("/member")
	public String member() {
		//return "/WEB-INF/views/member.jsp";
		return "member";
	}
	
	@GetMapping("/vuemember")
	public String vuemember() {
		//return "/WEB-INF/views/member.jsp";
		return "vuemember";
	}
	
	@GetMapping("/channel1")
	public String channel1() {
		//return "/WEB-INF/views/member.jsp";
		return "channel1";
	}
	
}