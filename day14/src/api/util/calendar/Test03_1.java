package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();

		//기준 날짜로 변경(2023.06.13)
		c.set(2023, 5, 13);//월 설정 주의

		//D-100 계산
		c.add(Calendar.DATE, -100);

		Format f = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println(f.format(c.getTime()));
	
	}
	
	}


//우리 과정 수료일은 2023년 6월 13일
//수료 100일전 이력서 작성 날짜 
