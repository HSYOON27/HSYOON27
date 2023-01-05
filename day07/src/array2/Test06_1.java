package array2;

public class Test06_1 {

	public static void main(String[] args) {
		
		int[] data = new int[]{30, 50, 20, 10, 40};
	
		//동일 크기의 배열을 생성. 메모리를 덜씀 코드량은 많지만 이방법은.  
		int[] copy = new int [data.length];

		for(int i=0; i < data.length; i++) {
			int p = (i+2)% data.length;
					System.out.println("i = "+i + ", p = "+ p);
					copy[p] = data[i];
		}
		for(int i=0; i < data.length; i++) {
		
			System.out.print(data[i]);
			System.out.print(" ");
		}
		
	}
}
//Test 06 -> 30, 50, 20, 10, 40 을 배열에 저장한 뒤 모든 데이터를 시계방향으로 2번 이동한 결과를 출력해라
//- 1회전 하면 40 30 50 20 10
//- 2회전 하면 10 40 30 50 20