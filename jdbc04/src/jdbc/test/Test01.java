package jdbc.test;

import jdbc.dao.SubjectDao;
import jdbc.dto.SubjectDto;

public class Test01 {
	public static void main(String[] args) {
		//Subject 등록
		
		//데이터 준비
		SubjectDto dto = new SubjectDto();
		dto.setNo(5);
		dto.setName("테스트과목");
		dto.setPeriod(90);
		dto.setPrice(12000000);
		dto.setType("오프라인");
		
		//JDBC
		SubjectDao dao = new SubjectDao();
		dao.insert(dto);
		
		System.out.println("실행완료");

	}
}
