package jdbc.select2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.PocketmonDto;
import jdbc.util.JdbcUtils;

public class Test01 {
	public static void main(String[] args) {
		// 검색(Select)
		// (ex) 이름의 일부분만 입력하면 나머지 유사한 항목을 조회해서 찾아주는거.

		// 데이터 준비
		String type ="type"; //검색 분류(정적 바인딩)
		String keyword = "불"; //검색 키워드(동적 바인딩) 바인딩은 가져다가 연결시키는걸 의미. 

		// JDBC
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();

		String sql = "select * from pocketmon where instr("+type+", ?) > 0";
		Object[] param = {keyword};

		RowMapper<PocketmonDto> mapper = new RowMapper<PocketmonDto>() {
			@Override
			public PocketmonDto mapRow(ResultSet rs, int arg1) throws SQLException {
				PocketmonDto dto = new PocketmonDto();
				dto.setNo(rs.getInt("no"));
				dto.setName(rs.getString("name"));
				dto.setType(rs.getString("type"));
				return dto;
			}
		};
		
		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper, param);
		System.out.println("검색결과 수 : "+list.size());
		
		for(PocketmonDto dto : list) {
			System.out.println(dto.getName());
		}
	}
}
