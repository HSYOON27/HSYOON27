package api.util.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Test02 {

	public static void main(String[] args) {
		//배열 정렬 
		//- Arrays는 우너시형과 문자열이 오름차순 정렬이 가능. 
		//- 다른 방식이나 객체일 경우는 정렬 기준을 따로 구현해야 한다.
		//- java.util.Comparator를 사용하여 정렬 할 수 있다.(즉 기준을 생성)
		
		Integer [] data = new Integer [] {30, 50, 20, 10, 40};
		
		Comparator<Integer> c = new Comparator<Integer>() {
		
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1; //내림차순 
			//	return o1-o2; //오름차순
				
//				//o1이 앞데이터 o2가 뒤 데이터
//				//0은 아무것도 안함(같음). 음수는 순서유지, 양수는 순서 변경 
//				if(o1>o2) return -1; //음수를 반환 순서 유지
//				else if(o1<o2) return 1; //양수를 반환 순서 변경 
//				return 0;
				
			}
		};
		
		
	
		
		//Arrays.sort(data); //sort로 정렬 쌉가능 하지만 바꾸질 못한다는 큰 단점. 난 내림차순 하고싶은데 등등
		//그래서 sort가 두개다. 얘는 무적권 오름차순
		
		Arrays.sort(data, c);//우측 기준에 따라 정렬함 
		
		
		System.out.println(Arrays.toString(data));
	
	}

}
