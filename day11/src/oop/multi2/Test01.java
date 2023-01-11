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
	    
	    
	}

}
