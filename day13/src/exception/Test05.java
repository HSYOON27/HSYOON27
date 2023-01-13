package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {

		//문제점 
		//1. 개발자는 문제라고 생각하는데 자바는 문제가 아니라고 생각하는 경우.
		//2. 예외가 여러 종류가 발생하는데 구분할 수 있는 방법이 있나요?.
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("금액 : ");
			int money = sc.nextInt();
			if(money <=0) {//자바가 강제하지 못하는 예외 상황
				//Exception ex = new Exception();
			//	throw ex; 
				throw new Exception();
				
			}
			
			System.out.println("인원 : ");
			int people = sc.nextInt();
			if(people <0) {
				throw new Exception();
			}

			sc.close();

			int result = money / people;
			int remain = money % people;

			System.out.println("1인당 " + result + "원");
			System.out.println("짜투리 " + remain + "원");
		} 
		catch (Exception e) 
		{	
		System.out.println("오류가 발생했습니다.");
		} 
		
	}
}
