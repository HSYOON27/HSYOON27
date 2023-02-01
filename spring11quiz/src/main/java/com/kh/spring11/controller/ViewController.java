package com.kh.spring11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/view")
public class ViewController {

	@RequestMapping("/subject")
    public String test01() {
	   return "/WEB-INF/views/test01.jsp";  
	}
	
	@RequestMapping("/student")
	public String test02() {
	   return "/WEB-INF/views/test02.jsp";
	}
  
}
