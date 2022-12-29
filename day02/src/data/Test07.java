package data;
import java.lang.*;
public class Test07 {
    public static void main(String[] args) {
    	
    	int hour1 = 3;
    	int minute1 = 230%60;
    	int hour2 = 4;
    	int minute2 = 265%60;
    	
    	int timetotal1 = hour1*60 + minute1;
    	int timetotal2 = hour2*60 + minute2;
    	
    	int total = timetotal1+timetotal2;
    	    	
    	int hour3 = total/60;
    	int min3 = total%60;
    	    	
    	System.out.println(hour3+"시간 " +min3 + "분 입니다.");
    	
    	//3시간 50분 + 4시간 25분 = ? 
    	
    	//선생님 버전
    	
    	//입력
    
    	
    	//출력 
    	
}}
