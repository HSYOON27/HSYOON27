package oop.constructor;

public class Student {
	
	//field
	String name;
	int score;
	
	//constructor(생성자)
	//생성자는 반드시 클래스와 같은 이름을 가져야 한다. 반 드 시 
	// void setting의 역할을 함. 
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	//method
//	void setting(String name, int score) {
//		this.name = name;
//		this.score = score;
//	}
	void output() {
		System.out.println(this.name);
		System.out.println(this.score);
	}
}
