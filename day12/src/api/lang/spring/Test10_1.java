package api.lang.spring;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test10_1 {
	public static void main(String[] args) {
		
		//날짜 검사 프로그램 
		String connector = "/";  //(이런식으로 낑굴수도 있긴함)
		
		String day = "2000-02-29";
		String year = day.substring(0,4);
		System.out.println(year);
		
		int yearValue = Integer.parseInt(year);
		System.out.println(yearValue);
		
		
	}

}
