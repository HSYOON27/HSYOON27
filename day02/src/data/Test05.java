package data;
import java.lang.*;
public class Test05 {
    public static void main(String[] agrs) {
        
    	
    	//입력
    	int jjajangPrice = 6000;
    	int champonPrice = 7500;
    	
    	int jjajangCount = 5;
    	int champonCount = 3;
    	
    	//처리
    	int jjajangTotal = jjajangPrice * jjajangCount;
    	int champonTotal = champonPrice * champonCount;
    	
    	int total = jjajangTotal + champonTotal;
    	
    	//출력
    	System.out.println("총 요금은 " + total + "원 입니다");
    	
    }}
