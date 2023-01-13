package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test06 {
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
				throw new Exception("금액은 0이하가 될 수 없습니다.");
			//메시지도 넣을 수 있넹. 	
			}
			
			System.out.println("인원 : ");
			int people = sc.nextInt();
			if(people <0) {
				throw new Exception("인원은 1보다 작을 수 없습니다.");
			}

			sc.close();

			int result = money / people;
			int remain = money % people;

			System.out.println("1인당 " + result + "원");
			System.out.println("짜투리 " + remain + "원");
		} 
		//예외가 발생하면 반드시 예외 정보가 객체 형태로 전달된다.
		catch (Exception e) 
		{	
		    //System.err.println("오류가 발생했습니다.");
			//System.out.println(e); //예외 객체 
		    //System.out.println(e.getCause());//예외 클래스 정보
		    //System.out.println(e.getMessage());//예외 원인(없으면 null)
			if(e.getMessage() != null) {
				System.err.println(e.getMessage());
			}
			else {
				System.err.println("오류가 발생했습니다.");
			}
		} 
		//문제점 : 개발자는 원래 발생하던 예외 메세지를 보고 싶어한다. 
	}
}
