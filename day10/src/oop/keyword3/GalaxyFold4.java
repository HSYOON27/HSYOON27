package oop.keyword3;

public class GalaxyFold4 {
	
	private String number; // 전번
	private String company;// 제조사
	private String color; // 색상
	
	
	//여기서 생성자와 아웃풋 정도 추가하면 끝
	
	public GalaxyFold4(String number, String color) {
		this.setCompany("삼성");
		this.setNumber(number);
		this.setColor(color);
	}
	public void output() {
		System.out.println("제조사 : " + this.getCompany());
		System.out.println("전화번호 : " + this.getNumber());
		System.out.println("색상 : " + this.getColor());
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
