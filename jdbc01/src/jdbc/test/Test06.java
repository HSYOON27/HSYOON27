package jdbc.test;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 번호를 입력하세요.");
		Integer no = sc.nextInt();

		sc.nextLine();

		System.out.println("이름을 입력하세요.");
		String name = sc.nextLine();

		System.out.println("국어 점수를 입력하세요");
		int korean = sc.nextInt();

		System.out.println("영어 점수를 입력하세요");
		int english = sc.nextInt();

		System.out.println("수학 점수를 입력하세요");
		int math = sc.nextInt();

		sc.close();

		// Spring JDBC
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh11");
		dataSource.setPassword("kh11");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);

		String sql = "insert into student(no,name,korean,english,math) "
				+ "values(student_seq.nextval, ?, ?, ?, ?)";
		Object[] param = { name, korean, english, math };

		jdbcTemplate.update(sql, param);
		System.out.println("실행 완료");

	}

}
