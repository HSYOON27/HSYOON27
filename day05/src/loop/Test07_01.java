package loop;

import java.util.Scanner;

public class Test07_01 {
public static void main(String[] args) {

//	for(int day = 1; day<=30; day++) {
//		int pushup = 5 + 2*(day-1);
//		System.out.println(day+"일차 - "+pushup+"개");
//	} 이건 어려운 방법
	
	//권장하는 방법
	
	//사용자에게 첫날 개수, 기간(일), 증가 개수를 입력받아 출력해라. 
    Scanner sc = new Scanner(System.in);
    System.out.println("첫날 개수를 입력");
    int pushup = sc.nextInt();
    System.out.println("증가 개수를 입력");
    int increase = sc.nextInt();
    System.out.println("기간(일) 입력");
    int period = sc.nextInt();
	
    sc.close();
	
	int total = 0;
	
	for(int day = 1; day<=period; day++) {
        total +=pushup;
		System.out.println(day+"일차 - "+pushup+"개");
		pushup += increase;}//중괄호를 닫은 후 시스템 프린트를 새로해야 하나가 딱 나옴
		{System.out.println("총 개수는 - "+total+"개");

	}

	}
	
}
//Test07 새해 맞이 다이어트 계획을 세웁니다. 
//돈 안들이고 할 수 있는 푸쉬업을 30일 동안 체계적으로 해보려고 합니다.
//첫날은 5개 둘째날은 전날보다 2개씩 개수를 늘림. 
//1. 일자별로 하게되는 푸쉬업 개수를 구하여 출력
//2. 30일 동안 하게되는 모든 푸쉬업 개수 합계를 구하여 출력
//3. 첫날 개수와 증가 폭, 기간을 입력 받아서 출력하도록 변경 