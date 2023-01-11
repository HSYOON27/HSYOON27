package oop.poly2;

public abstract class Game {
	//공통 필드
	private final String id;
	private int level;
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(level < 1) return;
		this.level = level;
	}

	public String getId() {
		return id;
	}

	//생성자 
	public Game(String id) {
		this.id = id;
		this.level = (1); //얘는 고정이니 하위 상속자들에서 쓰지않음.
	}
	
	//메소드 
	public abstract void attack();	
	public abstract void move();	
	public abstract void store();	
	public final void information() {
		System.out.println("<캐릭터 정보>");
		System.out.println("아이디 = " + this.id);
		System.out.println("레벨 = " + this.level);
	}

	
	
}
