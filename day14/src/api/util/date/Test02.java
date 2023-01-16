package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test02 {
	public static void main(String[] args) {
		
		// Date
		//- 현재 시각을 예뿌게 원하는 방식으로 출력하는데 주로 사용함.
		//- 포맷 설정 해주는 클래스를 이용해서 변환하여 출력(java.text.SimpleDateFormat)
		//- 왜 필요할까? 영어랑 날짜의 순서를 하나하나 따기가 어려우니 한꺼번에 세팅해주는 역할
		
		
		
		Date a = new Date();
	    System.out.println("a = " + a);
		
	    SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
	    System.out.println(f.format(a));
	
	}

}
