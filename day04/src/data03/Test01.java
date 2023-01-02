package data03;
import java.lang.*;
public class Test01 {

	public static void main(String[] arges) {
    //문자(글자, 글꼴, 인코딩, ....) 
    //- 프로그래밍에서 글자를 표현하기 위한 방식 
	//최초 :  컴퓨타는 최초로 미국인이 개발했음, 미국인이 사용 가능한 글자 128개를 저장함. 이걸 ASCII라고 함. 아스키코드
    //변화 : 유럽 전파, 유럽인들까지 사용 가능하도록 256글자로 확장(확장 ASCII, ISO-8859-1)
    //최종 : 전세계 전파, 전세계 글자 통일을 위한 Unicode를 제정(65,535자=2byte)
	//유니코드의 표현 방식 중 UTF-8이라는 방식이 존재함(얘로 세계 통일 직전)	
		
		char a = '가'; //글자를 하나만 쓸때 따옴표 //가=44032번, 힣=55203번  
		System.out.println(a); 
		
		int b = a; //int가 char 보다 더 큼. 그리고 char은 숫자다. 즉 번호로 표현이 가능하다.
		System.out.println(b); 

		char c = 'H';
		c += 32; 
		System.out.println(c);//대문자와 소문자는 32만큼의 차이가 남.
		boolean lower = 'a' <= c && c<='z'; // '가' <= c && c<='힣'; 이걸로 한글인지 아닌지 체크가능
	    System.out.println(lower);
	}}
