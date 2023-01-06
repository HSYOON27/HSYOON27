package oop.test4;

public class medal {

	// member field - 데이터
	String name; // 콤마로도 구분 가능 같은 형태는.
	String event;
	String type;
	int gold;
	int silver;
	int bronze;

	// member method - 코드

	// 기본형태 : void 이름(준비물) { 코드 }
	// -this : 코드가 실행될 당시의 주인공(=자기 자신 객체, 내꺼)

	void output() { 
		System.out.println("<선수 정보>");
		System.out.println("이름 : " + this.name);
		System.out.println("종목 : " + this.event);
		System.out.println("구분 : " + this.type);
		System.out.println("금 : " + this.gold);
		System.out.println("은 : " + this.silver);
		System.out.println("동 : " + this.bronze);
    }

	void setting(String name, String event, String type,
			     int gold, int silver, int bronze) {
		this.name = name;
		this.event = event;
		this.type = type;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}

}
