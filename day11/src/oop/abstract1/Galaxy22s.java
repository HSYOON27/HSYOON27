package oop.abstract1;

public class Galaxy22s extends Galaxy {

	public Galaxy22s(String color) {
		super(color);
	}

	@Override
	public void samsungPay() {		
		System.out.println("Galaxy22s 삼성페이 기능 실행.");
	}

	@Override
	public void call() {
		System.out.println("Galaxy22s 전화 기능 실행.");

	}
	@Override
	public void sms() {
		System.out.println("Galaxy22s 문자 기능 실행.");
	}
    public void bixby() {
		System.out.println("Galaxy22s 빅스비 기능 실행.");

	}

}
