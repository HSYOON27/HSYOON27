package array;

public class Test02_1 {

	public static void main(String[] args) {

		// 배열 생성
		int[] data = new int[]{10, 20, 30, 40, 50};
		
		for (int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		   
		}
		 System.out.println(data.length);
		
		for (int i = 0; i <data.length; i++) {
			System.out.println(data[i]);
		}
		
		int total = 0;
		
		for (int i = 0; i <data.length; i++) {

			total += data[i];


			System.out.println(total);
		}
	}
}