package oop.inherit4;

public class Test01 {
	public static void main(String[] args) {
		
		//Hwp 객체 생성
		Hwp a = new Hwp();
		a.setFilename("평가.hwp");
	    a.setFilesize(1L * 1024L * 1024L);
	    a.setPageSize(10);
	    a.execute();
	    a.preview();
	    
	    //Mp3 객체 생성
	    Mp3 b = new Mp3();
	    b.setFilename("test.mp3");
	    b.setFilesize(100L);
	    b.setDuration(3 * 60);
	    b.forword();
	    b.rewind();
	    
	    //Mp4 객체 생성
	    Mp4 c = new Mp4();
	    c.setFilename("수업영상.mp4");
	    c.setFilesize(1L*1024*1024*1024);
	    c.setSpeed(1.2);
	    c.execute();
	    c.forword();
	    c.rewind();
	    
	    //Ppt 객체 생성
	    Ppt d = new Ppt();
	    d.setFilename("발표.ppt");
	    d.setFilesize(5L * 1024L * 1024L);
	    d.setPageSize(30);
	    d.execute();
	    d.slideShow();
	    
	    
	}

	
}
