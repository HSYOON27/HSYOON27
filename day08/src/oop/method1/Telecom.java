package oop.method1;

public class Telecom {

	// Member Field
	String name;
	String product;
	int monthPay;
	int data;
	int call;
	int message;

	// Member Method

	void setting(String name, String product, int monthPay, int data, int call, int message) {
		this.name = name;
		this.product = product;
		this.monthPay = monthPay;
		this.data = data;
		this.call = call;
		this.message = message;
	}

	void output() {
		System.out.println("<요금 정보>");
		System.out.println("통신사 : " + this.name);
		System.out.println("상품명 : " + this.product);
		System.out.println("월정액 : " + this.monthPay);
		System.out.println("데이터(GB) : " + this.data);
		System.out.println("통화(분) : " + this.call);
		System.out.println("문자(건) : " + this.message);
	}
}
