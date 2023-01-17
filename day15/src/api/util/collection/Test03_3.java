package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test03_3 {
	public static void main(String[] args) {

		Random r = new Random();

		List<Integer> numbers = new ArrayList<Integer>();

		for (int i = 0; i < 6; i++) {
			int lotto = r.nextInt(45) + 1;
			if(!numbers.contains(lotto)) {numbers.add(lotto);  //똑같은 숫자가 없다면 이라는 소리 
			}
			else {
				i--;//다시뽑아라 i--; 다시 
			}
		}
		System.out.println(numbers);

	}

}
//이번주 로또번호 6개를 리스트에 저장하고 출력. 1~45 중복없는 무작위 정수 