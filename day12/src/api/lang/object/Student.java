package api.lang.object;

import java.util.Objects;

public class Student /*extends Object*/{
	private String name;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public Student(String name, int score) {
		//super(); //부모클래스의 기본 생성자를 불러달라는 코드임. 
		this.name = name;
		this.score = score;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}
	
}



