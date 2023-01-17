package api.util.collection2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {

		Random r = new Random();
		Set<Integer> numbers = new TreeSet<>();
		while(numbers.size()<6) {
			int lotto = r.nextInt(45)+1;
			numbers.add(lotto);
		}
		System.out.println(numbers);
	}
}
//중복이 발생할리가 없으니까 if문으로 물어볼 일이 없다.
