package aaray2d;

import java.util.Random;

public class Test06 {

	public static void main(String[] args) {
		
		int[][] mine = new int[9][9];
	    
		Random r = new Random();
		
		for(int i=0; i<10; i++) {
			int row = r.nextInt(9);
			int col = r.nextInt(9);
			
			if(mine[row][col] == 0) {
				mine[row][col] = 9;
				
			}
			else i--;
		}
	    
		for(int i=0; i<mine.length; i++) {
			for(int k=0; k<mine.length; k++) {
				System.out.print(mine[i][k]);
				System.out.print(" ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
// 1. 9x9 배열을 준비 
// 2. 랜덤으로 10개의 폭탄을 지도에 배치(폭탄은 숫자 9로 설정)
// 3. 지도출력
// 4. 폭탄이 아닌 칸의 숫자를 계산
// 5. 최종 지도 출력 