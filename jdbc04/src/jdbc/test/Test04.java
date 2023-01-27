package jdbc.test;

import java.util.List;

import jdbc.dao.SubjectDao;
import jdbc.dto.SubjectDto;

public class Test04 {
	public static void main(String[] args) {
		//Subject 목록/검색 통합
		
		//데이터 준비
		String column = "name";
		String keyword = "자바";
		
		//JDBC
		SubjectDao dao = new SubjectDao();
		List<SubjectDto> list;
		if (column != null && !column.equals("") && keyword != null && !keyword.equals("")) {
			list = dao.selectList(column, keyword);
		} // 이렇게 해놓으면 스캐너 처리해도 가능함. 안그러면 null이 반응을 못하니까. 
		else {
			list = dao.selectList();
		}
		//출력
		if(list.isEmpty()) {
			System.out.println("데이터가 없읍니다.");
		}
		else {
			System.out.println("데이터 개수 : " + list.size());
			for(SubjectDto dto : list) {
				System.out.println(dto);
			}
		}

	}
}
