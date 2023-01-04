package random;

import java.util.Random;

public class Test04 {

	public static void main(String[] args) {

		Random r = new Random();
		
		int lotto = r.nextInt(99);
		
		if(lotto==0){
			System.out.println("강남 아파트");
		}
		else if(lotto==1 || lotto==2 || lotto ==3) {
			System.out.println("테슬라");
		}
		else System.out.println("다음 기회에");
				
		
	
	}}
// Test 04 홈페이지에 경품 추천 화면을 구현하려 함. 
// 경품 추천 확률은 다음과 같습니다.
// 강남 아파트 : 1%, 테슬라 3%, 다음 기회에 : 96%