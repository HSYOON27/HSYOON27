package oop.keyword7;

import java.time.LocalDate;

public class Calculator {
	
	//1. 11의 제곱
	public static int square(int a1) {
		return a1*a1; 
	}
	
	//2. 신장 180cm, 체중 80kg의 bmi구하기 
	public static double bmi(double height, double weight) {
		double heightMeter = height / 100; //m2이니까
		return weight/(heightMeter * heightMeter);
	}
	
    //4. 밑변 5, 높이 7인 삼각형의 넓이 
	public static double triangle(double width, double height) {
		return (width*height)/2;
	}
	
	//5. 원의 넓이 반지름 7인거 
	public static double one(double radius) {
		return (radius*radius)*(3.14);
	}
	
	//3. 1999년생의 지하철 요금 
	public static int fare(int year) {

		int age = LocalDate.now().getYear()-year+1;
		if(age >= 65) return 0;
		if(age >= 20) return 1250;
		if(age >= 14) return 720;
		else return 450;
	}
}
