package api.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test02 {

	public static void main(String[] args) {
		//List 생성 
		//List<형태> a = new ArrayList<형태>();
		//(주의) 형태는 무적권 클래스여야 함. 원시형은 Wrapper 클래스로 대체하여 설정. int불가능 쓸거면 Integer
		
		List<String> a = new ArrayList<String>(); //앞으론 앵간하면 얘만 쓸거. 왜? 
		List<String> b = new LinkedList<String>();

		//데이터 추가.(지정한 형태로만 해야지 내가 스트링 넣겠다 하고 인트 넣고 그러면 안돼)
		a.add("마리오");
		a.add("루이지");
		a.add("쿠파");
		
		System.out.println(a);
		
		b.add("마리오");
		b.add("루이지");
		b.add("쿠파");
		
		System.out.println(b);
		
		//포함검사
		System.out.println(a.contains("피카츄"));
		System.out.println(a.contains("루이지"));
		
		//개수 검사
		System.out.println(a.size()); //실 데이터 개수
		
		//위치 검사
		System.out.println(a.indexOf("루이지")); //1번위치에 있당. 
		System.out.println(a.indexOf("피카츄"));
		
		//삭제
		a.remove("마리오"); //마리오 데이터와 일치하는 항목을 삭제. 데이터나 인덱스 둘다로 가능하다 이거
		b.remove(0); //0번 인덱스에 존재하는 항목을 삭제(나머지가 앞으로 이동) 
		
		System.out.println(a);
		System.out.println(b);
	}

}
