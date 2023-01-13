package exception;

public class Calculator {
	
	//얘는 위험한 메소드다 왜? = 예외가 발생할 수 있는 메소드니까. 
	//-메소드 헤더 우측에 throws Exception이라고 적으면 Exception이 발생할 수 있는 메소드라고 표시함.
	
	public static int div(int left, int right) throws Exception{
		return left/right;
	}
}
