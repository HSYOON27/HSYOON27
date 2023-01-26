package jdbc.update;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcUtils;

public class Test01 {
	public static void main(String[] args) {
		//Spring JDBC Update
		//PK(Primary Key)를 사용하여 하나의 행만 수정하도록 구문을 구현 
		//- update pocketmon set name = ?, type = ?, where no = ? 
		//- 등록과 다른 점은 실행이 되더라도 적용 대상이 있거나 없을 수 있다는 것. 
		
		//데이터 준비
		int no = 111;
		String name = "디그다";
		String type = "땅";
		
		//Spring JDBC
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate(); 
		

		String sql = "update pocketmon set name=?, type=? where no=? ";
		Object[] param = {name, type, no}; //순서가 갱장히 중요하다 
		
		int count = jdbcTemplate.update(sql, param);
		System.out.println("count = : "+ count); //이렇게 카운트 횟수로 수정이 됐는지 확인을 하는것이다.
		
		if(count > 0) {
			System.out.println("진짜 수정 됐다");
		}
		else {
			System.out.println("실행은 됐는데 대상이 없듬");
		}
	}
}
