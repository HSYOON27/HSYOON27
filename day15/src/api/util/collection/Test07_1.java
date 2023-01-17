package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test07_1 {

	public static void main(String[] args) {
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수를 입력하세요");
		int people = sc.nextInt();
		sc.nextLine();
		
		List<String> nameList = new ArrayList<>();
		List<String> prizeList = new ArrayList<>();
		
		//사람 
		for(int i = 1; i<people; i++) {
			System.out.println("이름을 입력하세요.");
			String name = sc.next();
			nameList.add(name);
		}

		//상품
		for(int i = 1; i<people; i++) {
			System.out.println("상품을 입력하세요");
			String prize = sc.next();
			prizeList.add(prize);
		}
		sc.close();

		System.out.println(nameList);
		System.out.println(prizeList);
		
		Collections.shuffle(prizeList);
		
		for(int i=0; i<nameList.size(); i++) {
			System.out.println(nameList.get(i)+ " => " + prizeList.get(i));
		}
		}
		catch(Exception e) {
			System.err.println("인원수는 2명 이상 24명 이하로 설정하세요");
		}
	}

}
//네이버 사다리 게임 구현
// 네이버 '사다리타기' 검색해서 나오는 프로그램을 그래픽 요소 제외하고 구현 