package oop.inherit2;

//상위클래스(슈퍼클래스, 부모클래스 라고 부름)
//-객체 생성이 목적이 아니라, 클래스들의 공통점을 보관하기 위한 클래스 

public class Mobile {
	// 공통 필드
	private String number;
	private String color;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 공통 메소드
	public void call() {
		System.out.println("전화");
	}

	public void sms() {
		System.out.println("문자");
	}

}
