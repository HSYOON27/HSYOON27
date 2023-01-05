package array2;

public class Test08 {

	public static void main(String[] args) {
		
		double[] data = new double[] {150.8, 180.2, 175.9, 162.7, 170.3};
		                            
		double max = data[0];
        int index = 0;
        
        for(int i = 1; i<data.length; i++) {
        	if(data[index] < data[i]) {
        		index = i;//위치수정
        		
        	}
        }
		
		for(int i = 1; i<=data.length-1; i++) //배열은 어차피 0,1,2,3,4 이기 때문에 무적권 인트
			{ if(max < data[i]) {
				max = data[i];
			}	
		}
	
		System.out.println("가장 키가 큰 사람의 키는 " + max);
	    System.out.println("가장 키가 큰 사람의 위치는 " + index);
	}
}
//Test08 5명 키가 다음과 같을 때 가장 키가 큰 사람의 위치와 값을 출력
//- 데이터{150.8, 180.2, 175.9, 162.7, 170.3}