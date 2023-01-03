package condition3;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
 
	    int year = 2024;
		int month = 2;
		int day;
		

		switch(month) {
		case 2: 
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				day = 29;
			}
			else {
				day = 28;
			}
			break;
		case 1: 
		case 3:
		case 5: 
		case 7: 
		case 8:
		case 10: 
		case 12: day = 31; break;
		default: day = 30; break;
		}

		//출력
		System.out.println(year+"년 "+month+"월은 "+day+"일까지 있어요");
}
}	
// 다음 요구 사항에 맞게 계산 프로그램을 구현
// 사용자에게 연도와 월을 입력 받습니다.
// 윤년인 경우 2월 29일까지 있음에 유의!
