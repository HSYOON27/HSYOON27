package oop.test4;

public class Test02 {

	public static void main(String[] args) {

		//선수 객체 생성
		medal a1 = new medal();
		medal a2 = new medal();
		medal a3 = new medal();

		//데이터 초기화
		
		a1.setting("진종오", "사격", "하계", 4, 2, 0);
		a2.setting("김수녕", "양궁", "하계", 4, 1, 1);
		a3.setting("전이경", "쇼트트랙", "동계", 4, 0, 1);
		
//		a1.name = "진종오";
//		a1.event = "사격";
//		a1.type = "하계";
//		a1.gold = 4;
//		a1.silver = 2;
//		a1.bronze = 0;

//		a2.name = "김수녕";
//		a2.event = "양궁";
//		a2.type = "하계";
//		a2.gold = 4;
//		a2.silver = 1;
//		a2.bronze = 1;
//
//		a3.name = "전이경";
//		a3.event = "쇼트트랙";
//		a3.type = "동계";
//		a3.gold = 4;
//		a3.silver = 0;
//		a3.bronze = 1;
//		
        a1.output(); //a1을 주인공으로 해서 output의 코드를 실행하라(this -> a1)
        a2.output(); //a2를 주인공으로 해서 output의 코드를 싱행하라(this -> a2)
        a3.output(); //a3를 주인공으로 해서 output의 코드를 싱행하라(this -> a3)
	}

}
