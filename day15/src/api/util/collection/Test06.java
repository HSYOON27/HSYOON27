package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("나라를 입력하세요.");
			String nation = sc.nextLine();

			if (a.contains(nation)) {
				System.out.println("겜끝");
				break;
			} else
				a.add(nation);

			System.out.println(a);

		}
		sc.close();

	}
}

//기억력 테스트 게임. 
//사용자에게 나라 이름을 지속적으로 입력받아 중복된 나라이름을 입력하는 경우 게임오버 처리 
//게임 오버시 여태까지 입력한 나라이름들을 순서대로 출력하도록 구현 
