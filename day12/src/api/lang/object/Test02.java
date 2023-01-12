package api.lang.object;

import java.util.Random;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//Object가 진자 최상위 클래스인지 확인해보자! Object가 결국 자바의 모든걸 저장가능한 보관소가 가능하다는거.
		//-> Object를 보관용도로 사용하면 "아무거나" 라는 뜻과 같다. 
		
		
		Object a = true; //오 되네 최상위니까. 
		Object b = 10; //오 되네 int 위에 object 있으니까
		Object c = 3.14; 
		Object d = "hello";
		Object sc = new Scanner(System.in);
		Object r = new Random();
		//Object s = new Student();
		
		//아무거나 10개 저장할 수 있는 배열 만들어봐라 하면
		Object[] arr = new Object[10];
		
	}

}
