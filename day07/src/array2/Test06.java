package array2;

public class Test06 {

	public static void main(String[] args) {
		
		int[] data = new int[]{30, 50, 20, 10, 40};
		                      //0   1   2  3   4 
		                    //4->0 0->1 1->2 2->3 3->4
		                    //4->1 0->2 1->3 2->4 3->0
		
		//2바퀴 할땐 아래 내용을 2번 반복한다는 의미로 
		for(int k=0; k<2; k++) {
		//1바퀴 회전 
		int backup = data[data.length-1]; //마지막 데이터  렝스는 5니까 -1해줘야함.
		
		for(int i = data.length-1; i>0; i--) { //마지막부터(4부터) 1까지 
			data[i] = data[i-1];
		}
		data[0] = backup;
		}
		
//		data[4] = data[3]; 
//		data[3] = data[2];
//		data[2] = data[1];
//		data[1] = data[0];
//      data[0] = backup;  		
//		
		for(int i=0; i<data.length; i++) {
	
			System.out.print(data[i]);
			System.out.print(" ");
			
		}
		System.out.println();
		
	}
}
//Test 06 -> 30, 50, 20, 10, 40 을 배열에 저장한 뒤 모든 데이터를 시계방향으로 2번 이동한 결과를 출력해라
//- 1회전 하면 40 30 50 20 10
//- 2회전 하면 10 40 30 50 20