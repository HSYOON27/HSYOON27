package array2;

import java.util.Scanner;

public class Test02_1 {

	public static void main(String[] args) {

		String[] names = new String[5]; //처음에 배열을 준비해놓고 
		Scanner sc = new Scanner(System.in); // 스캐너를 준비 
		
		for(int i = 0; i<names.length; i++) {
		System.out.print("이름을 입력하세요 : ");
		names[i] = sc.next();
		}
		
		sc.close();
		
		for(int i = 0; i<names.length; i++) {
		System.out.println("이름 : " + names[i]);
		}
		
		
		
	}
}
//사용자에게 이름 5개를 입력 받아서 저장하고 출력하는 프로그램을 구현 