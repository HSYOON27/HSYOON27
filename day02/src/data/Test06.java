package data;
import java.lang.*;
public class Test06 {
      public static void main(String[] args) {
    	  //나눗셈, 나머지 
    	  //(중요) 정수끼리 계산하면 정수
    	  
    	  System.out.println(10 / 3);//나눗셈의 몫
    	  System.out.println(10 % 3);//나눗셈의 나머지 
    	  
    	  //(예) 집이 10채가 있고 사람이 3명이 있을 때, 나눠 가지면 한사람당 몇 채를 가지고, 몇 채가 남나요?
    	  
    	  int house = 10;
    	  int people = 3;
    	  int give = house / people ; 
    	  int remain = house % people ; 
    	  
    	  System.out.println("한 사람당 " + give + "채 입니다.");
    	  System.out.println("나머지는 " + remain + "채 입니다.");
    	  
      }
      }
