package oop.method2;

public class Cafe {
	
	// Member Field
		String name;
		String type;
		int price;
		String event;
		// Member Method

		void setting(String name, String type, int price, String event) {
			this.name = name;
			this.type = type;
			this.price = price;
			this.event = event;
		}
		void output() {
			System.out.println("<메 뉴 판>");
			System.out.println("이름 : " + this.name);
			System.out.println("분류 : " + this.type);
			System.out.println("가격 : " + this.price);
			System.out.println("행사여부 : " + this.event);
		}

}
