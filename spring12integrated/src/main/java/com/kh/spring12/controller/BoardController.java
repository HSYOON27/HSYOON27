package com.kh.spring12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring12.dao.BoardDao;
import com.kh.spring12.dto.BoardDto;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardDao boardDao;

	//게시글 작성/등록 
	@GetMapping("/write")
	public String writeInput() {
		return "/WEB-INF/views/board/write.jsp";
	}
	
	@PostMapping("/write")
	public String writeProcess(@ModelAttribute BoardDto boardDto) {
		boardDao.write(boardDto);
		return "redirect:writeFinish";
	}
	
	@GetMapping("/writeFinish")
	public String writeFinish() {
		return "/WEB-INF/views/board/writeFinish.jsp";
	}
	
	//게시글 상세
	@GetMapping("/detail")
	public String detail(Model model, @RequestParam int no) {
		BoardDto boardDto = boardDao.selectOne(no);
		model.addAttribute("boardDto",boardDto);
		return "/WEB-INF/views/board/detail.jsp";
	}
	//게시글 목록
//	@GetMapping("/list")
//	public String list(Model model, 
//			@RequestParam(required=false, defaultValue="boardTitle") String column,
//			@RequestParam(required=false, defaultValue="")String keyword) {
//		boolean search =!column.equals("") && !keyword.equals("");
//	}
//			
			

	
	
}
