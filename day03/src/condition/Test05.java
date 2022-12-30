package condition;
import java.lang.*;
public class Test05 {

	public static void main(String[] args) {

		//입력
		int age = 20;
		boolean adult = age >= 20; 
		
		int price;
		//price = 10000; // int price; 는 만들어지는것에 넣겠다는 것 
		//price = 5000; 
		
		//처리
		if(adult) {
			price = 10000;			
		}
		else {
			price = 5000;
		}//강한 확신을 주기위해 컴퓨타에게.. else를 사용한다 
				
		//결과 
		
		System.out.println(price + "원 입니다.");
		
	}}
//ex : 성인은 만원, 나머지는 5천원 성인은 20세 이상
