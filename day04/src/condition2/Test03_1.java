package condition2;
import java.lang.*;
import java.time.Year;
public class Test03_1 {

	public static void main(String[] args) {

		//입력
		int deposit = 500;
		int year = Year.now().getValue();
		int freePrice = 0;
		int adultPrice = 1250;
		int teenPrice = 720;
		int childPrice = 450;
		
		
		int birth = 1900;
		
		//처리
				
		//price += 0; // 복합 대입 연산.(더해 넣어라 라는 의미) 
		if(year-birth>=65 || year-birth<=7) {System.out.println("요금은 " + (freePrice+deposit) + "원 입니다.");}
	    //if(year-birth>=65 || year-birth<=7){~~~~ 이렇게 묶어서도 가능)
		else if (year-birth>=20) {System.out.println("요금은 " + (adultPrice+deposit) + "원 입니다.");}
		else if (year-birth>=14) {System.out.println("요금은 " + (teenPrice+deposit)  + "원 입니다.");}
		else if (year-birth>=8) {System.out.println("요금은 " + (childPrice+deposit) + "원 입니다.");}
		else {System.out.println("요금은 " + (freePrice+deposit) + "원 입니다.");}

		
		
	}}
//Test 03 다중조건. 지하철 이용요금 계산기 지하철은 나이에 따라 요금을 다르게 받음
// 어르신(65세~) 무료
// 성인(20세~64세)-1250원
// 청소년(14~19세)-720원
// 어린이(8세-13세)-450원
// 영유아(~7세)-무료
// 카드 보증금이 500원일때 출생년도 4자리에 따라 지하철 이용 요금을 구하여 출력