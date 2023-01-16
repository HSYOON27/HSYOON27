package api.util.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test02_5 {

	public static void main(String[] args) {
		
		//배열 정렬
				//- Arrays는 원시형과 문자열은 오름차순 정렬이 가능
				//- 다른 방식이나 객체일 경우는 정렬 기준을 따로 구현해야 한다
				//- java.util.Comparator를 사용하여 정렬 기준을 생성
				String[] arr = new String[] {"자바", "파이썬","구글","나다","다다"};
								
				//Arrays.sort(data);//무조건 오름차순
				
				Arrays.sort(arr, Collections.reverseOrder());
				
				
				System.out.println(Arrays.toString(arr));
			}
		}





