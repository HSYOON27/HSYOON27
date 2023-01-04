package loop2;

import java.util.Scanner;

public class Test04_1 {

	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		int origin = 100;
		int count = 0;
		
		while(origin>=0) {
		System.out.print("숫자 입력 : ");
		int user = sc.nextInt();
		
		if(user>=1 && user<=9) {
			origin -= user;
			count ++;
		}
		else System.out.println("1~9사이의 숫자를 적으세요");
		System.out.println("남은 숫자는 : "+origin);
	
    }
		sc.close();
		
		System.out.println("게임 종료");
		System.out.println("숫자의 총 입력 횟수는 : "+count);

	}
}
//숫자 모래성 게임. 최초 100이라는 값을 정해두고 사용자에게 숫자를 입력받아 차감을 합니다. 
//계속적으로 입력받아 차감을 하다 숫자가 음수가되면 반복이 종료하고 게임오버 메시지를 출력
// 게임 오버 전까지 입력한 숫자의 개수를 출력해보세요, 사용자가 1에서부터 9사이 값만 입력할 수 있도록 처리해보세요.