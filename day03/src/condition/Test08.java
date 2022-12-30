package condition;
import java.lang.*;

public class Test08 {

	public static void main(String[] args) {

		//입력
		int people= 3;
		int day = 5;
		int month = 7;
		int rate = 25;
		int originPrice = 100000;
		int price;
		
		if (month>=6 && month<=8){
			price = (people*day)*(originPrice*(100-rate)/100);
		System.out.println("총 요금은 " + price + "원 입니다.");	
		}
	    else 
		{
	    	price = people*day*originPrice;
			System.out.println("총 요금은 " + price + "원 입니다.");
		}
						
	}}
//# Test08
//KH 여행사는 `무조건 1명 1박에 10만원`이라는 슬로건으로 영업을 하고 있습니다.
//추가로 여름 여행객을 유치하기 위해 다음과 같은 이벤트를 하기로 결정했습니다
//- 여름(6,7,8월)에 여행가는 사람은 무조건 이용요금 25% 할인
//다음 정보가 입력값으로 주어졌을 때 예상 여행 경비를 계산하여 출력하도록 프로그래밍하세요
//1. 인원 수(명)
//2. 여행 기간(일)
//3. 여행 계획중인 달(1월~12월 사이)