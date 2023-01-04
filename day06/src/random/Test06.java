package random;

import java.util.Random;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int question = r.nextInt(999)+1;
        int count = 0;
        
		System.out.println("정답은 = " + question);
		
		while(true) {
		System.out.println("숫자를 입력하세요");
		count++;
		int answer = sc.nextInt();
		if(answer == question) {
			System.out.println("정답입니다.");
			break;
		}
		else if (answer < question) {
			System.out.println("업");
	    }
		else if (answer > question) {
			System.out.println("다운");
		}
	}
    sc.close();
    System.out.println("총 횟수는 : "+count);
}}
//업다운게임 숫자를 정하고 이를 맞추는 게임을 업다운 게임이라고 함.
// 프로그램이 랜덤으로 1~1000사이의 숫자하나를 정함.
// 사용자가 범위 내에서 숫자를 입력함 
// 프로그램은 사용자가 힘력한 값과 정답을 비교해 업 다운 정답 세개 중 하나를 말함 
// 업은 정답이 입력값보다 크다는 것
// 다운은 정답이 입력값보다 작다는 것
// 정답은 정답과 입력값이 같은 경우. 게임이 종료되어야함
// 업다운 게임 구현 후 정답을 맞추면 몇번만에 맞췄는지 계산해서 출력하세요
//랜덤, 스캐너, 카운트 