package api.util.scanner;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//String colors = "빨강+주황+노랑+초랑+파랑+남색+보라";
		String colors = "빨강-주황,노랑=초랑+파랑-남색@보라";
		
		Scanner sc = new Scanner(colors);
		
		//단어 기준을 변경할 수 있다(단, 바꾸면 기존의 기준이 날라감. 없어짐)
		//sc.useDelimiter("\\+"); //자바에선 \ 역슬래쉬를 하나만 쓸 수 없음. 2개씩 써야함 
		sc.useDelimiter("[-,=+\\-@]"); // 얘는 걍 regex 사이트에서 만들어 쓰자. 여러개일땐 이렇게 특문자
		while(sc.hasNext()) {
			String color = sc.next();
			System.out.println("color = " +color);
		}
		
		sc.close();
		
	}

}
