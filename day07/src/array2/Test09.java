package array2;

public class Test09 {

	public static void main(String[] args) {

		int[] data = new int[] { 30, 50, 20, 10, 40 };

		for(int i = 0; i < data.length; i++) {
			for(int j = i+1; j<data.length; j++) {
				if (data[i] > data[j]) {
					
					int backup = data[i];
					data[i] = data[j];
					data[j] = backup;
				}
			}
		}
		for (int i = 0; i < data.length; i++) {
			
			System.out.print(data[i]);
			System.out.print(" ");

		}
	}
}
//Test09 데이터값을 선택정렬(Selection sort) 방식으로 정렬하세여