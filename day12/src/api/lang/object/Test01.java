package api.lang.object;

//import java.lang.Object; java.lang 패키지는 import를 하지 않아도 기본 제공이 되니까 이렇게 생략가능하다. 

public class Test01 {
	public static void main(String[] args) {
		//java.lang.Object 클래스 분석
		
		//[1] 객체 생성
		
		Object a = new Object();
		Object b = new Object();
		
		//[2] 객체 사용 
		//a.clone(); 안돼. 왜? 상속을 받아야 되는애라
		//a.finalize();		
		
		//(1) 객체는 일련번호로 관리한다. 
		//(2) 객체는 요약정보 확인 명령이 존재한다. 아래와 같은.
		//
	  
		
		System.out.println(a.hashCode()); //일련번호 자바에서 객체는 무적권 일련번호가 생김. 10진수 
		System.out.println(a.toString()); //자료형@일련번호 16진수 
		
	    System.out.println(b.hashCode());
	    System.out.println(b.toString());

	}

}
