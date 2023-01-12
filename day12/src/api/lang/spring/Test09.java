package api.lang.spring;

import java.util.regex.Pattern;

public class Test09 {
	public static void main(String[] args) {
		
		String number = "010-505-1973";
		String regex = "^01[016-9]-[0-9]{3,4}-[0-9]{4}$";
		
		if(Pattern.matches(regex, number)) {
			System.out.println("올바른 번호입니다.");
		}
		else System.out.println("올바른 번호가 아닙니다.");
				
	}

}
