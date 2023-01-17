package api.util.collection;

import java.util.Random;

public class Test03_2 {
	public static void main(String[] args) {

		Random r = new Random();
		
		int[] numbers = new int[6];
		
		for(int i = 0; i<6; i++) {
		numbers[i] = r.nextInt(45)+1;
		System.out.println(numbers[i]);
		}
		
	}

}
//이번주 로또번호 6개를 리스트에 저장하고 출력. 1~45 중복없는 무작위 정수 