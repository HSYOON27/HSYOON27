package jdbc.test;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02 {
	public static void main(String[] args) {
		//이 방식을 정적 SQL 방식이라고 부름니다. 
		//- SQL 구문을 내가 다 만들어서 전송하는 방식.
		//- 단점 1. 구문이 지저분함, 2. 못쓰는 글자가 있음, 3. 보안에 최약 
		
		
		//데이터 준비
		int rank = 2;
		String name = "리오넬 메시";
		String nation = "아르헨티나";
		int goal = 7;
		
		//Spring JDBC
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh11");
		dataSource.setPassword("kh11");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		
		String sql = "insert into worldcup(rank,name,nation,goal)" 
		+"values("+rank+",'"+name+"','"+nation+"', "+goal+")"; //자바를 거쳐 오라클에 보내는거니까 이딴식으로 씀
		
		jdbcTemplate.update(sql);
		System.out.println("실행 완료");
		
	}
}
