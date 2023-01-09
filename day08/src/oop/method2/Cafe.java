package oop.method2;

public class Cafe {

	// Member Field(멤버 변수) - 주목적은 데이터 저장
	String name;
	String type;
	int price;
	boolean event;
	int dis = 20;

	// Member Method - 기능 구현(코드 저장)
	
	// 같은 이름으로 형태만 다르게 메소드를 구현 = 메소드 오버로딩(method overloading)
	void setting(String name, String type, int price) {
		this.setting(name, type, price, false); //이런식으로 메소드끼리도 부를 수 있음. 
//		this.name = name;
//		this.type = type;
//		this.price = price;
//		this.event = false;
	}
	void setting(String name, String type, int price, boolean event) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.event = event;

	}

	void output() {
		System.out.println("<메 뉴 판>");
		System.out.println("이름 : " + this.name);
		System.out.println("분류 : " + this.type);

		// 행사가 실제로 참이냐 거짓이냐를 분별 한 후 행사의 내용을 입력하면 된다.
		if (this.event == true) {
			System.out.println("가격 : " + this.price * (100 - dis) / 100 + "원");
			System.out.println("행사여부 : 행사중");
		} else {
			System.out.println("가격 : " + this.price + "원");
			System.out.println("행사여부 : -");
		}
	}

}
