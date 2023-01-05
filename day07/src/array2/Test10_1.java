package array2;

public class Test10_1 {
	public static void main(String[] args) {

		//데이터 준비
		int[] data = new int[] { 30, 50, 20, 10, 40 };
		
		//2회차 정렬 
		// 0 vs 1 / 1 vs 2 / 2 vs 3 이렇게 3번만 함. 
		
		//회차가 변할때마다 마지막 숫자가 3, 2, 1, 0 으로 줄어든다.

        for(int k=data.length-1; k>0; k--) {		
	    for(int i=0; i<k; i++) {
	    	//System.out.println("i = " + i + " , i+1 = " + (i+1));
	    	if(data[i] > data[i+1]) {
	    		int backup = data[i];
	    		data[i] = data[i+1];
	    		data[i+1] = backup;
	    	}
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