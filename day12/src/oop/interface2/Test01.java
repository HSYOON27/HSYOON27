package oop.interface2;

public class Test01 {
	public static void main(String[] args) {
		// (원칙) 인터페이스는 객체 생성이 불가능하다. 왜? 버튼때문에
		// (예외) = 추상메소드가 해결되면 생성이 가능하다(이걸 익명 중첩 클래스 라고 함 바로 아래에 부분들)
		//- 객체 생성 구문 뒤에 {}를 열고 클래스처럼 메소드를 재정의 한다
		//- 일회용이므로 객체가 소멸하면 클래스도 소멸된다. 

		Button menu = new Button() {

			@Override
			public void push() {
				System.out.println("메뉴 표시");

			}
		};
		menu.push();
		
		  //객체생성구문
		Button exit = new Button() {

			//메소드 재정의 
    			@Override
				public void push() {
			    	System.out.println("종료");

				}
		    };
		    
		    exit.push();
		    
	}
}
