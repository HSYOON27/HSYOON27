package com.kh.springhome.repo;

import java.util.List;

import com.kh.springhome.dto.StudentDto;
import com.kh.springhome.dto.SubjectDto;

public interface SubjectRepository {

	void insert(SubjectDto subjectDto);
	List<SubjectDto>selectList();
	List<SubjectDto>selectList(String column, String keyword); //검색
	SubjectDto selectOne(int no); //primary key 자리 
	boolean update(SubjectDto subjectDto);
	boolean delete(int no);
	
}
