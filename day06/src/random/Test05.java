package random;

import java.util.Random;
import java.util.Scanner;

public class Test05 {
	
	public static void main(String[] args) {

	Random r = new Random();//랜덤이 필요할땐 얘 
	Scanner sc = new Scanner(System.in); //입력이 필요할떈 스캐너
	for(int i = 1; i<=10; i++)//for 반복문으로 10번 하는법이다 이게!!
		{
	int number = r.nextInt(8)+2;
	int number2 = r.nextInt(9)+1;
	System.out.println (number + "X" + number2 + " = ");
	System.out.println("구구단을 풀이하세요");
	
	int answer = sc.nextInt();	//대답이 정수니까! 
	
	if (number * number2 == answer) 
	{
		System.out.println("정답 입니다.");
	}
	else System.out.println("오답 입니다.");
	}
	sc.close();
	
}}

//Test05 랜덤으로 구구단 10개 문제를 출제하고, 사용자가 이를 풀 수 있도록 구현하세요 