package array2;

public class Test10 {
	public static void main(String[] args) {

		//데이터 준비
		int[] data = new int[] { 30, 50, 20, 10, 40 };
		
		//1회차 정렬이기 때문에 반복은 한번으로 가능 
		// 0 vs 1 / 1 vs 2 / 2 vs 3 / 3 vs 4 이런식
 
	    for(int i=0; i<=3; i++) {
	    	//System.out.println("i = " + i + " , i+1 = " + (i+1));
	    	if(data[i] > data[i+1]) {
	    		int backup = data[i];
	    		data[i] = data[i+1];
	    		data[i+1] = backup;
	    	}
	    }
		
		//출력
	    
		for(int i = 0; i<data.length; i++) {
			System.out.print(data[i]);
			System.out.print(" ");
		}
		
		}
	}
//버블 정렬 (Bubble sort) 방식으로 정렬하세요