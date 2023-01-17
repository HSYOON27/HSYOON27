package api.util.collection2;

import java.util.HashSet;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {
		//- Set 정해진방식
		//- 정해진 방식에 의해 데이터를 저장하는 중복 없는 저장소
		//- 주 목적은 전체를 빠르게 조회하는 것. 
		
		//Set<Integer> set = new TreeSet<>();
		Set<Integer> set = new HashSet<>();
		
		set.add(50);
		set.add(30);
		set.add(80);
		set.add(10);
		set.add(40);
		set.add(90);
		set.add(70);
		
		set.add(70);
		set.add(70);
		set.add(70);
		

		System.out.println(set); //list랑 완전히 다른구조 위에서 내려다 보는 
		System.out.println(set.size());
		System.out.println(set.contains(10)); //'10'이 있어여?
		System.out.println(set.contains(7));
		//System.out.println(set.IndexOf()); // 얜 없어. 왜 ? 위치가 없으니까 IndexOf가 위치 찾는앤데
		set.remove(5);
		System.out.println(set);
		
		//get()도 없음. 왜?? 위치가 없다니까. 

		//forEach는 있음 왜? 얜 걍 다가져오는거니까 
		for(int n : set) {
			System.out.println(n);
		}


	}

}
