package api.util.collection;

public class Test09 {
	public static void main(String[] args) {

		int count = 0;

		int[] data = new int[] { 5, 2, 4, 7, 3 };

		for (int i = 0; i < data.length; i++) {

			if (data[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("총 " + count + "개 입니다");
	}
}
