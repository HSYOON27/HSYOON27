package oop.inherit4;

public class Hwp extends Files{

	private String pagesize;
	

	public String getPagesize() {
		return pagesize;
	}
	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}
	
	public void preview() {
		System.out.println("미리보기 기능 실행");
	}
	public void execute() {
		System.out.println("실행 기능");
	}
}
