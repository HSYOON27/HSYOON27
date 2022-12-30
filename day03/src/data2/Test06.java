package data2;
import java.lang.*;
public class Test06 {

	public static void main(String[] args) {

		//입력
		int a = 777;
		
		//처리
		int b = a / 10; // 10의 자리수가 7
		int c = a % 10; // 1의 자리수가 7 이니까
		int d = a / 100; 
		int e = a % 100;
		
		boolean lucky = b==7 || c==7 || d==7 || e==7 ;
		
		System.out.println(lucky);
		

		//결과
 
	}}// 어떤 두 자리의 숫자가 주어져 있을때 이 숫자에 7이 포함 되어있는지 판정해서 출력
