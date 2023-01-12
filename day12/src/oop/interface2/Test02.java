package oop.interface2;

public class Test02 {
	public static void main(String[] args) {
		//Lambda(람다) ? 이게뭘깡
		//- 추론을 할 수 있도록 축약한 식을 말함.
		//- 안써도 되는 코드를 생략한 것.
		//- 함수형 프로그래밍을 위해 자바에서 제공하는 방법
		
		//람다에서 반드시 지켜져야 하는 조건 
		//- 인터페이스일 것.
		//- 메소드를 1개만 가지고 있을 것(함수형 인터페이스)
		
		//람다의 등장시기는 : Java 8+ 
		Button menu = () -> {
			System.out.println("메뉴표시");
		};
		menu.push();
		
		Button exit = () -> System.out.println("프로그램 종료");
		exit.push();
		
		
	}

}
