package array2;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		String[] names = new String[5]; //처음에 배열을 준비해놓고 
		Scanner sc = new Scanner(System.in); // 스캐너를 준비 
		
		System.out.print("이름을 입력하세요 : ");
		names[0] = sc.next();
		System.out.print("이름을 입력하세요 : ");
		names[1] = sc.next();
		System.out.print("이름을 입력하세요 : ");
		names[2] = sc.next();
		System.out.print("이름을 입력하세요 : ");
		names[3] = sc.next();
		System.out.print("이름을 입력하세요 : ");
		names[4] = sc.next();
		
		
		sc.close();
		
		System.out.println("이름 : " + names[0]);
		System.out.println("이름 : " + names[1]);
		System.out.println("이름 : " + names[2]);
		System.out.println("이름 : " + names[3]);
		System.out.println("이름 : " + names[4]);
		
		
		
		
	}
}
//사용자에게 이름 5개를 입력 받아서 저장하고 출력하는 프로그램을 구현 