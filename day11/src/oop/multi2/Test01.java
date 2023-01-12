package oop.multi2;

public class Test01 {
	public static void main(String[] args) {
		
		Airplane a = new Airplane();
		a.fly();
		a.reservation();
		
		Bus b = new Bus();
		b.move();
		
		Drone c = new Drone();
		c.fly();
		c.move();
		c.on();
		c.off();
		
	    Kickboard d = new Kickboard();
	    d.on();
	    d.off();
	    d.move();
	    
	    Train e = new Train();
	    e.move();
	    e.reservation();
	    
	    test(c); // 자료형으로 검사를 해버린 것.
	    test(a); 	    
	    
	    test2(c);
	    
	    
	}
	//이 메소드는 Flyable을 상속받은 클래스만 상속이 가능하다. 
	
	public static void test(Flyable flyable) {
	}

	public static void test2(Electronic electronic) {
	}

}
