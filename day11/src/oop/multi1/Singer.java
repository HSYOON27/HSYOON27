package oop.multi1;

//인터페이스(interface)
//- 다중 상속 전용 클래스임. 얘는 
public interface Singer {
	//필드 - 인터페이스는 변수가 없다. (상수만 있으며, 키워드 생략 가능하다)
	//private int a;
	//public static int a = 10; 얘는 돼 상수니까.
	//int a = 10;

	//생성자 - 필드가 없으니까 생성자도 없다. 
	//public Singer() {} 얘도 불가능
	
	//메소드 - 오직 추상 메소드만 가질 수 있다(~Java 7까지는 맞는 말)
	//- 키워드를 안적어도 자동적으로 추상 메소드가 추가된다.(public, abstract)
	//- Java 8부터는 default 메소드를 가질 수 있다(Lambda에 활용 가능)
	
	//public abstract void sing();
	void sing(); //인터페이스는 얘 한개만 가질 수 있음. 오직 틀만 잡을때 쓰는거. 완전히 상속전용 가수는 노래를해야한다~
	
	
}
