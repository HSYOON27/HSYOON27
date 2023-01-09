package data;
import java.lang.*;
public class Test01 {
        public static void main(String[] args) {
              //데이터(Data) 
        	  //- 계산에 쓰이는 값 (요리로 치면 커피의 원두 같은) 
              //- 여러 가지의 종류로 구분 된다. 
        	  //- 숫자는 크게 소수점 유무로 구분된다. (소수점이 있으면 실수, 없으면 정수) 
        	  
        	
        	  //정보(Information)
        	  //-계산으로 만들어진 의미있는 결과물 (ex : 커피)
        	
        	  System.out.println(10);//정수 10을 출력해라. 
        	  System.out.println(1.4);//실수 1.4를 출력해라.
        	  
        	  System.out.println(10 + 1.4);//정수+실수의 합은 무조건 실수. 실수가 1개라도 포함되면 실수가 나옴 당연..
        	  System.out.println(10 + 20);//정수+정수는 무조건 정수지. 당연한거 
        	  
        	  System.out.println(10 / 3);//정수끼리 계산한것이기 때문에 정수만 나오는 것임. 
        	  System.out.println(10 / 3.0); // 끝에 나오는 5는 무시. 실수를 넣어주면 실수 값이 나오는 것임.
        	  
        	  
        	  System.out.println("Hello");
        }
}
