package com.kh.springhome.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kh.springhome.dto.PocketmonDto;

//포켓몬 Spring JDBC 구현체
public class PocketmonRepositorySpringJdbc implements PocketmonRepository {

		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		@Override
		public void insert(PocketmonDto pocketmonDto) {
			
		}

		@Override
		public List<PocketmonDto> selectList() {
			return null;
		}

		@Override
		public PocketmonDto selectOne(int no) {
			return null;
		}

		@Override
		public boolean update(PocketmonDto pocketmonDto) {
			return false;
		}

		@Override
		public boolean delete(int no) {
			return false;
		}

		@Override
		public List<PocketmonDto> selectList(String column, String keyword) {
			return null;
		}
}
