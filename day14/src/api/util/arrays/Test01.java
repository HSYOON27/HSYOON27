package api.util.arrays;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		
		//Arrays 클래스
		//- 배열에 대한 도우미임 얘는
		//- 배열은 반복문이 무적권 나오는데 얘는 그러한 반복문을 최소화 시켜준다
		//- 보통 1차원 배열에서 많이 씀 
		
		int [] a = new int[] {30, 50, 20, 10, 40};
		
		
			System.out.println(Arrays.toString(a));
		
		    // 얘는 안씀 System.out.println(a.toString());
			
		//int [] b = new int[] {30, 50, 20, 10, 40};	
		int [] b= Arrays.copyOf(a, a.length);
		
		System.out.println(a==b);//레퍼런스는 당연히 다름
		System.out.println(a.equals(b)); //배열은 equals 재정의가 불가능함. 
		System.out.println(Arrays.equals(a, b)); //내용물 비교 전체를 비교하는거라 아예 똑같아야 함.
		
		int [] c= new int[10]; //10번. 횟수에 대한 
		
		Arrays.fill(c, 20); //내용물에 대한 
		System.out.println(Arrays.toString(c));

	}

}
