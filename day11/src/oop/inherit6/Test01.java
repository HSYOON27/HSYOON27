package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {
		
		Galaxy22s a = new Galaxy22s("010-5053-1973", "Black");
		
		a.call();
		a.sms();
		a.samsungPay();
		a.bixby();
		
		GalaxyFold4 b = new GalaxyFold4("010-5054-1974", "White");
		
		b.call();
		b.sms();
		b.samsungPay();
		b.iris();
		
		IPhone13 c = new IPhone13("010-5053-1975","Silver");
		
		c.call();
		c.sms();
		c.itunes();
		c.siri();
		
		IPhone14 d = new IPhone14("010-5053-1976","Gold");
		
		d.call();
		d.sms();
		d.faceTime();
		d.siri();
		
		

		
	}

}
