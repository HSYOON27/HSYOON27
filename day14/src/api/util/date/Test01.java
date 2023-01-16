package api.util.date;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
	public static void main (String[] args) {
		//프로그래밍에서는 날짜를 어떻게 관리 하는가? 
		//방법 정리
		//1. System.currentTimeMilss() - 측정용 시간 
		//- 측정용 시간
		//- 1970년 1월 1일 0시 0분 0초(기준시) 부터  지금까지 흘러온 밀리초(ms)
	
		long a = System.currentTimeMillis();
		System.out.println("a = " + a);
		
		//2. java.util.date
		//- 최초로 등장한 시간 클래스임
		//- 1900년도 기준이니까 지금은 버려진 기능이 많음.
		
		Date b = new Date();
		System.out.println("b = " + b);
		
		Date c = new Date(2023, 1, 16);
		
		//3. java.util.Calender
		//- Date를 개선한 클래스 
		//- 생성 대행 방식을 사용 왱?
		//- 추상클래스니까
		//- 날짜 계산에 특화되어있음.
		Calendar d = Calendar.getInstance();
		System.out.println("d = "+d);
		
		d.set(2023, 5, 13);
		System.out.println(d.getTime());
		
		//4. java.time 패키지
		//- 날짜, 시간만 쓰고 싶을때 혹은 날짜와 시간을 같이 쓰고싶은 경우에 맞게 구성
		//- 월도 일반적인 방식으로 설정 가능
		// 
		
		LocalDate f = LocalDate.now();
		LocalDate g = LocalDate.of(2023, 1, 16);
		
		System.out.println("f = "+f);
		System.out.println("g = "+g);
		
	}

}
