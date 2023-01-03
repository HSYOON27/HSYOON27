package loop;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		long money = 1;
		long total = 0;
		
		for(int day = 1; day<=40; day++) {
			System.out.println(day+ "일차 : " + money+ "원");
		
			total += money;
			
			money *= 2;
	
		}
		System.out.println("총 금액은 " + total + "원");
		
//        Scanner sc = new Scanner(System.in); 내가 한 방식 
//	    System.out.println("첫날 금액을 입력");
//	    int money = sc.nextInt();
//	    System.out.println("증가 금액을 입력");
//	    int increase = sc.nextInt();
//	    System.out.println("기간(일) 입력");
//	    int period = sc.nextInt();
//	    sc.close();
//	    
//	    int total = 0;
//		
//		for(int day = 1; day<=period; day++) {
//	        total *=money;
//			System.out.println(day+"일차 - "+money+"원");
//			money *= increase;}//중괄호를 닫은 후 시스템 프린트를 새로해야 하나가 딱 나옴
//		System.out.println("총 금액은 - "+money+"원");
}
}
//30일 동안 첫날은 1원만 주세요
//둘째날부터는 두배 만큼만 주세여
//1. 이 노인이 일자별로 받는 돈을 출력
//2. 이 노인이 받는 총 금액을 출력
//3. 기간이 40일로 늘어나면 얼마를 받는지 출력