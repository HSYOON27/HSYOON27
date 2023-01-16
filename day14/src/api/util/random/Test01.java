package api.util.random;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		//Random 클래스
		//- seed : 랜덤을 계산하기 위한 시작값 (미설정시 시간을 고려하여 설정)
		
		Random r1 = new Random(); //얘는 시드 미설정
		Random r2 = new Random(1L); // 얘는 시드 설정
		Random r3 = new Random(System.currentTimeMillis()); //r1과 원리가 같음 
		
		
		System.out.println("r1 = "+ r1.nextInt()); //메소드를 부른거임 
		System.out.println("r2 = "+ r2.nextInt()); //
		System.out.println("r3 = "+ r3.nextInt()); //

		
		
		

	}

}
