package array2;

public class Test11 {
	public static void main(String[] args) {

		int[] data = new int[] { 30, 50, 20, 10, 40 };
		
		for(int i = 1; i<data.length; i++) { 
			int j = i-1; //비교대상
			int temp = data[i];  //비교하는 수를 임시 저장
			
			while(j>=0 && temp<data[j]) {// j의 값이 0보다 작고 temp값이 array[j]값보다 크면탈출
				data[j+1] = data[j]; //앞에 대상에 더 큰 경우 오른쪽으로 밀어낸다.
				j--;
			}
			data[j+1]=temp; //카피된 값 저장
		}
		for(int a = 0; a < data.length; a++) {
			System.out.println(data[a]);
		}
	}
}
// Test 11. [30, 50, 20, 10, 40]을 삽입 정렬 방식으로 정렬하세여.