package array;

public class Test04_3 {

	public static void main(String[] args) {
		//배열 준비
		int[] score = new int[] {
			90, 85, 51, 63, 77, 71, 77, 85, 99, 70
		};

		int[] rank = new int[] {
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1
		};
		
		for(int i=0; i<score.length; i++) {
			for(int k=0; k<score.length; k++)
				if(score[i]<score[k]) {
					rank[i]++;
				}
				
		}
		for(int i=0; i<rank.length; i++) {
			System.out.println(rank[i]);
		}

	}
}
