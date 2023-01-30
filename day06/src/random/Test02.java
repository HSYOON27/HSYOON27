package random;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {

		Random r = new Random();
		
		//1. 로또
		int lotto = r.nextInt(45)+1;
		System.out.println(lotto);
		
		//2. 2자리 정수
		int b = r.nextInt(90)+10; //10부터 90개 -> 99까지 라는 뜻 
		System.out.println(b);
		
		//3. OTP 번호 6개
		int otp = r.nextInt(900000)+100000;
		System.out.println("OTP 번호는 : "+otp);
		
		//4. 동전 앞뒤 
		int coin = r.nextInt(2);
		if(coin==1){
			System.out.println("앞");
		}
		else System.out.println("뒤");
		
		
	    //5. 윳놀이 
	    int d = r.nextInt(6);
	    if(d==0) {
	    	System.out.println("도");
	    }
	    else if(d==1) {
	    	System.out.println("개");
	    }
	    else if(d==2) {
	    	System.out.println("걸");
	    }
	    else if(d==3) {
	    	System.out.println("윷");
	    }
	    else if(d==4) {
	    	System.out.println("모");	
	    }
	    else {
	    	System.out.println("빽도");
	    }
	}
	}
//다음에서 요구하는 랜덤값을 구하여 출력 
//1. 로또번호 1개(1~45 사이의 정수)
//2. 2자리 정수 중 1개
//3. OTP 번호 1개(6자리 랜덤 정수)
//4. 동전을 던진 결과 출력(앞 또는 뒤)
//5. 윷놀이 한 턴 결과 출력(도/개/걸/윳/모/빽도)