package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		
		//데이터 준비
		Set<String> galaxy = Set.of("통화","문자","게임","영통","삼성페이"); //이러면 불변
		Set<String> iphone = Set.of("통화","문자","게임","아이튠즈","시리"); 
		
		//합집합 - 두 휴대폰이 가진 모든 기능 - 식으로는 galaxy u iphone - union이라 부름 
		Set<String> union = new TreeSet<>();
		union.addAll(galaxy);
		union.addAll(iphone);  //한번에는 못해 이렇게 나눠서 해야함 
		
		System.out.println(union);
		
		//교집합 - 두 휴대폰이 가진 공통 기능 - galaxy iphone - intersection 이라 부름 
		Set<String> intersect = new TreeSet<>(galaxy);
		intersect.retainAll(iphone); //겹치는 것 제외 제거하는 명령어. retainAll
		System.out.println(intersect);

		//차집합 - 어느 한 쪽 휴대폰만 가진 기능 - minus라고 함 
		//galaxy - iphone 또는 iphone - galaxy
		Set<String> minus = new TreeSet<>(galaxy);
		minus.removeAll(iphone);
		System.out.println(minus); // = 갤럭시의 고유기능만 나오게 해!
		

	}

}
