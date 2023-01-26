package jdbc.update;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcUtils;

public class Test04 {
	public static void main(String[] args) {
		// 데이터 준비
		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 입력하세요");
		int no = sc.nextInt();
		
		sc.nextLine();

		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println("한국어 점수를 입력하세여");
		int korean = sc.nextInt();
		
		System.out.println("영어 점수를 입력하세여");
		int english = sc.nextInt();
		
		System.out.println("수학 점수를 입력하세여");
		int math = sc.nextInt();
		
		sc.close();
		
	
		// Spring JDBC
		// 기본키 Primary key가 no 이기 때문에 no를 기준으로 하는 것. 
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate(); 

		String sql = "update student set name=?, korean=?, english=?, math=? where no=? ";
		Object[] param = {name,korean,english,math,no};

		int result = jdbcTemplate.update(sql, param);
		System.out.println("count = : "+ result); 
		
		if(result > 0) {
			System.out.println("진짜 수정 됐다");
		}
		else {
			System.out.println("실행은 됐는데 대상이 없듬");
		}
		
		
	}
}
// 'student' 테이블의 정보를 수정하는 프로그램을 구현
// - 번호를 이용하여 나머지 정보를 수정 