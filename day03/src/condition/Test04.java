package condition;
import java.lang.*;
public class Test04 {

	public static void main(String[] args) {

		int n = 126;
		
		boolean even = n%2 == 0;//배수판정은 무조건 % 나머지를 사용)
		
		if(even == true) {
			System.out.println("짝수");
		}
		else//else는 if가 거짓이면 실행
			{System.out.println("홀수");

		}
	}}
//목표 : 홀짝 프로그램 계산 (분리된 조건의 그룹화)