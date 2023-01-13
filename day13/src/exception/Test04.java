package exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test04 {

	public static void main(String[] args) {
		
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("생년월일을 입력하세요 ex) 1990-02-27 ");
		String birth = sc.nextLine();
		sc.close();
		
		String regex = "^(19[0-9][0-9]|20[0-9][0-9])-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1])$";
        
		if(Pattern.matches(birth, regex));{
			System.out.println("생년월일" + birth);
		}
		}
		catch(Exception e){
			System.out.println("잘못된 날짜 입력으로 계산이 불가합니다.");
		}

	}

}
