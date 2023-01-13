package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

		// 1000원, 천원, 1명, 열명, 1.5
		// 문제 발생 상황
		// 1. 실수 입력 시 = java.util.InputMismatchException 발생
		// 2. 한글 입력 시 = java.util.InputMismatchException 발생
		// 3. 영어 입력 시 = java.util.InputMismatchException 발생
		// 4. 인원이 0명일 경우 = java.lang.ArithmeticException 발생
		// 5. 너무 큰 숫자를 입력하는 경우 = java.util.InputMismatchException 발생
		// 결론적으로 이 프로그램에서 파악한 문제의 종류는 2종류이다.
		// 1,2,3,5는 입력이 잘못된 경우
		// 4는 나눗셈이 잘못된 경우

		try {
			// 문제가 발생하리라고 예상되는 지역(플랜A)

			Scanner sc = new Scanner(System.in);
			System.out.println("금액 : ");
			int money = sc.nextInt();
			System.out.println("인원 : ");
			int people = sc.nextInt();

			sc.close();

			int result = money / people;
			int remain = money % people;

			System.out.println("1인당 " + result + "원");
			System.out.println("짜투리 " + remain + "원");
		} 
		catch (InputMismatchException e) {// 입력이 잘못되었을때의 플랜B
			System.err.println("입력을 똑바로 하세염.");
		} 
		catch (ArithmeticException e) {// 나누기가 잘못되었을때의 플랜B
			System.err.println("인원수는 0일 수 없습니다.");
		}
		
		//문제점 
		//- 오류가 정말 2개 뿐이야?? 
		//- RuntimeException 얘로 다 커버 가능
		
	}
}
