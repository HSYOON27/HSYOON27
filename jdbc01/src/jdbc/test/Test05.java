package jdbc.test;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("휴대폰 기종을 입력하세요.");
		String name = sc.nextLine();

		System.out.println("휴대폰 통신사를 입력하세요.");
		String telecom = sc.nextLine();

		System.out.println("휴대폰 가격을 입력하세요.");
		String price = sc.nextLine();

		System.out.println("휴대폰 약정 개월을 입력하세요.");
		String month = sc.nextLine(); // null을 넣고 싶으면 Integer month = null; 로 변경

		sc.close();

		// 위는 Integer month = sc.nextInt(); 조지고 밑에 if (month == 0) { month = null;}
		// Spring JDBC
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh11");
		dataSource.setPassword("kh11");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);

		String sql = "insert into mobile(name,telecom,price,month) values(?, ?, ?, ?)";
		Object[] param = {name, telecom, price, month};

		jdbcTemplate.update(sql, param);
		System.out.println("실행 완료");

	}

}
//사용자가 입력한 정보를 토대로 mobile 테이블에 데이터를 추가하도록 코드를 구현
