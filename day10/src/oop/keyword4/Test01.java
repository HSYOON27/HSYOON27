package oop.keyword4;

public class Test01 {
	public static void main(String[] args) {
		
		//static 필드/메소드는 객체를 만들지 않아도 사용이 가능 하다. 객체 없이 호출 가능. 
		System.out.println(GalaxyFold4.getCompany()); //올바른 접근방법
		
		GalaxyFold4 g1 = new GalaxyFold4("010-5053-1973", "블랙");
		GalaxyFold4 g2 = new GalaxyFold4("010-4053-1973", "실버");
		GalaxyFold4 g3 = new GalaxyFold4("010-3053-1973", "화이트");

		// System.out.println(); //잘못된 접근 방법 얘는 왜 경고가 뜰까? 2번에 걸쳐서 가기 때문에. 
		
		g1.setCompany("애플"); // 잘못된 접근 방법
		
		// GalaxyFold4.setCompany("화웨이"); //올바른 접근 방법
		
		g1.output();
		g2.output();
		g3.output();

		
	}

}
