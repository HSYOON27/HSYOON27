package jdbc.test;

import jdbc.dao.PocketmonDao;
import jdbc.dto.PocketmonDto;

public class Test07 {
	public static void main(String[] args) {
		//Pocketmon 상세조회
		
		//데이터 준비
		int no = 1;
		
		//JDBC
		PocketmonDao dao = new PocketmonDao();
		PocketmonDto dto = dao.selectOne(no);
		
		if(dto == null) {
			System.out.println("찾으시는 번호의 포켓몬이 없습니다.");
		}
		else{
			System.out.println(dto);
		}
	}
}
