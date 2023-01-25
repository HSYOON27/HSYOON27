package jdbc.test;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test03 {
	public static void main(String[] args) {
		// 동적 SQL 방식  
		// - 구문 완성을 위한 재료만 전달하고 도구가 알아서 내부적으로 변환 후 실행
		// - 장점 : 앞의 문제가 다 해결됨
		// - 단점 : 완성된 구문을 볼 수 없음. 
		
		
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
		
		String sql = "insert into worldcup(rank,name,nation,goal)" + "values(?, ?, ?, ?)";
		
		//여기에 배열을 만들어서 물음표와 순서 갯수가 동일하게 데이터를 설정 인트, 스트링을 다 담아야 하니 오브젝트 배열 필요
		Object[] param = {rank, name, nation, goal};
		//알아서 다 해줌. 그러니까 이게 최종형
		
		jdbcTemplate.update(sql, param);
		System.out.println("실행 완료");
		
	}
}
