package loop2;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int total = 0; //측정하고 싶은게 있으면 측정할 항목 하나당 변수 1개씩 
		int count = 0; // 얘도 측정하고 싶으니까!
		
		while(true)//이 안에들어가면 영원히 반복된다
			{
		System.out.println("숫자를 입력하세요");
		int n = sc.nextInt();
	   
		if(n == -1) {break;} //{}괄호가 없으면 한개의 명령은 구문으로 인식함
		
		else{total += n;
	    count ++;}
		
		}
		int average = total/count;
		System.out.println("숫자의 총 합은 "+total+"입니다.");
		System.out.println("총 입력 횟수는 "+count+"입니다.");
		System.out.println("평균은 "+ average + "입니다.");
		
		sc.close();
		}
}
//사용자에게 숫자를 지속적으로 입력받아 입력 받은 숫자의 총 합계와 평균을 출력. 단 -1이 입력된 경우 프로그램 종료