package oop.method3;

public class Test01 {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		Phone p2 = new Phone();
		Phone p3 = new Phone();
		Phone p4 = new Phone();

		p1.setting("갤럭시 22s", "SK", 1800000);
		p2.setting("갤럭시 22s", "KT", 1750000, 24);
		p3.setting("아이폰 14", "LG", 2000000, 30);
		p4.setting("아이폰 14", "SK", 1990000);

		p1.output();
		p2.output();
		p3.output();
		p4.output();

	}
}
