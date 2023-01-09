package oop.modifier5;

import oop.modifier4.Car;

public class Test01 {
	public static void main(String[] args) {
		//자바에서 접근 제한이 없다면 패키지 단위로 처리됩니다. 패키지가 기본.
		
//		Car c1 = new Car();
		
		Car c1 = new Car("소나타", 2000000);
//		c1.setName("소나타");  //클래스는 접근이 되지만 필드는 접근이 안돼 
//		c1.setPrice(20000000);
		
//	    System.out.println(c1.getName());
//	    System.out.println(c1.getPrice());
     
		c1.output();
		
	}

}
