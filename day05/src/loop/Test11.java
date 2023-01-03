package loop;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		int total = 0; //여기
		
		for(int i = 0; i < 5; i++) {
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
		total += n;//여기
		
		System.out.println("n = " + n);
		
		}
		sc.close();
		
		double average = (double)total/5;
		
		System.out.println("총 평균은 "+average+""
				+ "입니다");
		
		
}}
//test 11 사용자에게 숫자 5개를 입력 받아 입력받은 숫자의 평균을 출력.