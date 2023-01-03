package loop;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {

		//성능개선 1탄 = 1과 자기 자신을 제거 
		//나머지가 0인 경우가 발견되면 바로 종료 
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int number = sc.nextInt();

		sc.close();
		
        
        int count = 0;
        
	    //처리 
        for(int i = 2; i<number; i++) {
        	if(number % i == 0) {
        	
            count++;
            break;//그만해
        	}
	}
        System.out.println("나누어 떨어지는 숫자 개수 = " + count);
        //출력
        if(count == 0) {System.out.println(number+" : 소수입니다.");
        }
        else {System.out.println(number+ " : 소수가 아닙니다.");
}
}}
//소수찾기 프로그램. 소수는 자기 자신과 1을 제외한 나머지 나눗셈이 불가능한 숫자를 말함.
//사용자가 어떤 숫자를 입력 했을때, 이 숫자가 소수인지 아닌지 출력하도록 구현
