package oop.method3;

public class Cellphone {

	// Member Field
	String name;
	String telecom;
	int price;
	String agreement;
	// Member Method

	void setting(String name, String telecom, int price, String agreement) {
		this.name = name;
		this.telecom = telecom;
		this.price = price;
		this.agreement = agreement;
	}

	void output() {
		System.out.println("<휴대폰 판매 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("통신사 : " + this.telecom);
		System.out.println("가격 : " + this.price);
		System.out.println("약정개월 : " + this.agreement);
	}
}
