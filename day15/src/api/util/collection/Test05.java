package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test05 {

	public static void main(String[] args) {
		//Collection을 도와주는 Collections 클래스에 대해 배워봅시다.
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i<=10; i++) {
			list.add(i);
		}
		
		System.out.println(list);

		Collections.reverse(list); //뒤집기 
		System.out.println(list);
	
		Collections.shuffle(list);	//셔플, 뒤섞기 
		System.out.println(list);
		
		//Collections.sort(list); //정렬 
		Collections.sort(list, (a,b)->b-a); //lambda 
		System.out.println(list);
		
	}

}
