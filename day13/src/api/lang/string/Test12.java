package api.lang.string;

import java.util.regex.Pattern;

public class Test12 {
	public static void main(String[] args) {
		//목표 : 비밀번호 검사식 만들기 
		//- 반드시 1개 이상 포함(대,소,숫,특)이라는걸 어떻게 구현할까?(긍정 탐색)
		
		String password = "asdfQWER!@#$1234";

		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z!@#$0-9]{8,16}$";
		
	
		
		if(password.matches(regex)) {
			System.out.println("올바른 비번 입니다.");
		}
		else {
			System.out.println("잘못된 비번 입니다");
			
		}
 	}

}
