package array2;

public class Test11_2 {
	public static void main(String[] args) {

		// 데이터 준비
		int[] data = new int[] { 30, 50, 20, 10, 40 };

		// 삽입 정렬
		for(int k =0; k<=4; k++) {
			
			int index = k;
			int backup = data[index];

			for (int i = index; i >= 0; i--) {
				if (backup < data[i]) {
					data[i + 1] = data[i]; // 오른쪽으로 이동
	                index--; //인덱스 위치를 왼쪽으로 한칸 이동합니다. 
	 			}
			}
			//System.out.println("index = "+ index);
			data[index] = backup;
		}
		
	}
}
// Test 11. [30, 50, 20, 10, 40]을 삽입 정렬 방식으로 정렬하세여.