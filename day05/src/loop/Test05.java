package loop;

import java.util.Scanner;

public class Test05 {
	
	public static void main(String[] args) throws InterruptedException {

    Scanner sc = new Scanner(System.in);	
	System.out.println("분을 입력하세요");
	int minute = sc.nextInt();
	System.out.println("초를 입력하세요");
	int second = sc.nextInt();

	sc.close();
	
	int time = minute * 60 + second;
	
	for(int i = time; time >= 0; time--) {
		if(time != 0) {
			System.out.println(time/60+"분"+time%60+"초 남았습니다");
		}
		else System.out.println("시간이 다 되었습니다.");
		
		Thread.sleep(1000);//1초간 중지시킴 단위 : 밀리세컨드.)
		}
	}
	}
//사용자에게 '분', '초를 입력 받는다.' 
//입력 받은 시간부터 0분 0초까지 반복적으로 1초씩 감소하도록 출력
//모든 출력을 마치고 '시간이 다 되었습니다'출력