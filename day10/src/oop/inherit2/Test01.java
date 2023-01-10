package oop.inherit2;

public class Test01 {
	public static void main(String[] args) {
		//IPhone14 객체를 생성
		
		IPhone14 a = new IPhone14();
		a.setNumber("010-5053-1973");
		a.setColor("black");
		
		a.call();
		a.sms();
		a.airDrop();
		
		//GalaxyFold4 객체를 생성 
		GalaxyFold4 b = new GalaxyFold4();
		b.setNumber("010-5053-2973");
		b.setColor("white");
		
		b.call();
		b.sms();
		b.samsungPay();
		
	}

}
