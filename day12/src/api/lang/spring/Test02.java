package api.lang.spring;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
	String a = new String("khacademy");
	String b = new String("student1234");
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("아이디를 입력하세요.");
	String id = sc.next();
	
	System.out.print("비밀번호를 입력하세요.");
	String password = sc.next();
	
	sc.close();
	
	if(a.equalsIgnoreCase(id)) {
		System.out.println("로그인 성공"); 
	}
	else System.out.println("로그인 실패");
	
	if(b.equals(password)) {
		System.out.println("로그인 성공");
	}
	else System.out.println("로그인 실패");
    }
}
