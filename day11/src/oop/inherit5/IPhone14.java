package oop.inherit5;

public class IPhone14 extends Phone{
	public void info() {
		//System.out.println("전화번호 : " + super.number);//부모 클래스거 
		//System.out.println("전화번호 : " + this.number);//내 클래스 것. 
		System.out.println("전화번호 : " + number);//this가 생략됨. 기본 베이스는 this라 생각
}

	//메소드 오버라이드(method override, 매소드 재정의)
	//- 기존 메서드의 코드가 맘에 들지 않아 다른 코드로 교체하고 싶을때 사용한다
	//- 부모 클래스에 있는 형태와 똑같이 구현
	//@Override와 같은 코드를 어노테이션(Annotation)이라고 한다.
	//얘의 역할이 뭘까? -> 명찰을 부착하여 하단 코드의 역할을 정의한다. 
	
	@Override //얘가 있으니까 99개는 그냥쓰고 1개를 고칠 수 있음. 그러니까 상속의 가치가 높은 것. 
	public void videoCall() {
		System.out.println("영상통화 기능을 사용할 수 없습니다.");
	}
	
	
	//부모 클래스의 Phone에서 원하는 데이터 생성 시 필요한 number를 전달할 수 있는 생성자를 구현해야함
	//-> 이 요구사항을 지키지 못하면 상속은 근본적으로 불가능해짐. 
	public IPhone14(String number) {
		super(number);//부모클래스의 생성자에 number를 전달한다!.
	}
}
