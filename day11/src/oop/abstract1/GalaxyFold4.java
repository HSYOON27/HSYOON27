package oop.abstract1;

public class GalaxyFold4 extends Galaxy{

	public GalaxyFold4(String color) {
		super(color);
	}

	@Override
	public void samsungPay() {
		System.out.println("GalaxyFold4 삼성페이 기능 실행.");
	}
	@Override
	public void call() {
		System.out.println("GalaxyFold4 전화 기능 실행.");
	}
	@Override
	public void sms() {
		System.out.println("GalaxyFold4 문자 기능 실행.");
	}
	public void iris() {
		System.out.println("GalaxyFold4 iris 기능 실행.");

	}

}
