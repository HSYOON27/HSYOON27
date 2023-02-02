package com.kh.spring11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	//대문 페이지 - 클라이언트의 최초 진입점(welcome-page), 가장 짧은 주소
		@RequestMapping("/")
		public String home() {
			return "/WEB-INF/views/home.jsp";
		}
	}

