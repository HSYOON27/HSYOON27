package exception;

public class Test10 {

	public static void main(String[] args) {
		// 목표 : 객체지향에서의 예외처리
		// 메인에다 처리하는게 효율적임.

		try {
			int value = Calculator.div(10, 0);
			System.out.println("value = " + value);
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
