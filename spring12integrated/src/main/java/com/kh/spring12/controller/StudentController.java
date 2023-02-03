package com.kh.spring12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring12.dao.StudentDao;
import com.kh.spring12.dto.StudentDto;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentDao studentDao;
	
	@GetMapping("/insert")
	public String insertInput() {
		return "/WEB-INF/views/student/insert.jsp";
	}
	
	@PostMapping("/insert")
	public String insertProcess(@ModelAttribute StudentDto studentDto) {
		studentDao.insert(studentDto);
		return "redirect:insertFinish";
	}
	
	@GetMapping("/insertFinish")
	public String insertFinish() {
		return "/WEB-INF/views/student/insertFinish.jsp";
	}
	
	//상세
	@GetMapping("/detail")
	public String detail(Model model, @RequestParam int no) {
		StudentDto studentDto = studentDao.selectOne(no);
		model.addAttribute("studentDto", studentDto);
		return "/WEB-INF/views/student/detail.jsp";
	}

	//목록
	@GetMapping("/list")
	public String list(Model model, 
			@RequestParam(required=false, defaultValue="name")String column,
			@RequestParam(required=false, defaultValue="")String keyword){
		boolean search =!column.equals("") &&!keyword.equals("");
		
		if(search) {
			model.addAttribute("keyword", keyword);
			model.addAttribute("mode","검색");
			model.addAttribute("list", studentDao.selectList(column,keyword));
		}
		else {
			model.addAttribute("mode","목록");
			model.addAttribute("list", studentDao.selectList());
		}
		return "/WEB-INF/views/student/list.jsp";
	}
	//삭제
	@GetMapping("/delete")
	public String delete(@RequestParam int no) {
		studentDao.delete(no);
		return "redirect:list";
	}
			
			
}
