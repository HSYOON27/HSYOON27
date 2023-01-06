package oop.test3;

public class Test01 {
	public static void main(String[] args) {
		
	//객체 생성
	poke a1 = new poke();
	poke a2 = new poke();
	poke a3 = new poke();
	poke a4 = new poke();
	
	a1.rank = 1;
	a1.name = "이상해씨";
	a1.type = new String[]{"풀,독"}; //이걸 넣으며 이상함을 느껴야함.
	
	a2.rank = 4;
	a2.name = "파이리";
	a2.type = new String[]{"불꽃"};
	
	a3.rank = 7;
	a3.name = "꼬부기";
	a3.type = new String[]{"물"};
	
	a4.rank = 25;
	a4.name = "피카츄";
	a4.type = new String[]{"전기"}; //배열화 선언을 했으니까 1개라도 선언을 해줘야함.

	//출력
	
	System.out.print(a1.rank + " " + a1.name + " ");
	for(int i = 0; i<a1.type.length; i++) {
		System.out.print(a1.type[i]);
	}//배열 썼으니 반복문으로 표현해야함.
	System.out.println();
	System.out.print(a2.rank + " " + a2.name + " ");
	for(int i=0; i<a2.type.length; i++) {
	System.out.print(a2.type[i]);
	}
	System.out.println();
	System.out.print(a3.rank + " " + a3.name + " ");

	for(int i=0; i<a3.type.length; i++) {
	System.out.print(a3.type[i]);
	}
	System.out.println();
	System.out.print(a4.rank + " " + a4.name + " ");
	for(int i=0; i<a4.type.length; i++) {
	System.out.print(a4.type[i]);
	}
	System.out.println();


	}
}
