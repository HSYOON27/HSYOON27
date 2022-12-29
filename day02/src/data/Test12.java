package data;
import java.lang.*;
public class Test12 {
      public static void main(String[] args) {
          //목표 : 정수와 실수간의 변환이 되는가?
    	  int a = 10;
    	  double b = a; //double은 int보다 같거나 크다라는게 입증됐엉. int-> doulbe로 (자동변환)
    	  
    	  System.out.println(b);
    	 
    	  double c = 1.5;
    	  //int d = c; int가 double보다 작으니 당연히 출력이 안돼 error
    	  int d = (int)c;//double->int(강제변환) c를 int로 바꾼 다음에 넣는다는 뜻
    	  System.out.println(d);
    	  
    	  
    	  
      }}
