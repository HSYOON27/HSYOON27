package data;
import java.lang.*;
public class Test08_1 {
	public static void main(String[] args) {

		 //입력
		 int count = 9;
		 int price = 1200;
		 //계산
		 int free = count / 2;
		 //int fare = (count+1) / 2;
		 int fare = count - free;
		 int result = price * fare;
		 
		 //출력
		 System.out.println(free);
		 
}}
