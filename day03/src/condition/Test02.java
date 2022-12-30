package condition;
import java.lang.*;
public class Test02 {
    public static void main(String[] args) {

    	//입력
    	int a = 3000;
    	
    	//처리
    	boolean even = (a%2 == 0); // 짝수인 경우
    	boolean odd = (a%2 == 1); // 홀수인 경우 
    	
    	//결과
    	if(even) {
    	System.out.println("짝수입니다.");
    	}
    	if(odd) {
        System.out.println("홀수입니다.");
    	}
    	
	
	}}
//Test02 어떤 숫자가 있을 때, 이 숫자가 홀수인지 짝수인지 판정해서 메시지를 출력 
