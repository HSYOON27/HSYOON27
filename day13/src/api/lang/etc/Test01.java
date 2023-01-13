package api.lang.etc;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		//Math 클래스
		//- 생성자 없음(아예 생성이 불가/미리생성해두었거나 대행해주는 경우) 앞은 일회용메소드 덩어리/뒤는 싱글톤,팩토리패턴 이라고도함
		//- 이 클래스는 모든 필드와 메서드가 static이므로 첫번째 경우라 볼 수 있음.
		//- 아무데서나 편하게 부를 수 있는 일회용 계산 클래스 
		
		//Math a = new Math();
		
		System.out.println(Math.PI);//원주율 
		System.out.println(Math.E);//자연지수  필드는 이 2개가 다임. 
		
		System.out.println(Math.round(1.5)); //반올림
		System.out.println(Math.floor(1.5)); //버림 
		System.out.println(Math.ceil(1.5)); //올림 
		
		System.out.println(Math.abs(50-20)); //절대값. 절대값은 음수가 존재할 수 없음.
		System.out.println(Math.abs(20-50)); 
		
		Random r = new Random();
		int a = r.nextInt(6)+1; 
		int b = r.nextInt(6)+1; //주사위 
		System.out.println("a= "+ a + ", b = "+ b);
		System.out.println("max = "+ Math.max(a, b) + ", min = "+ Math.min(a, b)); 
		//이러면 두 값중 큰게 앞으로 나오라는거 작은값은 뒤로 
		
		System.out.println(Math.pow(2, 10)); //이건 제곱 
		

		
	}

}
