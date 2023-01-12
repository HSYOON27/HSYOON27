package api.lang.spring;

import java.util.regex.Pattern;

public class Test08 {
	public static void main(String[] args) {
		
		String id = "azzaazza123";
		String regex = "^[a-z][a-z_0-9]{7,19}$";
		
		if(Pattern.matches(regex, id)) {
			System.out.println("올바른 이름");
		}
		else {
			System.out.println("잘못된 이름");
		}
	}
	

}
