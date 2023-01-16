package api.util.random;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		//OTP(One Time Password)를 만들려면?
        //- 랜덤이긴 하지만 예측 가능해야 한다
		//- 예측이 가능하려면 시드가 일정시간 동안 같아야 한다
		//- 어떻게 하면 60초마다 바뀌는 값을 만들 수 있을까?
		//- 반드시 시간이 들어가야함. 그걸 통해 계산한다.
		
		while(true) {
			long time = System.currentTimeMillis()/1000L;
		
		//System.out.println("time = "+ time);
			
			Random r = new Random(time);
			//int otp = 000000~999999;
			int otp = r.nextInt(1000000) + 0;
			
			Format f = new DecimalFormat("000000");
			System.out.println("otp = "+f.format(otp));
			
		}
	}

}
