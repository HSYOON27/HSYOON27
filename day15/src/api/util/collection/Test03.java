package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>(6);

		for (int i = 0; i < 6; i++) {
			System.out.println((int)(Math.random() * 45) + 1);
		}
		
		int[] temp = new int[6];
		int count = 0;
		
		
	}

}
//이번주 로또번호 6개를 리스트에 저장하고 출력. 1~45 중복없는 무작위 정수 