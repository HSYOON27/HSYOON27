package oop.inherit6;

public class Galaxy22s extends Samsung{
	
	public Galaxy22s(String number, String color) {
		super(number, color);
	} //생성자 물려받음 
	
	//필요한 기능 재정의 
	@Override
	public void call() {
		System.out.println("갤럭시22s 전화 기능 실행.");
	}
	@Override
	public void sms() {
		System.out.println("갤럭시22s 문자 기능 실행.");
	}
	@Override
	public void samsungPay() {
		System.out.println("갤럭시22s 삼성페이 기능 실행.");
	}
	//고유기능 추가 
	public void bixby() {
		System.out.println("갤럭시22s 음성인식 기능 실행.");
	}
}
