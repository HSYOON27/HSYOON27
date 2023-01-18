package api.util.collection4;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		//Map<K,V> 제너릭이 2개 붙음
		//- (K)ey, (V)alue가 세트로 저장되는 저장소이다 Map은!
		//- (K)ey만 보면 Set과 구조가 같음 (중복이 불가능하고)
		//- (V)alue는 중복이 가능하다. ex) ID 와 Password의 관계 
		//- (K)ey로 (V)alue를 부를 수 있다. 하지만 반대는 안된다. 
		
		Map<String, Integer> data = new HashMap<>();//오른쪽은 생략가능
		
		//System.out.println(data); //list, set과는 형태가 다름. {} [] 
		
		//데이터 추가 
		//- .add()는 한 개 추가하는 명령 
		//- .put()은 두 개를 세트로 추가하는 명령
		
		data.put("허니버터칩", 3000);
		data.put("참이슬후레시", 1500);
		data.put("처음처럼", 1400);
		data.put("카스", 2500);
		data.put("신라면", 1100);
		
		data.put("허니버터칩", 4000); //같은 이름이 들어가면 (V)alue가 수정 됨.

		//갯수 HashMap이기 때문에 정렬을 보장하지 않음. map도 무시 TreeSet이 정렬이지 
		System.out.println(data);
		System.out.println(data.size()); //1세트 이기 때문에 1.
		
		//검색 - (K)ey와 (V)alue를 따로 검색하도록 메소드 제공 
		System.out.println(data.containsKey("허니버터칩"));
		System.out.println(data.containsValue(2500));
		
		//추출 - (K)ey로 (V)alue를 추출
		System.out.println(data.get("신라면")); //신라면의 가격을 가져와라 
		System.out.println(data.get("짜빠게티")); //없는거 물어보면 false가 아니라 null이 나옴
		//int price = data.get("짜빠게티"); -> 이러면 에러가 나오지 그니까
		Integer price = data.get("짜빠게티");
		System.out.println(price);
		
		//삭제 - 
		data.remove("허니버터칩");
		System.out.println(data);
		System.out.println(data.size());


	}

}
