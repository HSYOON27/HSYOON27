package api.util.scanner;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		String song = "떳다떳다 비행기 날아라 날아라\n높이높이 날아라 우리 비행기";
		//System.out.println(song);
	
		//Scanner는 단어나 줄 단위로 끊어서 읽는 것이 가능하다.
		//단어 - .next(); 
		//- 단어는 띄어쓰기, 개행, null 등으로 구분할 수 있음. 단어인지 아닌지. 
		//- .hasNext()라는 명령어를 사용하면 읽을 수 있는 단어가 남았는지 확인해준다. 
		//줄 - .nextLine(); 이런 명령어로 가능  
		//- 줄은 유일하게 개행(\n)만이 의미가 있음(엔터)
		//- .hasNextLine() 메소드로 더 읽을 수 있는 줄이 남았는지 확인한다. 
		
		Scanner sc = new Scanner(song);
		while(sc.hasNextLine()) {
			String word = sc.nextLine();
			System.out.println(word);
		}
		
		sc.close();
		
	}

}
