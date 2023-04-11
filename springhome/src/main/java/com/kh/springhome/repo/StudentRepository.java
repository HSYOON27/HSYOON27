package com.kh.springhome.repo;

import java.util.List;

import com.kh.springhome.dto.PocketmonDto;
import com.kh.springhome.dto.StudentDto;

public interface StudentRepository {
	
	void insert(StudentDto studentDto);
	List<StudentDto>selectList();
	List<StudentDto>selectList(String column, String keyword); //검색

	StudentDto selectOne(int no);
	boolean update(StudentDto studentDto);
	boolean delete(int no);
	
}
