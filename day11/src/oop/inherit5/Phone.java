package oop.inherit5;

//상속 구현 시 염두해야 할 사항

//1. 필드는 접근 제한을 고려해야 함. 
// - private은 상속 관계 없이 자신만 접근 가능
// - protected는 같은 패키지 + 자식 클래스들은 제한 없이 접근 가능
//2. 메소드는 재정의(override) 여부를 결정해야 한다.  
//  - final 키워드를 추가하면 메소드가 불변이 되어 재정의가 불가능해짐
//  - abstract 키워드를 추가하면 매소드를 무조건 재정의 해야함
//  - 아무 키워드를 붙이지 않으면 재정의 여부를 자식 클래스가 선택할 수 있다.
//3. 생성자
//  - 생성자는 원래 역할이 객체를 만들때 반드시 지켜야 하는 필수 데이터를 설정하는 코드 
//  - 만약에 부모 클래스 생성자가 있다면 자식 클래스는 반드시 이를 고려해서 코드를 구현해야함. 
public class Phone {
	// private String number; // 자식 클래스에서 직접 접근이 안됨.(절대적인 규칙)
	protected String number; // 자식 클래스는 이렇게하면 위치 무관하고 자유롭게 접근 가능 (개조도 가능)

	public void videoCall(){
		System.out.println("영상통화 기능 실행");
		}
	public final void sms() {
		System.out.println("문자 기능 실행");
	} //이렇게 써버리면 재정의 금지. 하고싶어도 안돼. 
	
	//휴대폰이라면 전화번호가 반드시 있어야 해요 --> 생성자 구현 
	public Phone(String number) {
		this.number = number;
	}
}
