package data;
import java.lang.*;
public class Test13 {
        public static void main(String[] args) {

        	//입력
        	int pccharge = 1300;
        	int pchour = 4;
        	double pcminute = 285%60;
        	double pcchargeperminute = 1300/60;
        	
        	//처리
        	double totalpctime = (pchour*60)+pcminute;
        	double pcminute2 = totalpctime%60;
        	
        	double totalfare = (pchour*pccharge)+(pcminute2*pcchargeperminute);
        	double totalfare1 = totalfare/100;
        	int totalfare2 = (int)totalfare1;
        	int totalfare3 = totalfare2*100;
            
        	System.out.println("총 요금은 " + totalfare3 + "원 입니다.");
        	
        }}
//피시방 요금이 한 시간에 1300원 일때 오전 9시 50분부터 오후 1시 35분 까지 이용한 고객의 요금을 출력
//10원 단위는 받지 않음. 즉 99원 까지는 할인을 해줌
//
