package data2;
import java.lang.*;
public class Test04 {

	public static void main(String[] args) {
		//목표 : 지하철 무임승차 대상인지를 판정함
		//- 영유아 (7세 이하) 
		//- 어르신 (65세 이상)
		
		//입력
		int age = 8;
		
		//처리 
		//boolean free = 7세 이하 또는 65세 이상; '또는' = || 를 사용. 
		//||(or) 연산은 둘 중 하나만 true면 true
		//&&(and) 연산은 둘 중 하나만 false면 false
		
		boolean free = age >= 65 || age <= 7;
		
		//출력
		System.out.println(free);
	}}
