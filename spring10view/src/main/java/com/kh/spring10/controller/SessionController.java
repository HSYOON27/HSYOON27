package com.kh.spring10.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/session")
public class SessionController {
	
	/*
	  	HttpSession
	  	- 사용자가 최초 접속하면 자동으로 사용자에게 할당되는 저장공간
	 	- 서버가 사용자를 구분하는 척도(세선 ID를 기반으로 구분한당)
	 	- [컨트롤러]에서 선언만 하면 사용이 가능. 컨트롤러 에서만 가능함. 
		- 세션에 데이터를 추가하면 해당 사용자(브라우저)에서만 유효
		- 일정 시간동안 아무런 접속이 없는 세션은 소멸된다. (기본값 30분, 조절가능)
		- 세션은 key=value 저장소(모델이랑 똑같다는 소리)
		- 설정 : session.setAttribute(key, value)
		- 삭제 : session.removeAttribute(key)
		- 확인 : session.getAttribute(key) ---> value가 나옴 
		
		- 로그인이라 함은 사용자의 어떤 정보를 세션에 넣어두는 행위를 말함니당. 그치.
		- 로그아웃은 사용자의 어떤 정보를 세션에서 삭제하는 행위.
		
	 */
	
	@GetMapping("/home")
	public String home(HttpSession session) {
		System.out.println("세션 ID - " + session.getId());
		System.out.println("Academy = " + session.getAttribute("academy"));
		return "/WEB-INF/views/session/home.jsp";
	}
	@GetMapping("/set")
	public String set(HttpSession session) {
		System.out.println("세션 ID - " + session.getId());
		session.setAttribute("academy", "KH정보교육원");
		return "redirect:home";
	}
	
	@GetMapping("/remove")
	public String remove(HttpSession session) {
		System.out.println("세션 ID - " + session.getId());
		session.removeAttribute("academy");
		return "redirect:home";
	}
}
