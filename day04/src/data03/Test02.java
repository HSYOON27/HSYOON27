package data03;
import java.lang.*;
public class Test02 {

	public static void main(String[] args) {
     //문자열(String)에 대해 설명하겠슴니다. 얘는 구조가 특이합니다. 
	 //- 문자열은 참조형 데이터(reference type) 이다. 뜯어봐야 크기를 알 수 있음. 
	 //- 반대되는 표현은 원시형 데이터(primitive type)이다. 안뜯어봐도 크기를 알 수 있음 
     //- 원시형 데이터는 간단하게 사용하는 크기가 정해진 데이터를 말한다(총 8가지 byte, short, int, long, double, float,boolean, char)
	 //- String은 크기를 정하는게 무의미 하기 때문에 String 명령어를 사용하는 것.
	 //- 참조형은 주문제작 형태이니 크기를 알 수 없음. 
	 //- 참조형은 주문제작 할 정도로 복잡하므로 참조변수(리모컨)가 존재한다.
	 //- 더하기는 예외적으로 가능하다 왜? 연결하라는 거임. 연결하기 위한 용도	
		String a = "hello";
		
		System.out.println(a);
		
		String b = "asdqjwqoiejoiqwjdioasjdoiajsoid";
		
		System.out.println(b);
		
		System.out.println(b.length());//a의 length 버튼을 눌러 글자 수 구하기. 참조형
	    System.out.println("a = "+ a);
	    
	}
}
