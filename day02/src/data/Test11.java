package data;
import java.lang.*;
public class Test11 {
       public static void main(String[] args) {

    	   
    	   // 입력
    	   double height = 1.8;
    	   double weight = 80;
    	   
    	   // 처리
    	   double heightsquare = height * height;
    	   double bmi = weight/heightsquare;
    	   double bmi2 = bmi*100; //2469.135802469136
    	   int bmi3 = (int)bmi2; //2469
    	   double bmi4 = bmi3;//2469.0
    	   double bmi5 = bmi4/100;//24.69
    	   
    			   
    	   // 출력
    	   System.out.println("BMI 지수는 " + bmi + "입니다.");
    	   System.out.println("BMI 지수는 " + bmi5 + "입니다.");
	   
    			  
    			   
       }}
