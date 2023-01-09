package oop.modifier3;

public class Test01 {

	public static void main(String[] args) {
		
		Academy a1 = new Academy("자바 마스터 과정",90,100000,"온라인");
		Academy a2 = new Academy("파이썬 기초",60,600000,"온라인");
		Academy a3 = new Academy("웹 개발자 단기완성",120,1200000,"오프라인");

		a1.output();
		a2.output();
		a3.output();
		
	}
}
