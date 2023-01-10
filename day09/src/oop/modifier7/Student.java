package oop.modifier7;

public class Student {

	// field
	private String name;
	private int grade;
	private int korean;
	private int english;
	private int math;
	private String type;

	// setter method - 설정용 메소드 세터 게터 설정 가능
	public void setName(String name) {
		this.name = name;
	}

	public void setGrade(int grade) {
		if(!(grade >=1 && grade <=6))return;
		this.grade = grade;
	}

	public void setKorean(int korean) {
		if (korean < 0 || korean > 100) {
			return;
		}

		this.korean = korean;
	}

	public void setEnglish(int english) {
		if (english < 0 || english > 100) {
			return;
		}
		this.english = english;
	}

	public void setMath(int math) {
		if (math < 0 || math > 100) {
			return;
		}
		this.math = math;
	}
	public void setType(String type) {
		switch(type) {
		case "총점", "평균", "등급" : 
		this.type = type;
		}
	}
	
	// getter method - 확인용 , 반환용 매서드.

	public String getName() {
		return this.name;
	}

	public int getGrade() {
			
		return this.grade;
	}

	public int getKorean() {
		return this.korean;
	}

	public int getEnglish() {
		return this.english;
	}

	public int getMath() {
		return this.math;
	}

	public int getTotal() {
		return this.getKorean() + this.getEnglish() + this.getMath();
	}

	public double getAverage() {
		return this.getTotal() / 3.0;
	}
	
	//public String getGrade(){
	//if(90~100) return "A";
	//else if(80~89) return "B"; ~~~~
	//else return "F";

	//constructor
	public Student(String name, int grade, int korean, int english, int math) {
		this.setName(name);
		this.setGrade(grade);
		this.setKorean(korean);
		this.setEnglish(english);
		this.setMath(math);
		
	}
	
	//method
	public void output() {
		System.out.println("<학생 성적 정보>");
		System.out.println("이름 : " + getName());
		System.out.println("학년 : " + getGrade());
		System.out.println("국어점수 : " + getKorean());
		System.out.println("영어점수 : " + getEnglish());
		System.out.println("수학점수 : " + getMath());
        System.out.println("총 점수 : "+getTotal());
        System.out.println("평균  : "+getAverage());
        
		
		if(this.getAverage()>=90 && this.getAverage()<=100)
			System.out.println("등급은 : " + "A");
		else if(this.getAverage()>=80 && this.getAverage()<=89)
			System.out.println("등급은 : " + "B");
		else if(this.getAverage()>=70 && this.getAverage()<=79)
			System.out.println("등급은 : " + "C");
		else System.out.println("등급은 : "
				+ "" + "F");
		System.out.println();

	}

}
