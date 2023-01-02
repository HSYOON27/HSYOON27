package condition;
import java.lang.*;
public class Test06 {
	
	public static void main(String[] args) {
		
		//입력
		int basicPrice = 5000;
        int addPrice = 500;
        
        int startHour = 10;
        int startMinute = 50;
        int finishHour = 13;
        int finishMinute = 35;
        
        //처리
        
        int startTime = (startHour*60) + startMinute;
        int finishTime = (finishHour*60) + finishMinute;
        int usageTime = finishTime - startTime;
        
        int addPricePerMinute = addPrice/10; 
        
        
        int totalPrice = ((usageTime-60) * addPricePerMinute) + basicPrice;
        // 이거 틀린거다 10분당이니까 ((usageTime-60)/term(10분))*addPrice+basicPrice; 이거당
        
        // int price;
        // if(usageTime<=60){ price = bagicPrice; }
        // else(usageTime>=60){price = bagicPrice+addPricePerMinute;}
        
        
        //출력
        System.out.println("총 요금은 " + totalPrice + "원 입니다.");
        
  
		
}}

//Test 06 : 주차장 요금 계산 프로그램.
//KH 주차장은 다음과 같이 주차요금을 계산합니다.
//-기본요금 = 들어만 오면 1시간은 무적권 5000원. , 1시간 이후부터는 10분당 500원으로 계산 
//-입력값으로 들어온 시간/분, 나간 시각/분을 설정하고 주차요금을 계산해서 출력 

