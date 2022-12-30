package data;
import java.lang.*;
public class Test13_1 {
        public static void main(String[] args) {

        	//입력
        	int pricePerHour = 1300;
        	int startHour = 9, startMinute = 50;
        	int finishHour = 13, finishMinute = 35;
        	
        	//처리
        	
        	int startTime = startHour * 60 + startMinute;
        	int finishTime = finishHour * 60 + finishMinute;
            int usageTime = finishTime - startTime;
            
            double pricePerMinute = pricePerHour / 60.0;
            int price = (int) (pricePerMinute * usageTime);
            
            int hour = usageTime / 60;
            int minute = usageTime % 60;
            
            //출력
            System.out.println("이용 시간은 다음과 같습니다");
            System.out.println(hour);
            System.out.println(minute);
            System.out.println("이용 요금은 다음과 같습니다");
            System.out.println(price);
            
            //버림 
            int price2 = price / 100 * 100;
            
            //반올림 - 49까지는 0, 50부터 100까지는 100으로 만드는 계산 
            int price3 = (price + 50) / 100 * 100;
            System.out.println(price3);
            
            //올림 
            int price4 = (price + 99) / 100 * 100;
            System.out.println(price4);
            
            
        
        	
        }}
//피시방 요금이 한 시간에 1300원 일때 오전 9시 50분부터 오후 1시 35분 까지 이용한 고객의 요금을 출력
//10원 단위는 받지 않음. 즉 99원 까지는 할인을 해줌
//
