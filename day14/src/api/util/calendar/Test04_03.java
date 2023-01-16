package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Test04_03 {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		Format f = new SimpleDateFormat("yyyy-MM-dd E");
		Random r = new Random();
		
		while(true) {
	    int month = r.nextInt(3)+5; //3개 6월부터 
	    int day = r.nextInt(2);
	   
	    c.set(Calendar.YEAR, 2023);
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DATE, day);
			
		int week = c.get(Calendar.DATE);
		
		
	    if(week == Calendar.SUNDAY || week == Calendar.SATURDAY) {
			System.out.println(f.format(c.getTime()));
	    	break;
	    }
	    
	    else {
	    	System.out.println("주중");
	    }
	}
	
	}
}
//2023년 여름(6,7,8)월 중 랜덤을 이용하여 주말 날짜를 추첨해보세요 
