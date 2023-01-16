package api.time;

import java.text.DecimalFormat;
import java.text.Format;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Test02_2 {
	public static void main(String[] args) {		
		
	   String in = "14:30";
	   String out = "17:30";
	   
	   LocalTime intime = LocalTime.parse(in);
	   LocalTime outtime = LocalTime.parse(out);
	   
	   Duration duration = Duration.between(intime, outtime);
	   
	   long second = duration.getSeconds();

	   long minute = second/60L;
	   
	   int pricePerHour = 1000;
	   
	   double totalPrice = (long)(pricePerHour*minute);
	   
	   System.out.println("총 요금은 " + totalPrice);
	   
	   Format f = new DecimalFormat("#,##0.00");
	   System.out.println(f.format(totalPrice));

		
	}

}
