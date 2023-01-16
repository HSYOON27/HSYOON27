package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

public class Test03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.KOREAN);
	
		Date d = new Date();
		
		//1. 2023년 1월 16일 월
		Format f1 = new SimpleDateFormat("y년 M월 d일 E");
		System.out.println(f1.format(d));
		
		//2. 오전 10시 40분
		//- 참고 : 시간은 H와, h를 쓴다 
		
		Format f2 = new SimpleDateFormat("a H시 m분");
		System.out.println(f2.format(d));
      
		//3. 10:40:35
		Format f3 = new SimpleDateFormat("HH:mm:ss");
		System.out.println(f3.format(d));
		
		//4. 2023-01-16월 10:40:35
		Format f4 = new SimpleDateFormat("yyyy-MM-dd E H:mm:ss");
		System.out.println(f4.format(d));
		
	}
	
}
//1. 2023년 1월 16일 월
//2. 오전 10시 40분
//3. 10:40:35
//4. 2023-01-16 월 10:40:35