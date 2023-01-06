package oop.method3;

public class Test01 {
	public static void main(String[] args) {
		
		//객체 생성		
		Cellphone a1 = new Cellphone();
		Cellphone a2 = new Cellphone();
		Cellphone a3 = new Cellphone();
		Cellphone a4 = new Cellphone();

		//데이터 초기화 
		a1.setting("갤럭시22s", "SK", 180, "설정하지 않음");
		a2.setting("갤럭시22s", "KT", 175, "24개월");
		a3.setting("아이폰 14", "LG", 200, "30개월");
		a4.setting("아이폰 14", "SK", 199, "설정하지 않음");
		
		//출력
		a1.output();
		a2.output();
		a3.output();
		a4.output();


		
	}

}
