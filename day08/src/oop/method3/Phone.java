package oop.method3;

public class Phone {

	//member field (데이터 저장)
	String name;
	String telecom;
	int price;
	int month;
	
	//member method (기능구현)
	void setting(String name, String telecom, int price) {
		this.setting(name, telecom, price, 0);
	}
	void setting(String name, String telecom, int price, int month) {
		this.name = name;
		this.telecom = telecom;
		this.price = price;
		this.month = month;
	}
	void output() {
		System.out.println("<휴대폰 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("통신사 : " + this.telecom);
		System.out.println("가격 : " + this.price);
		if(this.month > 0) {
			int monthPrice = this.price / this.month;
			System.out.println("월 " + monthPrice+"원");
		}
		else {
			int discountPrice = this.price * 95/100;
	        System.out.println("가격 : " + discountPrice + "원");
			System.out.println("(약정기간 미 설정, 일시불)");
		}
		System.out.println("약정기간 : " + this.month);
	}
}
