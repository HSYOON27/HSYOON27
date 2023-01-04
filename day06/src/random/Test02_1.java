package random;

import java.util.Random;

public class Test02_1 {

	public static void main(String[] args) {

		Random r = new Random();

		//1. 로또번호 1개(1부터 45사이 정수)
		int lotto = r.nextInt(45) + 1;
		System.out.println("로또 번호 : "+ lotto);
		
		//2. 두자리 정수 중 1개
		int c = r.nextInt(90)+10;
		System.out.println(c);
		
		//3. OTP 번호 1개(6개)
		//100000만 부터 999999까지니까 999999-100000+1 하면 됌 
		int otp = r.nextInt(900000)+100000;
        System.out.println("OTP 번호는 : " + otp);
        
        //4. 동전을 던진 결과 출력(앞 또는 뒤)
        int coin = r.nextInt(2);
        if(coin==0) {System.out.println("앞");
        }
        else System.out.println("뒤");
        
        
        
        
		
		
		
	}
}
