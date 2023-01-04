package array;

public class Test03 {

	public static void main(String[] args) {

		//배열생성 
		int[] data = new int[] { 33, 45, 31, 54, 67, 36, 39 };
		int total=0;
		// 1. 모든 데이터 출력
		for (int i = 0; i < data.length; i++) {
			System.out.println("1. 모든 데이터는 " + data[i]);
		}
		
		//2. 짝수 데이터 출력
		for (int i = 0; i<data.length; i++) {
			if(data[i]%2==0) {
				System.out.println("2. 짝수 데이터는 " + data[i]);
			}
		}
		//3. 50이 넘는 데이터 개수 출력
		int count=0;
		for (int i = 0; i<data.length; i++) {
			if(data[i]>50) {
				count++;			
			}
		}
		System.out.println("3. 50이 넘는 데이터의 갯수는 "+count);
		//4. 모든 데이터 합계 출력
		for (int i = 0; i<data.length; i++) {
			total += data[i];			
		}
		System.out.println("4. 모든 데이터의 합은 " + total);

		//5. 모든 데이터의 평균 출력
		
		System.out.println("5. 모든 데이터의 평균 값은 " + (double)total/(data.length));
		
	}
}
// Test03 다음 데이터 저장하고 문제에서 요구하는 내용을 구현하셈
// 데이터 : 33, 45, 31, 54, 67, 36, 39
// 요구사항 
// 1. 모든 데이터 출력
// 2. 짝수 데이터 출력
// 3. 50이 넘는 데이터 개수 출력
// 4. 모든 데이터 합계 출력
// 5. 모든 데이터 평균 출력