package oop.inherit6;
//차상위 클래스
public class Samsung extends Phone{

	public Samsung(String number, String color) {
		super(number, color);
	}

	public void samsungPay() {
		System.out.println("삼성페이 기능 실행!");
	}
}
