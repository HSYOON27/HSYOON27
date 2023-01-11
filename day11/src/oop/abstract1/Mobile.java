package oop.abstract1;

//추상 클래스(abstract class)
// 애초에 얘는 역할 자체가 상위클래스. 즉 상속을 위한 클래스. 그래서 일반 클래스랑 3가지가 다르다.
// 1. 클래스에 abstract라고 꼭 표시를 해야한다.
// 2. abstract가 붙어 있으면 객체 생성이 불가능하다.
// 3. 추상 메소드를 가질 수 있다. 

public abstract class Mobile {
	//필드에서는 일반 클래스와 달라지는 부분이 없다.
	
	protected String number;
	protected String color;
	
	//생성자 - 일반 클래스와 동일 
	
	public Mobile(String color) {
		this.color = color; //이게 오버로딩. 같은곳에 여러개 만들어 놨기 때문에.
	}
	
	//메소드 
	//- 추상 메소드와 일반 메소드로의ㅣ 구현 
	//- 추상 메소드는 이름은 아는데 내용을 모를때 사용하는 걸. 
	public abstract void call(); //전화기라면 전화기능은 꼭 있어야한다는 뜻. 뭔진 모르겠다만 그니까 구현이(재정의) 강제됨 상속받는 애가 
    public abstract void sms();
    
    public void output() {  //이렇게 되는건 하는거다. 
    	System.out.println("번호 : " + number);
    	System.out.println("색상 : " + color);
    }

}
