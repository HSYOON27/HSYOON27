package oop.keyword3;

public class Test01 {
	public static void main(String[] args) {
		
		GalaxyFold4 g1 = new GalaxyFold4("010-5053-1973", "블랙");
		GalaxyFold4 g2 = new GalaxyFold4("010-4053-1973", "실버");
		GalaxyFold4 g3 = new GalaxyFold4("010-3053-1973", "화이트");

		g1.setCompany("애플"); // 이렇게 하는게 말이대냐 
		
		g1.output();
		g2.output();
		g3.output();

	}

}
