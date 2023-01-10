package oop.inherit2;

//하위 클래스(서브클래스, 자식 클래스..)
//- extends라는 키워드를 클래스 옆에 붙여서 상위 클래스를 설정(상속 설정)
//- 해당 클래스의 모든 내용이 전부 다 상속된다.(사실 private method 빼고)

public class IPhone14 extends Mobile {
	
	public void airDrop() {
		System.out.println("에어드랍");
	}

}
