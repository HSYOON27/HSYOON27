package oop.keyword5;

public class Test01 {
	public static void main(String[] args) {
		
		KhBank.setBaseRate(1.2);
		System.out.println(KhBank.getBaseRate());
		
		KhBank k1 = new KhBank("유재석", 0.3, 500000);
		KhBank k2 = new KhBank("강호동", 0.5, 350000);
		KhBank k3 = new KhBank("신동엽", 0.2, 800000);
		
		k1.output();
		k2.output();
		k3.output();
		

	}

}
