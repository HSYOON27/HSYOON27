package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		
		
		//Calendar c = new Calendar();// 직접생성 불가
		Calendar c = Calendar.getInstance(); //생성 의뢰를 함
		
		
		//출력하는 방법
		//[1] 정보를 하나씩 꺼내서 출력
		//- .get(항목) 명령으로 원하는 항목 추출
		//- 반드시 추출항 항목에 대한 정보를 인자(괄호 안에)로 전달
		int year = c.get(Calendar.YEAR);
		System.out.println("year = " + year);
		
		//(주의) 월은 0~11로 관리되므로 실제 설정/추출시 보정을 해줘야 한다.
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("month = " + month + "월");
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		int day1 = c.get(Calendar.DATE);
		System.out.println(day);
		System.out.println(day1);
		
		//[2] java.util.Date로 변경하여 출력 
		Date d = c.getTime();
		Format f4 = new SimpleDateFormat("yyyy-MM-dd E H:mm:ss");
		System.out.println(f4.format(d));
		
		
	}

}
