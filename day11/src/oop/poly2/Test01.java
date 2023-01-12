package oop.poly2;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//다형성 없이 풀이
		
		Scanner sc = new Scanner(System.in);
		System.out.print("직업을 선택하세요(1=전사, 2=마법사, 3=궁수 : ");
		int job = sc.nextInt();
		System.out.print("작업을 지시하세요(1=공격기능, 2=이동기능, 3=상점기능 :, 4=정보출력 : ");
		int action = sc.nextInt();
		sc.close();
		
		//다형성의 특징을 사용하지 않겠다는 것 = 자료형을 통합해서 쓰겠다는것 (업캐스팅)
		Game player;
		if(job == 1) {
			player = new Warrior("테스트 유저"); //Warrior->Player로 업캐스팅
		}
		else if(job == 2) {
			player = new Magician("테스트 유저");
		}
		else {
			player = new Archer("테스트 유저");
		}
		//System.out.println(player);
		
		if(action == 1) {
			player.attack();
		}
		else if(action == 2) {
			player.move();
		}
		else if(action == 3) {
			player.store();
		}
		else {
			player.information();
		}
		//다형성을 쓰지 않겠다 -> 자료형을 통합하지 않겠다. 있는 그대로 쓰겠다는 것. 아래처럼 븅신같이됌. 
//		if(job == 1) {
//			Warrior player = new Warrior("테스트유저");
//			if(action == 1) {
//				player.attack();
//			}
//			else if(action == 2) {
//				player.move();
//			}
//			else if(action == 3) {
//				player.store();
//			}
//			else  {
//				player.information();
//			}
//		}
//		else if(job == 2) {
//			Magician player = new Magician("테스트유저");
//			if(action == 1) {
//				player.attack();
//			}
//			else if(action == 2) {
//				player.move();
//			}
//			else if(action == 3) {
//				player.store();
//			}
//			else  {
//				player.information();
//			}
//		}
//		else {
//			Archer player = new Archer("테스트유저");
//			if(action == 1) {
//				player.attack();
//			}
//			else if(action == 2) {
//				player.move();
//			}
//			else if(action == 3) {
//				player.store();
//			}
//			else  {
//				player.information();
//			}
//		}
		
		
		

		

}
}