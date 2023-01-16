package api.util.random;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;

public class Test02_2 {

	public static void main(String[] args) {
		//OTP(One Time Password)를 만들려면?
        //- 랜덤이긴 하지만 예측 가능해야 한다
		//- 예측이 가능하려면 시드가 일정시간 동안 같아야 한다
		//- 어떻게 하면 60초마다 바뀌는 값을 만들 수 있을까?
		//- 반드시 시간이 들어가야함. 그걸 통해 계산한다.
		//- 시간과 나눗셈을 통해 계산한다.
		//- 서로 다른 회원은 서로 다른 OTP번호가 나와야 한다 당연
		//- 다시 말해서 회원간의 시드가 달라야 한다. 
		//- r.setseed(time) 뿐만 아니라 시간 + 개인정보를 합쳐서 시드를 구성하면 된다(이 로직이 걸리면 해킹당함)
		
		Random r = new Random();
		Format f = new DecimalFormat("000000");

		String a = "admin";
		String b = "student";
		
		
		while(true) {
			long time = System.currentTimeMillis()/1000L;
			long seedA = time + a.hashCode();
			long seedB = time + b.hashCode();
		
			r.setSeed(seedA);
			int otpA = r.nextInt(1000000) + 0;
			r.setSeed(seedB);
			int otpB = r.nextInt(1000000) + 0;
			
			System.out.println("otp A = "+f.format(otpA));
			System.out.println("otp B = "+f.format(otpB));
			System.out.println();
		}
	}

}
