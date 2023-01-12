package api.lang.spring;

public class Test05 {
	public static void main(String[] args) {
		//문자열 편집
		//- 문자열은 불변(immutable) 속성을 가진다
		//- 한 번 만들어진 문자열은 바뀌지 않음, 바꾸고 싶어? 그러면 새로 만드셈 
		
		//소문자 변환 : .toLowerCase()
		//대문자 변환 : .toUpperCase()
		
		String url = "WWW.NAVER.COM";
		System.out.println(url.toLowerCase()); //소문자로 바꾸라는 명령어
		System.out.println(url);
		
	    url = url.toLowerCase();
	    System.out.println(url); //이러한 특징 정도가 있다!~ 
	    
	    String url2 = "              www.naver.com                         ";
	    url2 = url2.trim();
	    //trim = 자르다 라는뜻
	    System.out.println(url2.length());
	    
	    String url3 = "www.google.com";
	    System.out.println(url3.substring(4,10)); //4~9까지
	    System.out.println(url3.charAt(4));// 4위치의 글을 추출한다. 라는 명령어 (char);
	    
	    String text = "나는 피자가 좋아요";
	    System.out.println(text.replace("피자", "자바"));
	    
	}

}
