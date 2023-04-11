package com.kh.springhome.repo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.PocketmonDto;

@Repository
public class PocketmonRepositoryMybatis implements PocketmonRepository {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(PocketmonDto pocketmonDto) {
		sqlSession.insert("pocketmon.add", pocketmonDto);
	}

	@Override
	public List<PocketmonDto> selectList() {
		return sqlSession.selectList("pocketmon.selectList");
	}

	@Override
	public PocketmonDto selectOne(int no) {
		return sqlSession.selectOne("pocketmon.selectOne", no);
	}

	@Override
	public boolean update(PocketmonDto pocketmonDto) {
		int result = sqlSession.update("pocketmon.edit", pocketmonDto);
		return result > 0;
	}

	@Override
	public boolean delete(int no) {
		int result = sqlSession.delete("pocketmon.remove", no);
		return result > 0;
	}

	@Override
	public List<PocketmonDto> selectList(String column, String keyword) {
		
//		Map<?, ?> param = Map.of("column", column, "keyword", keyword); 아래의 3줄을 줄인게 이거
		
		Map param = new HashMap();
		param.put("column", column);
		param.put("keyword", keyword);
		return sqlSession.selectList("pocketmon.search", param);
		
	}
	
	
	
}
