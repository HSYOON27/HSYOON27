package data;
import java.lang.*;
public class Test10 {
     public static void main(String[] args) {
         //목표 : 연산에 실수가 포함된다면 달라지는 것이 무엇일까?
         //- 실수가 한 개라도 연산 과정에 포함 된다면 결과는 무조건 실수이다.
    	 //예제 : 평균 구하기
    	 
    	 int korean = 70;
    	 int english = 75;
    	 
    	 int total = korean+english;
    	 double average = total / 2.0;
    	 
    	 System.out.println("총 점수는 " + total + "점 입니다.");
    	 System.out.println("평균 점수는 " + average + "점 입니다.");
    	 
    	   
     }}
