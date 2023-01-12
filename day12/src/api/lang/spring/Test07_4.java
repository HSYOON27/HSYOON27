package api.lang.spring;

import java.util.regex.Pattern;

public class Test07_4 {
	public static void main(String[] args) {

		String name = "안녕123";
		
		String regex = "^[가-힣]{2,7}$";
		
		if(Pattern.matches(regex, name)) {
			System.out.println("올바른 이름");
		}
		else {
			System.out.println("잘못된 이름");
		}
	
	}
}

