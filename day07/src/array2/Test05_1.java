package array2;

public class Test05_1 {

	public static void main(String[] args) {
		
		//딱 지금 상황만 쓸 수 있는 방법.
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		int backup = data[0];
		int backup1 = data[1];
		
		data[0] = data[4];
		data[4] = backup;
		
		data[1] = data[3];
		data[3] = backup1;
		
		for(int i=0; i<data.length; i++){
		
			System.out.print(data[i]);
			System.out.print(" ");
		}
		System.out.println();
		
	}
}
//30, 50, 20, 10, 40을 배열에 저장한뒤 
//모든 데이터 순서를 거꾸로 뒤집어서 재배치 후 출력 
// 최초 : 30, 50, 20, 10, 40
// 변경 : 40, 10, 20, 50, 30