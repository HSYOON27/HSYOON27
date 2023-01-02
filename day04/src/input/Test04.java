package input;
import java.lang.*;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
 
		//입력
		Scanner sc = new Scanner(System.in);
    	System.out.println("신장(cm)를 입력하세요");
 	    double cm = sc.nextDouble();
    	System.out.println("체중(kg)를 입력하세요");
        double kg = sc.nextDouble();
        
    	
 	    double m =  cm/100;
 	    double bmi = kg/(m*m);
    	
 	    
 	    if(bmi>=24.5) {System.out.println("과체중 입니다.");}
 	    else if(bmi<=24.5) {System.out.println("정상체중 입니다.");}
 	   
 	    sc.close();
    	

	}}
