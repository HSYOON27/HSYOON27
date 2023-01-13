package exception;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {

		//문제점 : 스캐너가 어떨때는 닫힘 어떨땐 안닫힘 오또케
		//원인 : 예외 발생 여부에 따라 close();가 실행이 될 수도 안 될수도 있으니까 아래에 보면 돼 
		Scanner sc = new Scanner(System.in);

		try {//문제 발생 예상지역 (플랜 A)
			System.out.println("금액 : ");
			int money = sc.nextInt();
			if(money <=0) {
				throw new Exception("금액은 0이하가 될 수 없습니다.");
			}
			
			System.out.println("인원 : ");
			int people = sc.nextInt();
			if(people <0) {
				throw new Exception("인원은 1보다 작을 수 없습니다.");
			}


			int result = money / people;
			int remain = money % people;

			System.out.println("1인당 " + result + "원");
			System.out.println("짜투리 " + remain + "원");
		} 
		//예외가 발생하면 반드시 예외 정보가 객체 형태로 전달된다.
		catch (Exception e) {
			e.printStackTrace();
			}
		finally {//예외 여부와 관계없이 무적권 실행되는 구문
			sc.close();
		}
		
		} 
		//문제점 : 스캐너가 어떨때는 닫힘 어떨땐 안닫힘 오또케
	}

