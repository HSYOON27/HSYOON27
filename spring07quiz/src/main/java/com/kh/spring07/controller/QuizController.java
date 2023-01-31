package com.kh.spring07.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String pcroom(@RequestParam int start, @RequestParam int finish) {
		int inHour = start/100, inMinute= start % 100;
		int outHour = finish / 100, outMinute = finish % 100;
		int time = Math.abs((inHour*60+inMinute) - (outHour*60+outMinute));
		double pricePerMinute = 1300/60.0;
		int price = (int)(time *pricePerMinute) /100 * 100;
		return "이용요금 =" +price;
	}

	@RequestMapping("/sum")
	@ResponseBody
	public String sum(@RequestParam int begin, @RequestParam int end) {
		int total = 0;
		for (int i = begin; i <= end; i++) {
			total += i;
		}
		return begin + "~" + end + "총 합계 : " + total;
	}

	@RequestMapping("/score")
	@ResponseBody
	public String score(@RequestParam int korean, @RequestParam int english, @RequestParam int math) {
		double average = (korean + english + math) / 3.0;
		String s;
		if (average >= 60) {
			if (korean >= 40 && english >= 40 & math >= 40) {
				s = "합격";
			} else
				s = "불합격";
	     	} else
			    s = "불합격";
		return s;
	}

	@RequestMapping("/leap")
	@ResponseBody
	public String leap(@RequestParam int year) {
		boolean leap1 = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

		if (leap1) {
			return "해당 년도는 윤년입니다.";
		} else {
			return "해당 년도는 평년입니다.";
		}
	}
	
	//파라미터가 너무 많거나 의미가 있는 데이터인 경우 
	//-> 이런 경우 클래스를 만들어 필드를 원하는 형태로 구성한 뒤 자동 수신을 부탁한다.
	//-> @ModelAttribute를 사용 
	//-> 파라미터를 강제하기 어려움(추가 검사 및 예외처리가 필요)
	
	//ex : 학생 정보(이름, 점수)
	@RequestMapping("/student")
	@ResponseBody
	//public String student(@RequestParam String name, @RequestParam int score) {
	
	public String student(@ModelAttribute(binding = false) Student stu) {
		return "받은 데이터 : " + stu.toString();
	}
}


