package jdbc.select2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.StudentDto;
import jdbc.dto.SubjectDto;
import jdbc.util.JdbcUtils;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색 항목을 입력하세요");
		String column = sc.nextLine();

		System.out.println("키워드를 입력하세요");
		String keyword = sc.nextLine();

		sc.close();

		// JDBC
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();

		String sql = "select * from student where instr(#1, ?) > 0";
		sql = sql.replace("#1", column);
		Object[] param = { keyword };

		RowMapper<StudentDto> mapper = new RowMapper<StudentDto>() {
			@Override
			public StudentDto mapRow(ResultSet rs, int arg1) throws SQLException {
				StudentDto dto = new StudentDto();
				dto.setNo(rs.getInt("no"));
				dto.setName(rs.getString("name"));
				dto.setKorean(rs.getInt("korean"));
				dto.setEnglish(rs.getInt("english"));
				dto.setMath(rs.getInt("math"));
				return dto;
			}
		};
		List<StudentDto> list = jdbcTemplate.query(sql, mapper, param);
	
		if(list.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		}
		else {
			System.out.println("검색 결과 총 : "+list.size()+"건 입니다.");
			for(StudentDto dto : list) {
				System.out.println(dto.getName());
				System.out.println(dto.toString());
			}
		}
	}

}

// 사용자에게 검색할 항목과 키워드를 입력 받아서 'student' 테이블 조회 후 출력 
