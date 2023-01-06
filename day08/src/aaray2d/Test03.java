package aaray2d;

public class Test03 {
	public static void main(String[] args) {
		
		//int[][] data = new int[2개][3칸];
		
		int[][]data = new int [][] {
			{10, 20, 30},
			{40, 50, 60}
		};
		
		//구조
		//data (리모콘은 1개) --->  data[0]  --->[10][20][30] 
        //		                 data[1]  --->[40][50][60]
		
		System.out.println(data);//총괄리모콘 즉 리모컨대장 
		System.out.println(data[0]);//리모콘 부대장
		System.out.println(data[1]);//리모콘 부대장
		System.out.println(data[1][2]);//데이터
		System.out.println(data.length);//내가 관리하는 1차원 데이터의 길이.
		System.out.println(data[0].length);
		System.out.println(data[1].length);

		
		for(int i=0; i<data.length; i++) {//2줄
			for(int k=0; k<data[i].length; k++) {//3칸
				System.out.print(data[i][k]);
				System.out.print("\t");
		}
			System.out.println();

		
		}
		System.out.println();
		
		for(int k=0; k<=2; k++) {
			System.out.print(data[1][k]);
			System.out.print("\t");
		}
		System.out.println();
		
	}

}
//목표 : Test02를 2차원 배열로 변경할것이다. 