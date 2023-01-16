package api.util.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Test02_1 {

	public static void main(String[] args) {

		Integer[] data = new Integer[] { 30, 50, 20, 10, 40 };

		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;// 내림차순
				// return o1-o2;//오름차순
			}
		};

		
		// Arrays.sort(data);//무조건 오름차순
		Arrays.sort(data, c);// 우측에 정의된 기준에 따라 정렬

		System.out.println(Arrays.toString(data));
	}
}
