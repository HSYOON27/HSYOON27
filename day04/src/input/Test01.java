package input;

import java.io.IOException;

//import java.lang.*;
public class Test01 {

	public static void main(String[] args) throws IOException {
       //표준 입력
	   //-표준 입력 통로(System.in)에서 데이터를 가져오는 행위.
	   //- 내용이 정해져 있는 출력과 달리 시기와 내용이 불확실함.
	   //- ASCII 코드값을 읽어온다.
	   	
	   int n1 = System.in.read();
	   System.out.println("n1 = "+n1);
	}
}
