package jdbc.delete;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcUtils;

public class Test02 {
	public static void main(String[] args) {

		// 데이터 준비
		int no = 1;

		// JDBC
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();

		String sql = "delete student where no = ?";
		Object[] param = { no };

		int result = jdbcTemplate.update(sql, param);

		if (result > 0) {
			System.out.println("삭제 완료");
		} 
		else {
			System.out.println("대상 없음");
		}

	}

}
// student 테이블의 정보를 삭제하는 프로그램을 구현 
// 번호를 이용하여 데이터 삭제
