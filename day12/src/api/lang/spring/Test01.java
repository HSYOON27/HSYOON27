package api.lang.spring;

public class Test01 {
	public static void main(String[] args) {
		//java.lang.string 클래스
		
		//객체 생성
		String a = "hello"; // 원래 사용하던 방법 
		String b = new String("hello");
		
		char[] ch = new char[] {'h','e','l','l','o'};
		String c = new String(ch);
		
		//메소드 사용
		
		
		System.out.println(a.length());//글자수
		System.out.println(b.length());//똑같이 5. a는 객체 생성도 안했는데 뭐지 싶음. 
		
		//비교
		System.out.println(a == b); //동일비교(의미없음)
		System.out.println(a.equals(b)); //동등비교(글자가 같은지)
		
		//비교는 대소문자도 구분할 수 있다.
		String d = "Hello";
		System.out.println(a.equals(d)); //동등비교(글자가 같은지)
		System.out.println(a.equalsIgnoreCase(d)); //대소문자를 무시하고 비교하라는 명령 
		
		//문자열은 전체가 아닌 일부만 비교하는 경우도 있음. 
		String e = "https://iei.or.kr";
		
		System.out.println(e.startsWith("http"));  //시작검사 http로 시작하나요? 라고 묻는 명령어임. 
		System.out.println(e.endsWith("kr"));//종료 검사. or.kr로 해도 노상관
		System.out.println(e.contains("iei"));//포함 검사, 유사 검사라고도 하는데 포함이 와닿네 
		System.out.println(e.indexOf("iei")); //위치검사임 얘는 0부터 시작.
		

	}

}
