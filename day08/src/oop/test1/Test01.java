package oop.test1;

public class Test01 {
	public static void main(String[] args) {
		// 카톡 메시지 2개를 만들고 싶어여
		// - 낱개 데이터가 아니라 미리 만들어둔 Message 클래스의 객체를 생성함.
		Message m1 = new Message();
		//m1 ---------->{ writer : null, content : null, time = null, remain = 0};
		
		m1.writer = "초롱초롱 라이언";
		m1.content = "언제와?";
		m1.time = "오후 3:02";
		m1.remain = 1;
		//데이터들을 덩어리로 관리할 수 있게댐. 왜? Message 클래스를 만들어서 선언을 해놨으니까.
		
		// 리모컨에 대한 정보.. 큰 의미 없다. System.out.println(m1);
		System.out.println(m1.writer);//m1 대상에 있는 writer 접근 후 출력해라 라는 의미.
		System.out.println(m1.content);//m1 대상에 있는 content 접근 후 출력해라 
		System.out.println(m1.time); //m1 대상에 있는 time에 접근 후 출력해라
		System.out.println(m1.remain); //m1 대상에 있는 remain 접근 후 출력해라
		
		Message m2 = new Message(); //새로운 메시지를 만들려면 이렇게. 
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		System.out.println(m2.writer);
		System.out.println(m2.content);
		System.out.println(m2.time); 
		System.out.println(m2.remain);
	}

}