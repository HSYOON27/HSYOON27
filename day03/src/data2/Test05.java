package data2;
import java.lang.*;
public class Test05 {

	public static void main(String[] args) {

		//입력
		int year = 2001;
	
        //처리
        boolean free = year%3 == 0 || year%5 == 0;
        
        //결과
        System.out.println(free);
        
		
		
	}}

//회사 홈페이지에서 이벤트 페이지를 제작 중임. 
//사용자에게 출생년도 4자리를 입력하게 하고 출생년도가 3의 배수 이거나 5의 배수라면 무언가 당첨되었다고 
//당첨되었다는 의미의 프로그래밍 처리를 하려 함. 
//2001년생이 이벤트 당첨 조건에 해당되는지 아닌지 판정하여 출력 