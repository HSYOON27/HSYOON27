package jdbc.select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.SubjectDto;
import jdbc.util.JdbcUtils;

public class Test03 {
	public static void main(String[] args) {

		// JDBC
				JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();

				String sql = "select * from subject";
		//람다(Lambda)를 사용한 mapper 간소화 
	    //- 람다는 메소드가 1개인 인터페이스(함수형 인터페이스)에만 적용 가능 
		//RowMapper<SubjectDto> mapper = (rs, idx)->{}		
				
		RowMapper<SubjectDto> mapper = new RowMapper<SubjectDto>() {
			@Override
			public SubjectDto mapRow(ResultSet rs, int arg1) throws SQLException{
				SubjectDto dto = new SubjectDto();
				dto.setNo(rs.getInt("no"));
				dto.setName(rs.getString("name"));
				dto.setPeriod(rs.getInt("period"));
				dto.setPrice(rs.getInt("price"));
				dto.setType(rs.getString("type"));
				return dto;
			}
		};
		//조회 명령
		List<SubjectDto> list = jdbcTemplate.query(sql, mapper);
		System.out.println("데이터 개수 : " + list.size());
		
		for(SubjectDto dto : list) {
			System.out.println(dto.getNo());
			System.out.println(dto.getName());
			System.out.println(dto.getPeriod());
			System.out.println(dto.getPrice());
			System.out.println(dto.getType());
		}
	}
}
//'subject' 테이블 조회 