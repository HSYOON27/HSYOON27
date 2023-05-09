package com.kh.springhome.controller;

import java.util.Calendar;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "/WEB-INF/views/home.jsp";
	}
	
	/**
	 * 이 기능은 사용자가 "오늘 하루 광고 안보기"를 눌렀을 때 요청이 발생한다
	 * 여기서 해야 할 일은 noad라는 이름의 쿠키를 오늘 자정까지 유효하도록 생성
	 */
	@RequestMapping("/noad")
	@ResponseBody
	public void noAdvertise(HttpServletResponse response) {
		Calendar c = Calendar.getInstance();
		long current = c.getTimeInMillis();
		c.add(Calendar.DATE, 1);//1일 뒤
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		long tomorrow = c.getTimeInMillis();
		long gap = tomorrow - current;
		int second = (int)(gap / 1000);
		if(second < 30) return;//임의로 추가(30초 남았는데 해줘야돼?)
		
		Cookie cookie = new Cookie("noad", "");
		cookie.setMaxAge(second);
		response.addCookie(cookie);
	}
	
}