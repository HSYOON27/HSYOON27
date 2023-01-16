package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test02 {
	public static void main(String[] args) {

		//Calendar를 이용한 날짜 계산
		Format f = new SimpleDateFormat("yyyy-MM-dd E a h:mm:ss");
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		
		//날짜변경 : 2023년 1월 1일 
		//[1] 연, 월, 일 등을 각각 변경 - .set(항목, 값) 
		c.set(Calendar.YEAR, 2023); //연도를 2023으로 바꾸세염 이라는 명령어 
		c.set(Calendar.MONTH, 0); //0부터라 1월은 0 2월이 1 
		c.set(Calendar.DATE, 1); //일을 1로 바꾸세요 시 분 초도 다 돼 
		
		System.out.println(f.format(c.getTime()));
 
		//[2] 한번에 연/월/일을 설정
		c.set(2022, 0, 1);//월 설정 항상 주의 
		System.out.println(f.format(c.getTime()));
		
		//Calendar는 날짜가 허용되지 않는 값이여도 자동 보정을 해준다 
		c.set(2022, 11, 32); //2022년 12월 32일 
		System.out.println(f.format(c.getTime()));
		
		c.add(Calendar.MONTH, 100); //100개월을 더해라 
		System.out.println(f.format(c.getTime()));
		
		//Calendar는 윤년도 자동 계산 된다.
		c.set(2020, 1, 1); //2020년 2월 1일 
		System.out.println(c.getActualMaximum(Calendar.DATE)); //해당월에 날짜의 최대치를 물어보는 명령어
		
		
		
	}

}
