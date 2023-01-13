package api.lang.string;

import java.util.regex.Pattern;

public class Test11 {
	public static void main(String[] args) {
		//목표 : 비밀번호 검사식 만들기 
		//- 반드시 1개 이상 포함(대,소,숫,특)이라는걸 어떻게 구현할까?(긍정 탐색)
		
		String password = "asdfQWER!@#$1234";
		
		int lower=0, upper=0, number=0, special=0;
		
		for(int i=0; i<password.length(); i++) {
			char ch = password.charAt(i);
			//System.out.println(ch);
			
			if(ch >= 'A' && ch <='Z') {//대문자라면
			    upper++;
			}
			else if(ch >= 'a' && ch <='z') {//소문자라면
				lower++;
			}
			else if(ch >= '0' && ch <= '9') {//숫자라면
				number++;
			}
			else if(ch == '!'|| ch == '@'|| ch == '#'|| ch == '$') {//특수문자라면
				special++;
			}
		}
		String regex = "^[A-Za-z!@#$0-9]{8,16}$";
		
		boolean must = lower > 0 && upper >0 && number>0 && special > 0;
		
		if(password.matches(regex) && must) {
			System.out.println("올바른 비번 입니다.");
		}
		else {
			System.out.println("잘못된 비번 입니다");
			
		}
 	}

}
