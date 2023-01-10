package oop.keyword8;

import java.util.Random;

public class Test03 {
	
	static final int SCISSORS = 0;
	static final int ROCK = 1;
	static final int PAPER = 2;
    // 약속이 주석이 아니라 변수로 만들어놓고 싶어서 이렇게 사용.
	// 즉 상수라고함 Constant - 언제나 변하지 않고 한결같은 값을 가지는 변수
	// 가독성을 높이기 위해서 약속을 명문화 하는 기능을 위해 사용하는것.
	// 일반적으로 상수는 대문자로 작성 
	
	public static void main(String[] args) {
		//목표 : static과 final을 같이 쓰는 이유 
		
		//(ex) 화면에 랜덤으로 가위/바위/보 하나가 출력
	    //-가위는 0이라고 치자
		//-바위는 1이라고 치자
		//-보는 2라고 치자 
	
		Random r = new Random();
		int rsp = r.nextInt(3);
		System.out.println("rsp 는 : " + rsp);
		
		switch(rsp) {
		case SCISSORS:
			System.out.println("가위");
			break;
		case ROCK:
			System.out.println("바위");
			break;
		case PAPER:
			System.out.println("보");
			break;
			
		}
		
	}

}
