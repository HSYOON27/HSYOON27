package oop.abstract1;

public class Test01 {
	public static void main(String[] args) {
	
		//좌우가 일치하도록 생성한 코드(정적 타입 생성 구문)
		IPhone13 a = new IPhone13("black");
		IPhone14 b = new IPhone14("white");
		Galaxy22s c = new Galaxy22s("gold");
		GalaxyFold4 d = new GalaxyFold4("silver"); //점심 뭐먹었어? -> 베니스F&S에서 닭갈비 치즈 김밥(정병) 
		
		//좌우가 일치하지 않도록 생성한 코드(동적 타입 생성 구문)
		Mobile m1 = new IPhone13("black");
		Mobile m2 = new IPhone14("white");
		Mobile m3 = new Galaxy22s("gold");
		Mobile m4 = new GalaxyFold4("silver");
		
		IPhone ip1 = new IPhone13("black");
		IPhone ip2 = new IPhone14("white");
		Galaxy g1 = new Galaxy22s("gold");
		Galaxy g2 = new GalaxyFold4("silver");
		
		//얘네는 상속관계니까 업캐스팅이 가능하다. 
		//ex : 휴대폰 10개 보관할 수 있는 배열 
		Mobile[] arr1 = new Mobile[10];
		//ex : 아이폰 10개를 보관할 수 있는 배열 
		IPhone[] arr2 = new IPhone[10];
		//상속과 재정의가 반드시 되어야 함. 이로케 하려면
	}
}
