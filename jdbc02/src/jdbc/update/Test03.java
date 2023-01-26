package jdbc.update;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcUtils;

public class Test03 {
	public static void main(String[] args) {
		
		//데이터 준비
		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 입력하세요");
		int no = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("과목명을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println("기간을 입력하세요");
		int period = sc.nextInt();
		
		System.out.println("가격을 입력하세요");
		int price = sc.nextInt();
		
		sc.nextLine();

		System.out.println("수강 타입을 입력하세요");
		String type = sc.nextLine();		
	    
		sc.close();
		
		//Spring JDBC
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate(); 

		String sql = "update subject set name=?, period=?, price=?, type=? where no=? ";
		Object[] param = {name,period,price,type,no};
		
		int count = jdbcTemplate.update(sql, param);
		System.out.println("count = "+ count); 
		
		if(count > 0) {
			System.out.println("진짜 수정 됐다");
		}
		else {
			System.out.println("실행은 됐는데 대상이 없듬");
		}
		
	}

}
//'subject' 테이블의 정보를 수정하는 프로그램을 구현
//- 번호를 이용하여 나머지 정보를 수정
