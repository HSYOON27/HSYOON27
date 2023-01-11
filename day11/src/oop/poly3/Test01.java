package oop.poly3;

public class Test01 {
	public static void main(String[] args) {
		Hwang a = new Hwang();
		
		a.drink();
		a.game();
		a.teach();
		
		//출근
		Teacher b = a; //Hwang -> Teacher가 되니까 업캐스팅 . 업캐스팅 먼저
//		b.drink(); //없는건 아닌데 못씀.
//		b.game();//없는건 아닌데 못씀.
		b.teach();
		
		
		//퇴군 
		Hwang c = (Hwang)b; //얜 왜 안될까? 큰거에서 작은걸로 들어가는거니까 이렇게 다운 캐스팅을 해줘야함.
		                    //Teacher -> Hwang(다운 캐스팅)
		c.drink();
		c.game();
		c.teach();
		
		//타입 검사
		
		//b에 들어있는 실 데이터는 Hwang의 객체 입니까? 라는 의미 
		System.out.println(b instanceof Hwang);
		
	}

}
