package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {

		//문제점 
		//- 오류가 정말 2개 뿐이야?? 
		//- 장담할 수 없으므로 "통합 처리" 하는 방향으로 가야대
		//
		
		try {
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
		//catch (RuntimeException e) {
		catch (Exception e) //얘로 최종선택!! 앞으로 모든 예외를 통합할 때 사용!  
		//catch(Throwable e)  //가장 높은 단위의 예외는 Throwable임. 근데 얘를 쓰진 않음. 왜? Error 때문에.
		{	
		System.out.println("오류가 발생했습니다.");
		} 
		
	}
}
