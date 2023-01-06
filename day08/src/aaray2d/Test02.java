package aaray2d;

public class Test02 {

	public static void main(String[] args) {

	int[] a = new int[] {10, 20, 30};
	int[] b = new int[] {40, 50, 60};
	
	for(int i=0; i<a.length; i++) {
		System.out.print(a[i]);
		System.out.print("\t");
	}
	System.out.println();
	
	for(int i=0; i<b.length; i++) {
		System.out.print(b[i]);
		System.out.print("\t");
	}
	System.out.println();
	
	}

}
//2차원 배열 
//-표의 형태를 가진 데이터 저장소다 라는데 반은 맞고 반은 틀린 말. 
//-좀 더 정확하게는 1차원 배열이 모인 형태. 
//1차원 배열이 2개니까 반복문도 2개다.
//1차원 배열이 3개면 반복문도 3개겠지? 이러니까 2차원 배열을 쓰는것. 