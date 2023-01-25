package jdbc.test;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("포켓몬 번호를 입력하세요");
		int no = sc.nextInt();

		sc.nextLine(); //중복 되니까 
		
		System.out.println("포켓몬 이름을 입력하세요");
		String name = sc.nextLine();

		System.out.println("포켓몬 타입을 입력하세요");
		String type = sc.nextLine();

		sc.close();

		// Spring JDBC
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh11");
		dataSource.setPassword("kh11");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);

		String sql = "insert into pocketmon(no,name,type) values(?, ?, ?)";
		Object[] param = {no, name, type};
		
		jdbcTemplate.update(sql, param);
		System.out.println("실행 완료");

	}

}
//사용자가 입력한 정보를 토대로 pocketmon 테이블에 데이터를 추가하도록 코드를 구현
