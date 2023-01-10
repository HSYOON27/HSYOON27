package oop.inherit4;

public class Mp3 extends Files{
	
    private String duration;
	

    public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public void forward() {
		System.out.println("빨리감기 기능 실행");
	}
    public void rewind() {
		System.out.println("되감기 기능 실행");
	}
    public void execute() {
		System.out.println("실행 기능");
	}
}
