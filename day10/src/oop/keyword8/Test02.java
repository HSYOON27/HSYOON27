package oop.keyword8;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		//목표 : static과 final을 같이 쓰는 이유 
		
		//(ex) 화면에 랜덤으로 가위/바위/보 하나가 출력
	    //-가위는 0이라고 치자
		//-바위는 1이라고 치자
		//-보는 2라고 치자 
		final int scissors = 0;
		final int rock = 1;
		final int paper = 2;
	 
		Random r = new Random();
		int rsp = r.nextInt(3);
		System.out.println("rsp 는 : " + rsp);
		
		switch(rsp) {
		case scissors:
			System.out.println("가위");
			break;
		case rock:
			System.out.println("바위");
			break;
		case paper:
			System.out.println("보");
			break;
			
		}
		
	}

}
