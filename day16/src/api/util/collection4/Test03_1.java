package api.util.collection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) {
		// 저장소 생성
		Map<String, Integer> db = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("검색어 : ");
			String keyword = sc.nextLine();
			// - 검색어가 존재할 때는 검색 횟수를 꺼내어 +1 한 뒤 다시 저장
			// - 검색어가 존재하지 않을 때는 검색 횟수는 1로 설정하여 새로 저장.
			
			//keyword에 대한 추가 처리 
			//.trim() , .toLowerCase, .replace()
			keyword = keyword.toLowerCase();
			keyword = keyword.replace(" ", "");
			
			if (keyword.equals("종료"))
				break;

			if (db.containsKey(keyword)) {// 검색어가 db에 존재한다면
				int count = db.get(keyword);
				count += 1;
				db.put(keyword, count);
				System.out.println("[" + keyword + "] 검색완료. [" + count + "회 검색됨]");
			} else {
				db.put(keyword, 1);
				System.out.println("[" + keyword + "] 검색완료. 1회 검색 되었습니다.");
			}
		}
	}
}
