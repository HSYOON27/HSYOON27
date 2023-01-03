package loop;

public class Test03_1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.println("문제 1번은 = " + i);
		}
		for (int i = 1; i <= 100; i++) {
			if(i%2==1)
			System.out.println("문제 2번은 = " + i);
        // for (int i = 1; i <= 99; i+=2) 2씩증 이렇게도 가능 얘는 50번 실행 
		}
		for (int i = 1; i <= 100; i++) {
			if(i%5==0)
				
			System.out.println("문제 3번은 = " + i);

		}
		for (int i = 10; i >= 1; i--) {
			System.out.println("문제 4번은 = " + i);

		}
	}
}
