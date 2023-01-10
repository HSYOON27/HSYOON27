package oop.keyword8;

import java.util.Random;

public class Test04 {
	static final int SCISSORS = 0;
	static final int ROCK = 1;
	static final int PAPER = 2;
	
	public static void main(String[] args) {
	
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

