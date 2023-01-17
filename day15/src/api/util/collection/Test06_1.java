package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06_1 {

	public static void main(String[] args) {
		
		//저장소
		List<String> record = new ArrayList<>();
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("나라 이름 입력");
		String nation = sc.nextLine();
		
		if(record.contains(nation)) {
			System.out.println("게임이 끝났습니다");
			break;
		}
		else {
			record.add(nation);
		}
		}
		sc.close();
		System.out.println(record);
		
		//전체 출력
		System.out.println("여태 입력한 나라들");
		for(String name : record) {
			
		}
		System.out.print("->");
		System.out.println(record);

	}
}

//기억력 테스트 게임. 
//사용자에게 나라 이름을 지속적으로 입력받아 중복된 나라이름을 입력하는 경우 게임오버 처리 
//게임 오버시 여태까지 입력한 나라이름들을 순서대로 출력하도록 구현 
