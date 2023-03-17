package com.kh.spring12.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring12.dao.BoardDao;
import com.kh.spring12.dao.BoardLikeDao;
import com.kh.spring12.dto.BoardLikeDto;
import com.kh.spring12.vo.BoardLikeVo;

@RestController
@RequestMapping("/rest/board")
public class BoardRestController {

	@Autowired
	private BoardLikeDao boardLikeDao;
	
	@Autowired
	private BoardDao boardDao;
	
	//조회는 GET이 맞긴한데
	//데이터가 많으면 주소설정이 어려움..
	//이때는 POST로 처리하면 깰끔
	//@GetMapping("/memberId/{memberId}/boardNo/{boardNo}")
	
	@PostMapping("/like")
	   public BoardLikeVo like(HttpSession session, 
	         @ModelAttribute BoardLikeDto boardLikeDto) {
	      String memberId = (String)session.getAttribute("memberId");
	      boardLikeDto.setMemberId(memberId);
	      
	      boolean current = boardLikeDao.check(boardLikeDto);
	      if(current) {
	         boardLikeDao.delete(boardLikeDto);
	      }
	      else {
	         boardLikeDao.insert(boardLikeDto);
	      }
	      //좋아요 개수
	      int count = boardLikeDao.count(boardLikeDto.getBoardNo());
	      
	      //게시글의 좋아요 갯수 업데이트 
	      boardDao.updateLikecount(boardLikeDto.getBoardNo(), count);
	      
	      
	      return BoardLikeVo.builder()
	    		  .result(!current)
					.count(count)
				.build();
	      
	      //return Map.of("result", !current, "count", count);
	      
	      
	      
	}
	
	@PostMapping("/check") // 좋아요 했는지 확인하는 주소 
	public boolean check(HttpSession session,@ModelAttribute BoardLikeDto boardLikeDto) {
		  String memberId = (String)session.getAttribute("memberId");
	      boardLikeDto.setMemberId(memberId);
	      
	      return boardLikeDao.check(boardLikeDto);

	}
	
}
