package api.io.object;

import java.io.Serializable;

//내가 만든 클래스의 객체도 파일 출력이 되는가? 
//- 만약 입출력의 가능성이 있다면, 자격(마킹)을 부여해야 한다.(마킹) 
//- java.io.Serializable 인터페이스를 상속
//- 웃긴건 Serializable을 삭속받으면 경고가 나옴.
//- 왜? -> 클래스의 버전을 관리할 것을 요구. (serialVersionUID를 생성하여 숫자로 관리)
//- 안만들면 클래스의 내용이 바뀔 때 마다 무조건 serialVersionUID가 바뀜(통제가 안됨)
//- 입출력에서 제외하고 싶은 필드가 있다면 transient 키워드를 붙이면 된다. 

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private /*transient*/ int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
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
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	

}
