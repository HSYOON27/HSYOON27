package array2;

public class Test09_1 {

	public static void main(String[] args) {

		//데이터 준비
		int[] data = new int[] { 30, 50, 20, 10, 40 };

		//처리
		//선택정렬 1회차 : 전체 범위에서 가장 작은 값을 찾아 맨 앞 데이터와 교체 

		int index = 0; //0번 위치가 가장 작은 데이터라고 치자!
		for(int i = 1; i<data.length; i++) {
			if(data[index] > data[i]) {
				index = i; 
			}
		}
		System.out.println(index);
		
		int backup = data[0];
		data[0] = data[index];
		data[index] = backup;
		
		
		//출력 
		for(int i=0; i <data.length; i++) {
			System.out.print(data[i]);
			System.out.print(" ");
		}
	}
}
//Test09 데이터값을 선택정렬(Selection sort) 방식으로 정렬하세여