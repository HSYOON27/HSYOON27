package oop.inherit4;

public class Test01 {
	public static void main(String[] args) {
		
		//Hwp 객체 생성
		Hwp a = new Hwp();
		a.setFilename(" ");
	    a.setFilesize(" ");
	    a.setPagesize(" ");
	    a.execute();
	    a.preview();
	    
	    //Mp3 객체 생성
	    Mp3 b = new Mp3();
	    b.setFilename(" ");
	    b.setFilesize(" ");
	    b.setDuration(" ");
	    b.forward();
	    b.rewind();
	    
	    //Mp4 객체 생성
	    Mp4 c = new Mp4();
	    c.setFilename(" ");
	    c.setFilesize(" ");
	    c.setSpeed(" ");
	    c.execute();
	    c.forword();
	    c.rewind();
	    
	    //Ppt 객체 생성
	    Ppt d = new Ppt();
	    d.setFilename(" ");
	    d.setFilesize(" ");
	    d.setPagesize(" ");
	    d.execute();
	    d.slideShow();
	    
	    
	}

	
	
}
