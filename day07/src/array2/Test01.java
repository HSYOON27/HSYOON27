package array2;

public class Test01 {

	public static void main(String[] args) {

		double[] array01 = new double[5];
		//array01 -> [0.0][0.0][0.0][0.0][0.0]
		double[] array02 = new double[] {1.1, 2.2, 3.3, 4.4, 5.5};
		//array02 -> [1.1][2.2][3.3][4.4][5.5]
		
		//2. 문자열 5개를 저장하는 배열(값을 모를때)
		String[] array03 = new String[5]; 
		//null은 참조변수(리모콘)의 대상이 존재하지 않음을 의미(본체없음)
		for(int i = 0; i < array03.length; i++) {
			System.out.println(array03[i]);
		}
		
		
		//3. "자바", "파이썬", "C++", "루비", "안드로이드"를 배열에 저장.
		String[] array04 = new String[] {"자바",	"파이썬", "C++", "루비", "안드로이드"};
		
		for(int i=0; i<array04.length; i++) {
			if(i<array04.length) {
			System.out.print(array04[i]);
			System.out.print(" ");
		}
		
		}
	}
}

//목표 int가 아닌 다른 데이터의 배열을 만드는 것 
//1. 실수 5개를 저장하는 배열 