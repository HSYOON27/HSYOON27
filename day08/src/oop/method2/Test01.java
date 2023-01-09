package oop.method2;

public class Test01 {

	public static void main(String[] args) {
	
		//객체 생성 
				Cafe a = new Cafe();
				Cafe b = new Cafe();
				Cafe c = new Cafe();
				Cafe d = new Cafe();
				
				
				//정보 설정
				a.setting("아메리카노", "음료", 2500, true);
				b.setting("모카라떼", "음료", 3500);
				c.setting("치즈케이크", "디저트", 5000, true);
				d.setting("마카롱", "디저트", 3000);

				//출력
				a.output();
				b.output();
				c.output();
				d.output();
	}   
	 
}
