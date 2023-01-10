package oop.keyword4;

public class GalaxyFold4 {

	//field
	
	//여기서는 데이터를 정적(Static)과 동적(Dynamic)으로 구분하여 생각하자!
	//- 정적인 데이터는 만들지 않아도 알 수 있으며, 모두가 동일하게 관리되어야 한다.
	//- 그렇기에 이러한 데이터는 Static 이라는 키워드를 이용해 표시를 해준다.
	//- static 선언을 하면 getter / setter 메소드도 static으로 구현해야 한다.
	
	private static String company = "삼성";
	
	//- 동적인 데이터는 객체를 만들면서 설정하며, 객체마다 각자 다르게 관리한다.
	//- 일반 필드로 생성한다
	private String number;
	private String color;
	//필드가 2개로 나뉘어짐.
	
	public GalaxyFold4(String number, String color) {
		this.setColor(color);
		this.setNumber(number);
		//this.setCompany("삼성"); 이건 비추천 
	}
	
	public void output(){
		System.out.println("번호 : " + this.getNumber());
		System.out.println("색상 : " + this.getColor());
		System.out.println("제조사 : " + getCompany()); //여기도 this라서오류 뜨는것. 
		//차라리 this를 적지 말던지 GalaxyFold4.getCompany()); 라고 쓰셈. 
	}
	
	public static String getCompany() {
		return company;
	}
	public static void setCompany(String company) {
		GalaxyFold4.company = company; //this.company 사용 불가함. 왜? 객체가 없으니까. 
		 //Static 메소드에서는 this를 못씀. 
	}
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
	
}
