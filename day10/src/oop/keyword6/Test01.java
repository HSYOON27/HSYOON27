package oop.keyword6;

public class Test01 {
	public static void main(String[] args) {
		//아주 간단한 계산을 객체지향 방식으로 구현
		//-ex : 10 + 20 
		
		int a = Robot.plus(10, 20); //static이 있으니까 이렇게 가능 
		// static이 없었더라면 Robot rb = new robot(10,20); 이런식으로 했어야함 
		
		System.out.println(a);
		
	}

}
