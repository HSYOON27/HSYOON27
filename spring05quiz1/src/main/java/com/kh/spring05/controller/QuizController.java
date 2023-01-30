package com.kh.spring05.controller;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuizController {
	@RequestMapping("/lotto")
	@ResponseBody
	public int lotto() {
		Random r = new Random();
		int n = r.nextInt(45)+1;
		return n;
	}
	
	@RequestMapping("/lotto3")
	@ResponseBody
	public String lotto3(){
		Set<Integer> numbers = new TreeSet<>();
		Random r = new Random();
		while(numbers.size()<6) {
			numbers.add(r.nextInt(45)+1);
		}
		StringBuffer buffer = new StringBuffer();
		for(int number : numbers) {
			buffer.append("번호 = " + number);
			buffer.append("\n");
		}
		return buffer.toString();
	}
	
	@RequestMapping("/otp")
	@ResponseBody
	public String otp() {
		Random r = new Random();
		int number = r.nextInt(1000000);
		Format f = new DecimalFormat("000000");
		return "otp = " + f.format(number);
		
	}
}
