package oop.interface2;

public class Test03_03 {
	public static void main(String[] args) {
		//Calculator를 사용한 연산
		Calculator c = (left, right) ->  left - right;
	
		System.out.println(c.process(10, 20));
	}

}
