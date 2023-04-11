package com.kh.springhome.repo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.StudentDto;

@Repository
public class StudentRepositoryMybatis implements StudentRepository{

	@Autowired
	SqlSession sqlSession;

	@Override
	public void insert(StudentDto studentDto) {
		sqlSession.insert("student.submit", studentDto);		
	}

	@Override
	public List<StudentDto> selectList() {
		return sqlSession.selectList("student.selectList");
	}

	@Override
	public StudentDto selectOne(int no) {
		return sqlSession.selectOne("student.selectOne", no);
	}

	@Override
	public boolean update(StudentDto studentDto) {
		int result = sqlSession.update("student.update", studentDto);
		return result > 0;
	}

	@Override
	public boolean delete(int no) {
		int result = sqlSession.delete("student.delete", no);
		return result > 0;
	}

	@Override
	public List<StudentDto> selectList(String column, String keyword) {
		
		Map<?, ?> param = Map.of("column", column, "keyword", keyword);
		return sqlSession.selectList("student.search", param);
	}
	
}
