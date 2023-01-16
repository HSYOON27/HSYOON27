package api.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작 시간을 입력하세요");
		LocalTime a1 = LocalTime.of(0, 0);
		int startTime = sc.nextInt();
		System.out.println("종료 시간을 입력하세요");
		LocalTime a2 = LocalTime.of(0, 0);
		int finishTime = sc.nextInt();

		sc.close();
		
		Duration duration = Duration.between(a1, a2);
		
		int basicFare = 1000;
		
		

		
	}

}
