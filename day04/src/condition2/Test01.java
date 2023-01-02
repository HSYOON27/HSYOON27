package condition2;
import java.lang.*;
public class Test01 {
	
	public static void main(String[] args) {
           //그룹 조건
		   //피자가 2.5만원, 치킨 1.8만원, 떡볶이 5천원 
		   //주문할 수 있는 가장 비싼 메뉴를 1개만 추천
		
		int money = 10000;
	    
		if(money >= 25000) {System.out.println("피자를 추천합니다.");}
		
		else { 
			if(money >= 18000) {System.out.println("치킨을 추천합니다.");}
			else {
			if(money >= 5000) {System.out.println("떡볶이를 추천합니다.");}
			else {
				System.out.println("추천할 메뉴가 없습니다.");
			}
		}
	}}}
