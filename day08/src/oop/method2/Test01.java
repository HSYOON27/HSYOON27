package oop.method2;

public class Test01 {

	public static void main(String[] args) {
	
		//객체 생성 
		Cafe a1 = new Cafe();
		Cafe a2 = new Cafe();
		Cafe a3 = new Cafe();
		Cafe a4 = new Cafe();
		
		
		//데이터 초기화
		a1.setting("아메리카노", "음료", 2500, "행사중");
		a2.setting("모카라떼", "음료", 3500, "-");
		a3.setting("치즈케이크", "디저트", 5000, "행사중");
		a4.setting("마카롱", "디저트", 3000, "-");

		//출력
		a1.output();
		a2.output();
		a3.output();
		a4.output();
	}   
	 
}
