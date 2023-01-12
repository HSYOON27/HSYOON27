package api.lang.spring;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {

		
	Scanner sc = new Scanner(System.in);
	System.out.print("이름을 입력하세요 : ");
	String name = sc.nextLine();
	
	sc.close();
	
	String[] en = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"
			,"q","r","s","t","u","v","w","x","y","z"};
	String[] kr = new String[] {"ㄱ","ㄴ","ㄷ","ㄹ","ㅁ","ㅂ","ㅅ","ㅇ","ㅈ","ㅊ","ㅍ","ㅌ","ㅎ","ㄲ","ㄸ","ㅃ"
			,"ㅆ","ㅉ","ㅏ", "ㅑ", "ㅓ", "ㅕ", "ㅗ", "ㅛ", "ㅜ", "ㅠ", "ㅡ", "ㅣ","ㅐ", "ㅒ", "ㅔ", "ㅖ",
			"ㅘ", "ㅙ", "ㅚ", "ㅝ", "ㅞ", "ㅟ", "ㅢ"};
	
	for(int i=0; i<en.length; i++) {
	if((name.length()<3) || (name.length()>7)) {
		System.out.println("닉네임의 길이는 2~7 글자 사이로 정해주세요");
	}
	else if(name.contains(en[i])){
		System.out.println("영문 입력은 안됩니다.");
	}
	else if(name.contains(kr[i])){
		System.out.println("자음 입력은 안됩니다.");
	}
	}
	System.out.println("아이디가 생성되었습니다.");

	}
}
	

