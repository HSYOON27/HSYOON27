package api.lang.spring;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		//닉네임 검사 
	Scanner sc = new Scanner(System.in);
	System.out.println("닉네임을 입력하세요.");
	String nickname = sc.next();
	sc.close();
	
	
	if((nickname.length()<3) || (nickname.length()>10)) {
		System.out.println("닉네임의 길이는 2~10 글자 사이로 정해주세요");
	}
	else if (nickname.contains("운영자")) {
		System.out.println("해당 닉네임은 생성할 수 없습니다.");
	}
	else System.out.println("닉네임이 " + nickname +"(으)로 설정 되었습니다.");
	}
}
