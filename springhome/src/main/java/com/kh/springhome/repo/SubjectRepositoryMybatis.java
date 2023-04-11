package com.kh.springhome.repo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.SubjectDto;

@Repository
public class SubjectRepositoryMybatis implements SubjectRepository {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(SubjectDto subjectDto) {
		sqlSession.insert("subject.submit", subjectDto);
	}

	@Override
	public List<SubjectDto> selectList() {
		return sqlSession.selectList("subject.selectList");
	}

	@Override
	public SubjectDto selectOne(int no) {
		return sqlSession.selectOne("subject.selectOne", no);
	}

	@Override
	public boolean update(SubjectDto subjectDto) {
		int result = sqlSession.update("subject.update", subjectDto);
		return result > 0;
	}

	@Override
	public boolean delete(int no) {
		int result = sqlSession.delete("subject.delete", no);
		return result > 0;
	}

	@Override
	public List<SubjectDto> selectList(String column, String keyword) {
		Map<?, ?> param = Map.of("column", column, "keyword", keyword);
		return sqlSession.selectList("subject.search", param);
	}
	
	
}
