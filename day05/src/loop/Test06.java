package loop;

public class Test06 {

	public static void main(String[] args) {
     //반복문의 활용 = 카운트, 누적합계
		
	 //(Q) 1부터 100 사이의 짝수 개수는?
	 //미리 카운트 측정을 위한 변수를 0으로 설정
		int count = 0;
		
    	for(int i = 1; i<=100; i++) {
	    if(i % 2==0) {//System.out.println(i);
	    count++;
	    }
     // count는 0에서 부터 샐거, i의 값은 1부터 100이하까지 ++로 
	 // i의 값을 2로 나눴을때 나머지가 0인 경우
	 // count가 증가함 
	    
	 //(Q) 1부터 100까지의 합계는? 
	
	}
    	System.out.println("count = "+count);
    	
    	int total = 0;
    	for(int i = 1; i<=100; i++) {
    		total += i;
    	}
    	System.out.println("total = " + total);
    	}
	
	}
