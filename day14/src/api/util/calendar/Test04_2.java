package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Test04_2 {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		Format f = new SimpleDateFormat("yyyy-MM-dd E");
		
		Random r = new Random();
	    int month = r.nextInt(12)+1;
	 
	    c.set(Calendar.YEAR, 2023); //연도만 교체
	    c.set(Calendar.MONTH, month-1);//월만교체
	    
	    int max = c.getActualMaximum(Calendar.DATE);//실제일수
	    
	    int date = r.nextInt(max)+1;
	    
	    c.set(Calendar.DATE, date);
	    
		System.out.println(f.format(c.getTime()));
		
	    
	}

}
//2023년 여름(6,7,8)월 중 랜덤을 이용하여 주말 날짜를 추첨해보세요 
