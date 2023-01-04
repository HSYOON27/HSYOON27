package array;

public class Test02 {

	public static void main(String[] args) {
       
		//배열 생성
		int[] data = new int[5]; //new가 쓰이면 무조건 참조형 
		//data ------> [?][?][?][?][?] 이런식으로 생기는거
		//new 떄문에 0이됨. 0이 가장 깨끗한 수기 대문 
		//data = 10; // error 무조건. 리모컨은 변경불가
		data[0] = 10;
		data[1] = 20;
		data[2] = 30;
		data[3] = 40;
		data[4] = 50;

		System.out.println(data[0]);//리모컨을 출력한거임. 
		System.out.println(data[1]);//시작점 +1칸
		System.out.println(data[2]);//시작점 +2칸
		System.out.println(data[3]);//시작점 +3칸
		System.out.println(data[4]);//시작점 +4칸
		
		int total = data[0] + data[1] + data[2] + data[3] + data[4];
		System.out.println(total);
	}
}