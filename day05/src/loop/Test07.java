package loop;

import java.util.Scanner;

public class Test07 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("첫날 개수를 입력하세요");
	int pushup = sc.nextInt();
	
	System.out.println("증가 폭을 입력하세요");
	int plus = sc.nextInt();
	
	System.out.println("기간을 입력하세요");
	int period = sc.nextInt();
	
	sc.close();
	 
	int pushupSum = pushup;
	for(int i = 1; i<=period; i++) {
		System.out.println(i+"일 : "+pushup+"개");
		pushupSum += pushup;
		pushup += plus;
	}
	System.out.println("총 pushup 개수 : "+pushupSum);
}}
//Test07 새해 맞이 다이어트 계획을 세웁니다. 
//돈 안들이고 할 수 있는 푸쉬업을 30일 동안 체계적으로 해보려고 합니다.
//첫날은 5개 둘째날은 전날보다 2개씩 개수를 늘림. 
//1. 일자별로 하게되는 푸쉬업 개수를 구하여 출력
//2. 30일 동안 하게되는 모든 푸쉬업 개수 합계를 구하여 출력
//3. 첫날 개수와 증가 폭, 기간을 입력 받아서 출력하도록 변경 