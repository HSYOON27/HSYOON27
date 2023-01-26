package jdbc.select3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.PocketmonDto;
import jdbc.dto.SubjectDto;
import jdbc.util.JdbcUtils;

public class Test02 {
	public static void main(String[] args) {
		//단일검색 
		
		//데이터 준비
		int no = 1;
		//JDBC
				JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		String sql = "select * from subject where no = ?";
		Object[] param = {no};
		
		RowMapper<SubjectDto> mapper = new RowMapper<SubjectDto>() {
			@Override
			public SubjectDto mapRow(ResultSet arg0, int arg1) throws SQLException {
				SubjectDto dto = new SubjectDto();
				dto.setNo(arg0.getInt("no"));
				dto.setName(arg0.getString("name"));
				dto.setPeriod(arg0.getInt("period"));
				dto.setPrice(arg0.getInt("price"));
				dto.setType(arg0.getString("type"));
				return dto;
			}
		};
		
		List<SubjectDto> list = jdbcTemplate.query(sql, mapper, param);		
		
		if(list.isEmpty()) {
			System.out.println("해당 번호의 과목은 존재하지 않습니다.");
		}
		else {
			SubjectDto dto = list.get(0);
			System.out.println(dto.toString());
		}
	}

}
// PK이용해서 subject 테이블 항목 상세조회 후 출력