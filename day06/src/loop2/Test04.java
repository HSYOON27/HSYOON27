package loop2;

import java.util.Scanner;

public class Test04 {

	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		int first = 100; //초기숫자
		int count = 0; //카운트 선언
		while(first >=0) {
		System.out.println("숫자를 입력 하세요");
	    int n = sc.nextInt();
	
	    if(n>=1 && n<=9) {
	    	first -= n;
	    	count++;
	    }
	    else System.out.println("1부터 9사이의 값을 입력하세요");
	    System.out.println("남은 값 : "+first);
	    
		}
		sc.close(); // 입력하는건 여기까지가 끝이다 라는 의미. 
		
		System.out.println("게임 끝");
		System.out.println("총 입력 갯수 : "+count);
		}
}
//숫자 모래성 게임. 최초 100이라는 값을 정해두고 사용자에게 숫자를 입력받아 차감을 합니다. 
//계속적으로 입력받아 차감을 하다 숫자가 음수가되면 반복이 종료하고 게임오버 메시지를 출력
// 게임 오버 전까지 입력한 숫자의 개수를 출력해보세요, 사용자가 1에서부터 9사이 값만 입력할 수 있도록 처리해보세요.