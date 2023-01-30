package com.kh.spring07.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuizController {

	@RequestMapping("/theater")
	@ResponseBody

	public String theater(@RequestParam(required = false, defaultValue = "0") int adultprice,
			@RequestParam(required = false, defaultValue = "0") int teenprice) {
		int total = 16000 * adultprice + 10000 * teenprice;
		return "총 요금은 = " + total;
	}

	@RequestMapping("/china")
	@ResponseBody // 내 얘기를 그대로 전달해라

	public String china(@RequestParam(required = false, defaultValue = "0") int jjajang,
			@RequestParam(required = false, defaultValue = "0") int champon) {
		int total = 6000 * jjajang + 7500 * champon;

		return "총 요금은 = " + total + "원 입니다.";
	}

	@RequestMapping("/bmi")
	@ResponseBody
	public String bmi(@RequestParam double height, @RequestParam double weight) {
		double m = height / 100;
		double total = weight / (m * m);
		return " BMI 지수는 = " + total + "입니다";
	}

	@RequestMapping("/subway")
	@ResponseBody
	public String subway(@RequestParam int birth) {
		int age = LocalDate.now().getYear() - birth + 1;
		int deposit = 500;
		if (age < 8 || age >= 65) {
			deposit += 0;
		} else if (age > 14 || age < 65) {
			deposit += 1250;
		} else if (age >= 14 || age <= 19) {
			deposit += 720;
		} else {
			deposit += 450;
		}
		return "나이 : " + age + " 요금 : " + deposit;
	}

	@RequestMapping("/pcroom")
	@ResponseBody
	public String pcroom(@RequestParam double start, @RequestParam double finish) {
		double pcchargeperminute = 1300 / 60;
		double price = (finish - start) * pcchargeperminute;
		return "총 요금은 = " + price + "입니다.";
	}

	@RequestMapping("/sum")
	@ResponseBody
	public String sum(@RequestParam int begin, @RequestParam int end) {
		int total = 0;
		for(int i = begin; i<= end; i++) {
			total +=i;
		}
		return begin + "~" + end + "총 합계 : " + total;
	}


	@RequestMapping("/score")
	@ResponseBody
	public String score(@RequestParam int korean, @RequestParam int english, @RequestParam int math) 
	{
		double average = (korean+english+math)/3.0;
		String s;		
		if(average >=60) { 
			if(korean>=40 && english >= 40 & math >= 40) {
			s = "합격";
		}
			else s = "불합격";
	}
		else s = "불합격";
		return s;
}
	@RequestMapping("/leap")
	@ResponseBody
	public String leap(@RequestParam int year) {
    	boolean leap1 = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0); 
    	
    	if(leap1) {
    	     return "해당 년도는 윤년입니다.";	
    	}
    	else {
    		return "해당 년도는 평년입니다.";
    	}
	}
}
