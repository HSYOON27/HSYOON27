package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Test04_1 {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		Format f = new SimpleDateFormat("yyyy-MM-dd E");
		
		Random r = new Random();
	    int month = r.nextInt(12)+1;
	    int date = r.nextInt(31)+1;
	    
		c.set(2023, month-1, date);
	    
		System.out.println(f.format(c.getTime()));
		
	    
	}

}
//2023년 여름(6,7,8)월 중 랜덤을 이용하여 주말 날짜를 추첨해보세요 
