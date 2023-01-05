package random;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		
		Random r = new Random(); //Scanner sc = new Scanner(System.in); 과 비슷함
		//r.close();//이런 명령 없음(close는 입출력에만 존재)
		int a = r.nextInt();//정수를 만들어라 .
		int b = r.nextInt(2);//넥스트인트바운드는 갯수를 정하라는거 
		                     //nextInt(개수)를 사용하면 0부터 해당 개수 만큼의 정수 중에서 랜덤으로 반환됌
		System.out.println(b);
		
		//r.nextInt(B) + A -> A부터 B개 라는 뜻.!
		int dice = r.nextInt(6)+1;
		
		
		System.out.println("주사위는 " + dice);
		
		
}
}
//랜덤(Random)
//-ex) 로또, 주사위// 무슨 값이 나올지 예측할 수 없는 데이터의 상태 
// 프로그램에서 랜덤 값을 생성하는 도구가 존재
// 확률구현, 시뮬레이션, ... 등을 할 수 있음.
// 완전한 랜덤은 구현이 어려움
// 자바에선 Random이라는 도구를 사용해서 랜덤 값을 구현(유사 랜덤)