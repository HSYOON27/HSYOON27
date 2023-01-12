package api.lang.spring;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("생년월일을 입력하세요.ex)1900-01-01");
		String birth = sc.nextLine();
		sc.close();
		
		String regex = "^(19[0-9][0-9]|20[0-9][0-9])-(0[0-9]|1[0-2])-(0[0-9]|[1-2][0-9]|3[0-1])$";

		if(Pattern.matches(regex, birth)) {
			System.out.println("올바른 생년월일 입니다.");
		}
		else System.out.println("틀린 생년월일 입니다.");
		
	}

}
