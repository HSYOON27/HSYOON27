package jdbc.test;

import jdbc.dao.SubjectDao;
import jdbc.dto.SubjectDto;

public class Test05 {
	public static void main(String[] args) {
		//Subject 상세조회
		
		//데이터 조회 
		int no = 1;
		
		//JDBC
		SubjectDao dao = new SubjectDao();
		SubjectDto dto = dao.selectOne(no);
		
		if(dto == null) {
			System.out.println("찾으시는 과목이 없습니다.");
		}
		else {
			System.out.println(dto);
		}
	}
}
