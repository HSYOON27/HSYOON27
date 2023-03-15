package com.kh.spring12.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring12.dao.StudentDao;
import com.kh.spring12.dto.StudentDto;

@CrossOrigin(origins = {"http://127.0.0.1:5500"})
@RestController
@RequestMapping("/rest/student")
public class StudentRestController {

	@Autowired	
	private StudentDao studentDao;
	
	@GetMapping("/list")
	public List<StudentDto> list(){
		return studentDao.selectList();
	}
}
