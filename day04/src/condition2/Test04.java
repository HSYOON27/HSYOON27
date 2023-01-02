package condition2;
import java.lang.*;
public class Test04 {

	public static void main(String[] args) {

        int time = 86400;
        
        if(time<10) {System.out.println("방금 전");}
        else if(time<60){System.out.println(time+"초 전");}
        
        //int minute = time/60;
        else if(time<60*60){System.out.println(time/60+"분 전");}
        
        //내가 계산하지 않게 해야함 
        else if(time<60*60*24){System.out.println(time/60*60+"시간 전");}
        //int hour = time/60*60;내가 계산하지 않게 해야함
        //int day = time/24*60*60; 
        else{System.out.println("오래전");}
        
        
	}}

//Test 04 SNS와 같은 게시글(피드) 위주 사이트에서는 요즘 시간을 다음과 같이 표시합니다.
//-예전 : 2023-01-02 12:50:30
//-최근 : 방금 전, 30초전, 1일 전, 오래 전
//최근 방식을 보여주기 위해서는 현재 시각과 작성 시각의 차이를 알아야 합니다.
//작성 시각과 현재 시각의 차이가 초단위로 주어졌을 때 다음 규칙에 맞게 시간 메세지를 출력
//10초 미만이면 '방금 전' 이라고 출력
//1분 미만이면 '?초 전'이라고 출력
//1시간 미만이면 '?분 전'이라고 출력
//1일 미만이면 '?시간 전'이라고 출력
//1일이 넘어가면 '오래전'이라고 출력
