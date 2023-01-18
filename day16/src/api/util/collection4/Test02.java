package api.util.collection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		//저장소 생성
		Map<String, String> data = new HashMap<>();

		//데이터 추가
		data.put("khacademy", "master1234");
		data.put("khstudent", "study1234");
		data.put("khmanager", "admin1234");

		// 참고. 불변의 저장소
//		Map<String, String> database = Map.of(
//				"아디","비번")
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String id = sc.next();

		System.out.println("비밀번호를 입력하세요");
		String password = sc.next();

		if (data.containsKey(id) && data.get(id).equals(password)) {
			System.out.println("로그인 성공입니다.");
		} 
		else
			System.out.println("로그인 실패입니다.");
	}

}
//데이터베이스 대신 Map 사용하여 회원 로그인 프로그램을 구현하려고 한다.
//저장된 데이터는 다음과 같습니다.
