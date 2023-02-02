package com.kh.spring12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring12.dao.PocketmonDao;
import com.kh.spring12.dto.PocketmonDto;

@Controller
@RequestMapping("/pocketmon")
public class PocketmonController {
    @Autowired
    private PocketmonDao pocketmonDao;
	
//	@RequestMapping("/insertInput") //GET, POST 관계 없이 모든 방식 처리
//  @RequestMapping(value = "/insertInput", method = RequestMethod.GET) //이러면 get 방식만 허용
    @GetMapping("/insertInput") //get 방식만 처리. 위에건 너무 길어  
	public String insertInput() {
		return "/WEB-INF/views/pocketmon/insertInput.jsp";
	}
	
	@PostMapping("/insertProcess") //post 방식만 처리
	public String insertProcess(@ModelAttribute PocketmonDto pocketmonDto) {
		pocketmonDao.insert(pocketmonDto);
		//return "redirect:/pocketmon/insertFinish";//절대경로
		return "redirect:insertFinish"; //상대경로
	}
	
	@GetMapping("/insertFinish")
	public String insertFinish() { 
		return "/WEB-INF/views/pocketmon/insertFinish.jsp";
	}
	//Insert 구조의 완성
	
	//상세
	@GetMapping("/detail")
	public String detail(Model model, @RequestParam int no) {
		PocketmonDto pocketmonDto = pocketmonDao.selectOne(no);
		model.addAttribute("pocketmonDto", pocketmonDto);
		return "/WEB-INF/views/pocketmon/detail.jsp";
	}
}
