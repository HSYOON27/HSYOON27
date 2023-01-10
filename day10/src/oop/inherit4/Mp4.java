package oop.inherit4;

public class Mp4 extends Files {
	
	private String speed;

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	 public void rewind() {
			System.out.println("되감기 기능 실행");
		}
	 public void forword() {
			System.out.println("빨리감기 기능 실행");
		}
	

}
