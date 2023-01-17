package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test04 {

	public static void main(String[] args) {
		//List의 인덱스 접근 
		
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(3, 600); //리스트는 중간삽입이 된다 이거. 
		
		//System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		//System.out.println(list.get(6));
		
	}

}
