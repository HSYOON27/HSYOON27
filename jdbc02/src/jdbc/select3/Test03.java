package jdbc.select3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.StudentDto;
import jdbc.util.JdbcUtils;

public class Test03 {
	public static void main(String[] args) {
		//단일검색 
		int no = 2;

		// JDBC
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();

		String sql = "select * from student where no = ?";
		Object[] param = { no };
		
		RowMapper<StudentDto> mapper = new RowMapper<StudentDto>() {
			@Override
			public StudentDto mapRow(ResultSet arg0, int arg1) throws SQLException {
				StudentDto dto = new StudentDto();
				dto.setNo(arg0.getInt("no"));
				dto.setName(arg0.getString("name"));
				dto.setKorean(arg0.getInt("korean"));
				dto.setEnglish(arg0.getInt("english"));
				dto.setMath(arg0.getInt("math"));
				return dto;
			}
		};
		List<StudentDto> list = jdbcTemplate.query(sql, mapper, param);
		
		if(list.isEmpty()) {
			System.out.println("해당 항목이 존재하지 않습니다.");
		}
		else {
			StudentDto dto = list.get(0);
			System.out.println(dto.toString());
		}
	}
}
//PK를 이용해서 student 테이블 항목을 상세 조회 후 출력
