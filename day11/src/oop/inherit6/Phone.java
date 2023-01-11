package oop.inherit6;
//최상위 클래스 
public class Phone {

	//공통 필드 
	protected String number;
	protected String color;
	
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
	
	//생성자 - 반드시 초기화가 필요한 필드 
	
	public Phone(String number, String color) {
		this.number = number;
		this.color = color;
	}
	
	// 공통 메서드
		public void call() {
			System.out.println("통화");
		}
		public void sms() {
			System.out.println("통화");			
		}
		
		
}
