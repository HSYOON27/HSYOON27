package oop.modifier3;

public class Academy {

	// field
	private String name;
	private int time;
	private int price;
	private String type;

	// setter method - 설정용 메소드 세터 게터 설정 가능 
	void setName(String name) {
		this.name = name;
	}

	void setTime(int time) {
		if (time < 0 || time % 30 != 0) {
			return;
		}
		this.time = time;

	}

	void setPrice(int price) {
		if (price < 0) {
			return;
		}
		this.price = price;
	}

	void setType(String type) {
		switch(type) {
		case "오프라인", "온라인", "혼합" : 
		this.type = type;
		}
	}

//getter method - 확인용 , 반환용 매서드. println에 쓰는거

		String getName() {
			return this.name;
		}
		int getTime() {
			return this.time;
		}
		int getPrice() {
			return this.price;
		}
		String getType() {
			return this.type;
		}
		//constructor
		Academy(String name, int time, int price, String type){
			this.setName(name);
			this.setTime(time);
			this.setPrice(price);
			this.setType(type);
		}
		//method
		void output() {
			System.out.println("<학원 강의 요금표>");
			System.out.println("강좌명 : " + 	getName());
			System.out.println("강의 시간 : "+ "" + getTime());
			System.out.println("수강료 : " + getPrice());
			System.out.println("구분 : " + getType());
		    System.out.println();
		    
		    
		
		}
}