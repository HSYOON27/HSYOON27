package exception;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {

		// 문제점 : close() 좀 자동으로 해주면 안되나..?
		// Java 8+부터 등장(try-resource)

		try (Scanner sc = new Scanner(System.in);) {
			System.out.println("금액 : ");
			int money = sc.nextInt();
			if (money <= 0) {
				throw new Exception("금액은 0이하가 될 수 없습니다.");
			}

			System.out.println("인원 : ");
			int people = sc.nextInt();
			if (people < 0) {
				throw new Exception("인원은 1보다 작을 수 없습니다.");
			}

			int result = money / people;
			int remain = money % people;

			System.out.println("1인당 " + result + "원");
			System.out.println("짜투리 " + remain + "원");
		}

		catch (Exception e) {
			e.printStackTrace();
		} 

	}
}
