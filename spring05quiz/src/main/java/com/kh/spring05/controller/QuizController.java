package com.kh.spring05.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class QuizController {
	@RequestMapping("/lotto")
	@ResponseBody
	public String lotto() {
		Random r = new Random();
		int lottery = r.nextInt(45)+1;
		return "로또번호 : " + lottery;
	}
	
		
	@RequestMapping("/otp")
	@ResponseBody
	public String otp() {
		Random r1 = new Random();	
		int otp1 = r1.nextInt(900000)+100000;
		return "otp 번호 : " + otp1;
	}
 
}
