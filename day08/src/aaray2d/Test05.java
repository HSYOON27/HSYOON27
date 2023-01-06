package aaray2d;

import java.util.Random;

public class Test05 {

	public static void main(String[] args) {

		//빙고판 만들기
        int[][] bingo = new int[5][5];
        int size = 5;
	
        //초기화(1부터 25까지)
        Random r = new Random();
        for(int i=1; i<=size*size; i++) {
        	int row = r.nextInt(size);
        	int col = r.nextInt(size);
        	
        	//System.out.println("("+row+")"+"("+col+")"+ "을 넣습니다.");
        	
        	if(bingo[row][col]==0) {
        		bingo[row][col] = i;
        	}else i--;
        		
        }
        
        //출력
        for(int i=0; i<size; i++){
        	for(int k=0; k<size; k++)
        	System.out.print(bingo[i][k]);
        	System.out.print("\t");
        }
        System.out.println();
        System.out.println();
        System.out.println();
        
	}
}

// 5x5 빙고판을 만드려함
// 2차원 배열을 만들고 1부터 25까지 겹치는 자리가 없이 모두 배치되도록 구현하세요 