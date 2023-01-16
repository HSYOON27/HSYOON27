package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		Format f = new SimpleDateFormat("yyyy-MM-dd E");
		Random r = new Random();
		
	    int month = r.nextInt(3)+5; //3개 6월부터 
	    int day = r.nextInt(2);
	   
	    c.set(Calendar.YEAR, 2023);
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_WEEK, day);
		
		System.out.println(f.format(c.getTime()));
		//요일을 구하는 방법
		//1. 숫자로 추출 (1=일욜 
		//2. 문자열로 추출
		
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		
	    if(week == Calendar.SUNDAY || week == Calendar.SATURDAY) {
	    	System.out.println("주말");
	    }
	    
	    else {
	    	System.out.println("주중");
	    }
	}
	

}
//2023년 여름(6,7,8)월 중 랜덤을 이용하여 주말 날짜를 추첨해보세요 
