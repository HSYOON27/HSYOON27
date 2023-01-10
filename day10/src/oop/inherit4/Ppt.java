package oop.inherit4;

public class Ppt extends Files{
	
	private String pagesize;

	public String getPagesize() {
		return pagesize;
	}

	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}
	public void execute() {
		System.out.println("실행 기능");
	}
	public void slideShow() {
		System.out.println("슬라이드쇼 기능");
	}

}
