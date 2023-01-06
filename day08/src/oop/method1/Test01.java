package oop.method1;

public class Test01 {

	public static void main(String[] args) {

		// 객체 생성
		Telecom a1 = new Telecom();
		Telecom a2 = new Telecom();
		Telecom a3 = new Telecom();

		// 데이터 초기화
		a1.setting("SK", "5G언택트 52", 52000, 200, 1000, 2000);
		a2.setting("KT", "5G세이브", 45000, 100, 900, 1500);
		a3.setting("LG", "5G시그니처", 130000, 500, 2000, 2500);

		// 출력
		a1.output();
		a2.output();
		a3.output();

	}
}
//표 모양으로 되어 있는건 전부 다 객체로 만들 수 있음. 