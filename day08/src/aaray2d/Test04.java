package aaray2d;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		
		int[][]data = new int [][] { //3줄 4칸
			{90, 80, 85, 77},
			{60, 85, 73, 92},
			{50, 70, 70, 80}
		};
		
		//평균 구할땐 토탈과 카운트 항상 선언.
		
		int total = 0;
		int count = 0;
		
		for(int i = 0; i<data.length; i++) {
			for(int k=0; k<data[i].length; k++) {
				
			System.out.print("["+data[i][k]+"]");
			
			total += data[i][k];
			count++;
		}
			System.out.println();
		
		}
			double average =(double)total/count;
			
			System.out.println("총점은 " + total);
			System.out.println("평균은 " + average);
		
			//배열에서 랜덤뽑기 
			Random r = new Random();

			int row = r.nextInt(data.length);
			int co1 = r.nextInt(data[row].length);
			
			int choice = data[row][co1];
			
		
			System.out.println("choice = " + choice);
			
			
			}
			
}
	

