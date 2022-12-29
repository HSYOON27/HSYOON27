package data;
import java.lang.*;
public class Test04 {
      public static void main(String[] args) {
         //목표 : Test 03을 고치기 쉽도록 프로그램을 만들어보자. 개조해보자!
    	 //- 프로그램은 입력 -> 처리 -> 출력의 구조를 가짐. ex) 자판기 
    	 
    	 //입력 : 성인요금, 청소년요금, 성인 인원수, 청소년 인원수 - 저장
    	  
    	 //adultPrice라는 정수 저장 변수를 만들어서 16000를 저장해라 라는 의미 
    	 int adultPrice = 16000;
    	 int teenPrice = 10000;
         int adultCount = 2;
         int teenCount = 3;
         
         //처리 adultTotal = 32000; 
   	     //    teenTotal = 32000;
         int adultTotal = adultPrice * adultCount; 
         int teenTotal = teenPrice * teenCount;
         
         int total = adultTotal + teenTotal;
         
    	 //출력 : 총 요금 
    	 //total = 62000; 
         
    	 System.out.println(total);
}}
