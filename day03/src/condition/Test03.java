package condition;
import java.lang.*;
public class Test03 {			
	public static void main(String[] args) {

		//입력 (얘는 절대 고쳐지지 않게끔 프로그래밍을 해라)
		int price = 7000;
		int age = 75;		
		int rate= 50; // 할인율

		//처리
		boolean discount = age >= 65 ; 
		int discountPrice =(price*(100-rate)/100);
		
		//결과

		if(discount){System.out.println (discountPrice+"원 입니다.");
				}
		if(!discount){System.out.println(price +"원 입니다.");
		
		}
		
	}}
//Test03 국밥집에서 국밥 한 그릇이 7천원임. 65세 이상 어르신에게는 50% 할인 된 가격으로 판매한다고 할 때 
//손님의 나이가 주어지면 국밥 가격이 출력되도록 구현해보세염