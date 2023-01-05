package array2;

public class Test07 {

	public static void main(String[] args) {
		
		//목표 : 최소값, 최대값 찾기
		//데이터는 왼쪽(+0) 부터 살펴본다
		//맨 앞(+0) 데이터가 가장 작다고 생각하고시작
		//뒤에 데이터와 비교해서 더 작은 데이터를 찾으면, 최소값, 더 큰 데이터를 찾으면 최대값.

		int[] data = new int[] {30, 50, 20, 10, 40};
		
		//1. 맨 앞 데이터가 가장 작다고 가정을 한다. 그러니까 1~4까지랑만 비교를 함.
		int min = data[0];
		
		//2. 뒤에 데이터들 1~4과 비교
		for(int i = 1; i<=data.length-1; i++) {
			if(min > data[i]) { 
				min = data[i];
			}
		}
		
		System.out.println("최소값은 : " + min); 
		
}
}
