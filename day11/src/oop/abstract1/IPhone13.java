package oop.abstract1;

public class IPhone13 extends IPhone {

	public IPhone13(String color) {
		super(color);
	}

	@Override
	public void siri() {
		System.out.println("IPhone13 시리 기능 실행.");
	}

	@Override
	public void call() {
		System.out.println("IPhone13 전화 기능 실행.");

	}

	@Override
	public void sms() {
		System.out.println("IPhone13 문자 기능 실행.");
	}
	
	public void itunes() {
		System.out.println("IPhone13 아이튠즈 실행.");
	}


}
