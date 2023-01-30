package com.kh.spring04.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//컨트롤러(Controller)
//- 홈페이지에서 사용자 접속을 처리하는 도구
//- 접속을 위한 주소가 있어야 한다. 	
//- (중요) 반드시 사용을 위해서 등록을 해야 한다. 어케해? @Controller 이렇게. 이건 명찰같은거 annotation : 주석
@Controller
public class HomeController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello!";
	}
	
	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "으으 자바 어려웡";
	}

	@RequestMapping("/dice")
	@ResponseBody
	public String dice() {
		Random r = new Random();
		int number = r.nextInt(6)+1;
		return "주사위 : " + number;
	}
	
}
