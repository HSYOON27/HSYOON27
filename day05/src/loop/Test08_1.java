package loop;

import java.util.Scanner;

public class Test08_1 {

	public static void main(String[] args) {
		
	 int money = 1;
	 int total = 0;
	 
	 for(int day = 1; day<=30; day++) {
		 System.out.println(day +"일차 "+money+"원 입니다.");
		 
		 total += money;
		 money *= 2;
	 }
		System.out.println("총 금액은 " + total + "원 입니다.");

}}
//30일 동안 첫날은 1원만 주세요
//둘째날부터는 두배 만큼만 주세여
//1. 이 노인이 일자별로 받는 돈을 출력
//2. 이 노인이 받는 총 금액을 출력
//3. 기간이 40일로 늘어나면 얼마를 받는지 출력