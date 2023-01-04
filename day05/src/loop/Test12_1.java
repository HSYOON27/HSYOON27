package loop;

import java.util.Scanner;

public class Test12_1 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);{
	System.out.println("단을 입력 하세요");
	int dan = sc.nextInt();
	int count = 0;

	for(int i = 1; i<10; i++) {
		System.out.println(dan+"X"+i+" = ");
		int answer = sc.nextInt();
		
		if(answer == dan*i) {
			System.out.println("정답입니다.");
		count++;}
		else System.out.println("오답입니다.");
	}
	sc.close();
	System.out.println("정답개수는 "+count+"개 입니다.");
	}
}
}