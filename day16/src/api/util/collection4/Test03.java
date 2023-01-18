package api.util.collection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		//저장소 생성
		Map<String, Integer> database = new HashMap<>();
		
		//
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("검색어를 입력하세요.");
		
		while(true) { 
	    String search = sc.nextLine();
		if(search.equals("종료")) {
			System.out.println("시스템을 종료합니다");
			break;
		}
         {database.get(search);}
         database.put(search, count);
         count++;
         System.out.println("검색어" + "["+search + "]" +"입니다." +count+"회 입력");
		}
		
	}

	}

