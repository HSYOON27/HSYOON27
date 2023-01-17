package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test04_1 {

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
		for(int i = 0; i<list.size(); i++) {
		System.out.println(list.get(i));
		}
		//숫자로 하면 정확하게 알 수 없으니 list.size()로 
		
	}

}
