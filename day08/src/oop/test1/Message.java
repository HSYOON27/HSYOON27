package oop.test1;

//얘는 JAVA(JVM)에게 메세지란 이렇게 생긴거다 라고 알려주기 위해 만든 영역임.
//메세지 = 작성자(String) + 내용(String) + 전송시각(String) + 안읽은사람수(int)
public class Message {	

	//멤버 필드 : 클래스를 구성하는 세부데이터를 말한다. 이를 저장하는 변수. 
	String writer;//메세지에는 작성자가 있어야 해요.
	String content;//메세지에는 내용이 있어야 해요
	String time; //메세지에는 전송시각이 있어야 해요 
	int remain; // 메세지에는 안 읽은 사람수가 있어야 해여.
	
}
