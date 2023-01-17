package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test04_2 {

	public static void main(String[] args) {
		//List의 인덱스 접근 
		
		List<Integer> list = new ArrayList<>();
		list.add(100); //int -> Integer (자동 포장, 이런걸 auto-boxing이라 부름.)
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(3, 600); //리스트는 중간삽입이 된다 이거. 
		
        //foreach 구문(확장 for 라고도 함)
		//-어차피 전체를 처리할 생각이라면, 인덱스를 생략하고 추출한 값을 담을 변수만 정의
		//-Iterable을 상속받은 클래스라면 모두 사용 가능한 구문. 
		//- 전체만 가능하다는 단점이 있음. 일부분은 안됑 
		
		for(int n : list) { //Integer --> int (자동 포장해제, auto-unboxing 이라 부름)
			System.out.println(n);
		}
		for(int i = 0; i<list.size(); i++) {
		System.out.println(list.get(i));
		}
		//숫자로 하면 정확하게 알 수 없으니 list.size()로 
		
	}

}
