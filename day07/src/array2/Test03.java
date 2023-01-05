package array2;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {

		int[] data = new int[] {30, 50, 20, 10, 40};
		
		for(int i = 0; i<data.length; i++) {
			System.out.print(data[i]);
            System.out.print(" ");
		}
		System.out.println();
		
		//ex 무작위로 데이터 1개 출력
		Random r = new Random();
		int index = r.nextInt(data.length);
		int choice = data[index];
		System.out.println("choice = " + choice);
		
		
	}
}
//목표 : 배열에서 자주 하는 작업
