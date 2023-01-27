package jdbc.test;

import jdbc.dao.SubjectDao;
import jdbc.dto.SubjectDto;

public class Test02 {
	public static void main(String[] args) {
		//Subject 수정

		//데이터 준비
		SubjectDto dto = new SubjectDto();
		dto.setNo(21);
		dto.setName("테스트임");
		dto.setPeriod(60);
		dto.setPrice(900000);
		dto.setType("오프라인");
		
		//JDBC
		SubjectDao dao = new SubjectDao();
		boolean result = dao.update(dto);
		
		if(result) {
			System.out.println("변경완료.");
		}
		else {
			System.out.println("대상이 없읍니다.");
		}
	}
}
