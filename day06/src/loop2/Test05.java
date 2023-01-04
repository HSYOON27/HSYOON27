package loop2;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int score;
		do {
			System.out.println("점수를 입력하세요. ");
			score = sc.nextInt();
		}
		while(!(score>=0 && score<=100));
	
		sc.close(); 
	}
}


//do-while 반복문 (사용하지 않음 잘..)	
//ex : 사용자에게 점수를 입력받는 예제(0~100점)