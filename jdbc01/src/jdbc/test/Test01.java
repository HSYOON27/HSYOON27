package jdbc.test;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test01 {
	public static void main(String[] args) {
		//Spring을 이용한 JDBC 코드 구현
		
		//목표 : worldcup 테이블에 데이터 한 줄을 insert 하는 것
		//- 자바에서 데이터를 이용한 구문을 준비
		//- 통신을 통해 데이터베이스에 접속
		//- 구문을 전송하고 실행
		//- 데이터베이스 정보, 계정 정보, 테이블 정보를 알아야 함.
		
		//insert into worldcup(rank, name, nation, goal) 
		//values(1,'음바페','프랑스',8);
		
		//접속 도구 생성 
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh11");//계정이름 
		dataSource.setPassword("kh11");//비번 
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver"); //오라클 드라이버 정보
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe"); //오라클 DB 주소 
		
		//명령 실행 도구 생성
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		
		System.out.println("도구 준비 완료!");
		
		//SQL 명령 준비
		String sql = "insert into worldcup(rank,name,nation,goal) values(1,'음바페','프랑스',8)";
		//실행 할때마다 데이터가 들어간당
		
		//SQL 실행
		jdbcTemplate.update(sql);
		System.out.println("실행이 완료되었습니다.");
		
	}

}
