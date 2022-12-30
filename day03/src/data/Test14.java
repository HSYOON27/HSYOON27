package data;
import java.lang.*;
public class Test14 {
      public static void main(String[] args){

    	  //정수 : byte(1), short(2), int(4), long(8)   	  
    	  //실수 : float(4), double(8)
    	  //(주의) 실수는 어떠한 경우에도 정수보다 큽니다.
    	  
    	  int a = 2100000000 + 100000000;//범위초과
    	  System.out.println(a); //왜 음수가 나올까? 
          long b = 2200000000L; // 왼쪽은 롱인데 오른쪽 22억은 int로 인식되기 때문에 오류가 뜸.
                                // 그래서 숫자 끝에 L(long) 을 붙혀줘야함 for 구분     	  
          long c = 2100000000L + 100000000L;
          
          System.out.println(c);
          
          double d = 3.14;
          float e = 3.14F; //(얘는 float라서 f를 붙여야함)
          
          System.out.println(d);
          System.out.println(e);
      }}
