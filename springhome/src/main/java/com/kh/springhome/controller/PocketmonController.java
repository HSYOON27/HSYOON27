package com.kh.springhome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.springhome.dao.PocketmonDao;
import com.kh.springhome.dto.PocketmonDto;
import com.kh.springhome.repo.PocketmonRepository;

@Controller
@RequestMapping("/pocketmon")
public class PocketmonController {
	
//  @Autowired
//  private PocketmonDao pocketmonDao;
	
	
// 아래와 같이 주입 설정을 하면 자동으로 상속된 클래스 중 등록된 객체가 주입된다. 	
// 주의) 하나만 등록 되어 있어야함 	
    @Autowired
    private PocketmonRepository pocketmonRepo;
    
	
//	@RequestMapping("/insertInput") //GET, POST 관계 없이 모든 방식 처리
//  @RequestMapping(value = "/insertInput", method = RequestMethod.GET) //이러면 get 방식만 허용
    @GetMapping("/insertInput") //get 방식만 처리. 위에건 너무 길어  
	public String insertInput() {
		return "/WEB-INF/views/pocketmon/insertInput.jsp";
	}
	
	@PostMapping("/insertProcess") //post 방식만 처리
	public String insertProcess(@ModelAttribute PocketmonDto pocketmonDto) {
		pocketmonRepo.insert(pocketmonDto);
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
		PocketmonDto pocketmonDto = pocketmonRepo.selectOne(no);
		model.addAttribute("pocketmonDto", pocketmonDto);
		return "/WEB-INF/views/pocketmon/detail.jsp";
	}
	
	//목록 2023.02.03
	@GetMapping("/list")
	public String list(Model model,  
		@RequestParam(required = false, defaultValue = "name") String column,
		@RequestParam(required = false, defaultValue =  "") String keyword){
		if(keyword.equals("")) {//keyword가 비어있다면
			model.addAttribute("list", pocketmonRepo.selectList());
		}
		else {
			model.addAttribute("list", pocketmonRepo.selectList(column, keyword));
		}
		return "/WEB-INF/views/pocketmon/list.jsp";
	}
	
	// 삭제
	@GetMapping("/delete")
	public String delete(@RequestParam int no)
	 {
		pocketmonRepo.delete(no);
		return "redirect:list";
		//나 화면 없어. 처리만 해주는 애임. 
	 }
	
	// 수정(입력+처리)
	// 수정 입력페이지는 반드시 모든 정보가 작성되어 있어야 합니다. 
	@GetMapping("/edit")
	public String edit(Model model, @RequestParam int no) {
		model.addAttribute("pocketmonDto", pocketmonRepo.selectOne(no));
		return "/WEB-INF/views/pocketmon/edit.jsp";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute PocketmonDto pocketmonDto,
			RedirectAttributes attr) {
		pocketmonRepo.update(pocketmonDto);
		//redirect에 필요한 no 데이터 추가(?no=xxx 가 추가됨)
		attr.addAttribute("no", pocketmonDto.getNo());
		return "redirect:detail";
	}
	
}
