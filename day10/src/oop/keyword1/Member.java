package oop.keyword1;

public class Member {

	//필드에서 fianl을 쓸때는, 
	//- final 필드는 반드시 초기화가 되어야 한다.
	//- 생성자에 반드시 fianl 필드를 초기화하도록 코드를 구현해야 오류가 안남.
	
	private final String nickname;
	private String auth;
	
	public Member(String nickname) {
		//this.nickname = nickname;
		//this.auth = "준회원";
		this(nickname, "준회원"); //생성자 몰아주기 
	}
    public Member(String nickname, String auth) {
    	this.nickname = nickname;
    	this.auth = auth;
    }
}
//(주의) 파이널은 setter 매소드를 못만듬. 