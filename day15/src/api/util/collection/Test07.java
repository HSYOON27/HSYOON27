package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수를 입력하세요."); //입력 받는데 까지만 sc.close(); 해놓자 
		int people = sc.nextInt();
        sc.nextLine(); //얘 들어가야지 안날라감 엔터가
		
		List<String> nameList = new ArrayList<>();
		List<String> prizeList = new ArrayList<>();
		
		//사람 
		for(int i=1; i<=people; i++) {
			System.out.println("이름 입력");
			String name = sc.nextLine();
			nameList.add(name);
		}
		//상품
		for(int i=1; i<=people; i++) {
			System.out.println("상품 입력");
			String prize = sc.nextLine();
			prizeList.add(prize);
		}
		
		sc.close();

		System.out.println(nameList);
		System.out.println(prizeList);
		
		Collections.shuffle(prizeList);
		
		//데이터가 없을땐 size를 쓸 수 없음 당연히.
		
		for(int i=0; i<nameList.size(); i++) {
			System.out.println(nameList.get(i)+ " => " + prizeList.get(i));
		}
		

	}

}
//네이버 사다리 게임 구현
// 네이버 '사다리타기' 검색해서 나오는 프로그램을 그래픽 요소 제외하고 구현 