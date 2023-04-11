package com.kh.springhome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.springhome.dao.StudentDao;
import com.kh.springhome.dto.StudentDto;
import com.kh.springhome.repo.StudentRepository;

@CrossOrigin(origins = {"http://127.0.0.1:5500"})
@RestController
@RequestMapping("/rest/student")
public class StudentRestController {

//	@Autowired	
//	private StudentDao studentDao;
	
	@Autowired
	private StudentRepository StudentRepo;
	
	@GetMapping("/")
	public List<StudentDto> list(){
		return StudentRepo.selectList();
	}
	
	@PostMapping("/")
	public void insert(@ModelAttribute StudentDto studentDto) {
		StudentRepo.insert(studentDto);
	}
	
	@DeleteMapping("{no}")
	public void delete(@PathVariable int no) {
		StudentRepo.delete(no);	
	}
	
	
}
