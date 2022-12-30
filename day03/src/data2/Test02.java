package data2;
import java.lang.*;
import java.time.Year;

public class Test02 {

	public static void main(String[] args) {

		//int currentYear = 2022;
		//int hsyoon = 1990;
		//int newPerson = 2000;
		//boolean adult1 = (currentYear-hsyoon)>= 20;
		//boolean adult2 = (currentYear-newPerson)>= 20;
		
		//System.out.println(adult1);
		//System.out.println(adult2); 이건 내가한거;;
		
	//문제 : 출생년도에 따른 성인여부 판정 프로그램	
		
    //입력 - 출생년도
		int birth = 2000;
		int year = Year.now().getValue();
		
    //처리 - 나이 -> 성인여부 나이는 = 올해 - 출생년도 + 1 
		int age = year - birth + 1;
		System.out.println(age);
		
		boolean adult = age >= 20; //자주 바뀌는것만 변수처리
		
		
    //출력 - 성인여부
		System.out.println(adult); 
		
		
	}}
// 사용자의 출생년도 4자리를 이용해서 성인/미성년자를 판정하는 프로그램을 구현
// 2000년의 성인 여부를 판정해서 출력(성인은 한국식 나이로 20세 이상을 의미합니다)
// 문제 : 출생년도에 따른 성인여부 판정 프로그램