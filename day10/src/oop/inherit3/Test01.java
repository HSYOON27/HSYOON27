package oop.inherit3;

public class Test01 {
	public static void main(String[] args) {
	
		//크롬 객체 생성
		Chrome a = new Chrome();
		a.setUrl("www.google.com"); //상속 필드
		a.refresh();//상속 메서드
		a.move();//상속 메서드
		a.develop();//내 메서드
		a.chromeStore();//내 메서드 
		
		//엣지 객체 생성
		Edge b = new Edge();
		b.setUrl("주소");
		b.refresh();
		b.move();
		b.fullScreen();
		
		//Whale 객체 생성
		Whale c = new Whale();
		c.setUrl("주소");
		c.refresh();
		c.move();
		c.papago();
		c.naverSearch();
		
	}

}
