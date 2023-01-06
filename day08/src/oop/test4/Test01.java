package oop.test4;

public class Test01 {

	public static void main(String[] args) {

		//선수 객체 생성
		medal a1 = new medal();
		medal a2 = new medal();
		medal a3 = new medal();

		//데이터 초기화
		a1.name = "진종오";
		a1.event = "사격";
		a1.type = "하계";
		a1.gold = 4;
		a1.silver = 2;
		a1.bronze = 0;

		a2.name = "김수녕";
		a2.event = "양궁";
		a2.type = "하계";
		a2.gold = 4;
		a2.silver = 1;
		a2.bronze = 1;

		a3.name = "전이경";
		a3.event = "쇼트트랙";
		a3.type = "동계";
		a3.gold = 4;
		a3.silver = 0;
		a3.bronze = 1;
		
		System.out.println("이름"+" "+"종목"+" "+"구분"+" "+"금메달"+" "+"은메달"+" "+"동메달");
		System.out.println(a1.name+" "+ a1.event+" "+ a1.type+" "+ a1.gold+" " + a1.silver+" "+ a1.bronze);
		System.out.println(a2.name+" "+ a2.event+" "+ a2.type+" "+ a2.gold+" " + a2.silver+" "+ a2.bronze);
		System.out.println(a3.name+" "+ a3.event+" "+ a3.type+" "+ a3.gold+" " + a3.silver+" "+ a3.bronze);

	}

}
