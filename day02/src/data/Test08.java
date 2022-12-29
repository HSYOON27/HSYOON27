package data;
import java.lang.*;
public class Test08 {
      public static void main(String[] args) {

       	  int gimbabprice = 1200;
    	  int gimbabcount= 9;
    	  int freegimbab = gimbabcount/2;
    	  int freegimbab2 = gimbabcount%2;
    	  
    	  int total = gimbabprice * (freegimbab + freegimbab2);
    	  
    	  System.out.println(total +"원 입니다.");
    	  System.out.println(freegimbab+"개 입니다.");
    	  
    	   
    	  //삼각김밥이 1+1 행사 중 일때 9개를 사면 그 중 몇개가 꽁짜 처리되는지 계산해서 출력
    	  //+개당 1200원일때 결제금액이 얼마인지 출력
      }}
