package loop;

public class Test04 {

	public static void main(String[] args) {

		for(int i=10; i<=99; i++) {
			int ten = i / 10; //10의자리
			int one = i % 10; //1의 자리 
			boolean hasTen = ten==3 || ten==6 || ten==9;
			boolean hasOne = one==3 || one==6 || one==9;
			boolean has369 = hasTen || hasOne;
			
			if(has369) {
				System.out.println(i);
			}
		}
		
		}
	}


//다음 요구사항에 맞는 값을 계산하여 출력하세요 두 자리 정수 중 3,6,9 게임을 한다면 박수를 쳐야하는 숫자를 출력 