package array2;

public class Test05_2 {

	public static void main(String[] args) {
		
		//데이터 개수와 무관하게 사용하는 방법 
		
		//규칙이 있더라.
		// 1. 교체 횟수(반복 횟수)는 데이터개수/2 이다.
		// 2. 0번과 마지막(length-1) 부터 교체를 시작한다.
		
		
		int[] data = new int[] {30, 50, 20, 10, 40, 30};
		
		for(int i=0; i<data.length/2; i++) {
			int k=data.length-1-i;
			System.out.println("i = " + i + " , k = " + k);
			
			//[i] <-->[k]
			int backup = data[i];
			data[i] = data[k];
			data[k] = backup;
		}
		
		for(int i = 0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
//30, 50, 20, 10, 40을 배열에 저장한뒤 
//모든 데이터 순서를 거꾸로 뒤집어서 재배치 후 출력 
// 최초 : 30, 50, 20, 10, 40
// 변경 : 40, 10, 20, 50, 30