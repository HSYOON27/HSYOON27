package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test05 {
	public static void main(String[] args) {
		
		//데이터 준비
		Set<String> chulsu = Set.of("아바타:물의길","더 퍼스트 슬램덩크", "영웅");
		Set<String> younghee = Set.of("영웅", "올빼미", "스위치", "신비아파트");
		
		//둘 다 본 영화 목록(교집합)
		Set<String> intersect = new TreeSet<>(chulsu);
		intersect.retainAll(younghee);
		
		System.out.println(intersect);
		
		//둘 중 한명만 본 영화(차집합) 철수만 본 영화 목록 
		Set<String> minus = new TreeSet<>(chulsu);
		minus.removeAll(younghee);
		System.out.println(minus);

		//영희만 본 영화 목록
		Set<String> minus1 = new TreeSet<>(younghee);
		minus1.removeAll(chulsu);
		System.out.println(minus1);
		
		Set<String> minus3 = new TreeSet<>(minus1);
		minus3.addAll(minus);
		System.out.println(minus3);
		
	}

}
