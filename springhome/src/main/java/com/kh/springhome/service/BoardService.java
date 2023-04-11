package com.kh.springhome.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dto.BoardDto;

//서비스(Service)
//- 얘는 컨트롤러에서 처리하기 복잡한 작업들을 단위 작업으로 끊어서 수행하는 도구임다.
//- 보통 하나의 기능을 하나의 메소드에 보관한다.
//- 정해진 형태 없이 자유롭게 사용 

@Service
public class BoardService {

	@Autowired
	private BoardDao boardDao;
	//게시글 등록 서비스
	//- 컨트롤러에게 게시글 정보를 받는다
	//- 컨트롤러에게 등록된 게시글 번호를 반환한다
	public int write(BoardDto boardDto, List<Integer> attachmentNo) {
		
		//글 번호와 회원 아이디 구하기 
				int boardNo = boardDao.sequence();
				
				//작성한 게시글 정보에 첨부해서
				boardDto.setBoardNo(boardNo);
				
				//새글일 경우와 답글일 경우에 따른 추가 계산 작업
//				if(boardDto.getBoardParent() == null) {
				if(boardDto.isNew()) {
					boardDto.setBoardGroup(boardNo); //그룹 번호를 글 번호로 설정
					boardDto.setBoardParent(null);// 대상 글 번호를 null로 설정
					boardDto.setBoardDepth(0); //차수를 0으로 설정
				}
				else {
					BoardDto parentDto = boardDao.selectOne(boardDto.getBoardParent()); // 전달받은 대상 글 번호의 모든 정보를 조회하겠다 라는 의미.
					boardDto.setBoardGroup(parentDto.getBoardGroup()); //대상 글 그룹번호
					boardDto.setBoardDepth(parentDto.getBoardDepth()+1); //대상글 차수 +1 
				}
				
				//게시글을 등록 
				boardDao.insert(boardDto);
				
				//글에 사용된 첨부파일 번호와(attachmentNo)와 글번호(boardNo)를 연결
				for(int no : attachmentNo) {
					boardDao.connect(boardNo, no);
				}
				
				//상세 페이지로 이동
				return boardNo;
				
	}
}
