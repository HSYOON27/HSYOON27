package oop.method4;

public class Test01 {
	public static void main(String[] args) {
		
		Coupang a = new Coupang();
		Coupang b = new Coupang();
		Coupang c = new Coupang();
		Coupang d = new Coupang();
		
		a.setting("참이슬 후레쉬", "주류", 1200, true, true);
		b.setting("클라우드 맥주", "주류", 3000, false, true);
		c.setting("바나나킥", "과자", 1500, false, true);
		d.setting("허니버터칩", "과자", 2000, true, false);

		a.output();
		b.output();
		c.output();
		d.output();


	}

}
