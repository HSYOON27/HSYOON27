package oop.modifier1;

//장난감 클래스
public class Toy {

	// field - 잠금처리가 기본이다. 주차장 차단기 설치하듯 아무나 못오게 (private)
	private String name;
	private int price;

	// method

	// setter method - 설정용 메소드
	void setName(String name) {
		this.name = name;
	}

	void setPrice(int price) {
		if (price >= 0) {
			this.price = price;
		}
	}

	// getter method - 확인용 , 반환용 매서드. println에 쓰는거
	// - return : 데이터를 반환하며 종료하는
	// - void : 반환값(실행결과)이 없음.
	String getName() {
		return this.name;
	}
	int getPrice() {
		return this.price;
	}

	// constructor
	//- 생성자에서도 설정시 setter 메소드를 사용하도록 한다. 
	Toy(String name, int price){
		this.setName(name);
		this.setPrice(price);
	}
	
	void output() {
//		System.out.println(this.name);
//		System.out.println(this.price); // 얘네는 돼 왜냐? 같은 클래스니까.
		System.out.println(getName());
		System.out.println(getPrice());
		
	}
}
