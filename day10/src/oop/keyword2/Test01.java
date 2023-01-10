package oop.keyword2;

import java.util.Scanner;
//메인에 입력값을 넣어야 하는 이유 

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String password = sc.next();
		sc.close();
		
		Member m = new Member(id, password);
		
		m.output();
	}

}
	