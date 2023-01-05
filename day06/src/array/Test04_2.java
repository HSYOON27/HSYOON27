package array;

public class Test04_2 {

	public static void main(String[] args) {
		//배열 준비
		int[] score = new int[] {
			90, 85, 51, 63, 77, 71, 77, 85, 99, 70
		};

		//(+추가) 모든 학생의 등수 구하기
		//- 등수를 10개 구해야 한다(변수 10개 or 배열 1개)
		int[] rank = new int[] {
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1	
		};

		//등수 계산
		for(int i=0; i < score.length; i++) {
			for(int k=0; k < score.length; k++) {
				if(score[i] < score[k]) {
					rank[i]++;
				}
				
			}
		}


		//등수 출력
		for(int i=0; i < rank.length; i++) {
			System.out.print(rank[i]);
			System.out.print(" ");
		}
		System.out.println();

	}
}
