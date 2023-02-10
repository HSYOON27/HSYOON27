package com.kh.spring12.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.spring12.dto.BoardDto;
import com.kh.spring12.dto.SubjectDto;

@Repository
public class BoardDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//맵퍼 설정
	private RowMapper<BoardDto> mapper = new RowMapper<BoardDto>() {
		@Override
		public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			BoardDto boardDto = new BoardDto();
			boardDto.setBoardNo(rs.getInt("board_no"));
			boardDto.setBoardWriter(rs.getString("board_writer"));
			boardDto.setBoardTitle(rs.getString("board_title"));
			boardDto.setBoardContent(rs.getString("board_content"));
			boardDto.setBoardTime(rs.getDate("board_time"));
			boardDto.setBoardHead(rs.getString("board_head"));
			boardDto.setBoardRead(rs.getInt("board_read"));
			boardDto.setBoardLike(rs.getInt("board_like"));
			boardDto.setBoardReply(rs.getInt("board_reply"));
			
			return boardDto;
		}
	};
	
	//게시글 작성 및 등록 설정
	
	public void write(BoardDto boardDto) {
		String sql = "insert into board(board_no, board_writer, board_title, board_content, board_time, board_content,"
				+ "board_time, board_head, board_read, board_like, board_reply) values(board_seq_nextval,?,?,?,?,?,?,?,?)";
		Object[] param = {
				boardDto.getBoardWriter(), boardDto.getBoardTitle(), boardDto.getBoardContent(), boardDto.getBoardTime(),
				boardDto.getBoardContent(), boardDto.getBoardTime(), boardDto.getBoardHead(), boardDto.getBoardRead(),
				boardDto.getBoardLike(), boardDto.getBoardReply()
		};
		jdbcTemplate.update(sql, param);
	}
	
	public List<BoardDto> selectList(){
		String sql = "select * from board order by board_no asc";
		return jdbcTemplate.query(sql, mapper);
	}
	
	public List<BoardDto> selectList(String column, String keyword){
		String sql = "select * from board where instr(#1,?) > 0 order by #1 asc";
		sql = sql.replace("#1", column);
		Object[] param = {keyword};
		return jdbcTemplate.query(sql, mapper, param);
	}
	
	public BoardDto selectOne(int no) {
		String sql = "select * from board where no = ?";
		Object[] param = {no};
		List<BoardDto> list = jdbcTemplate.query(sql, mapper, param);
		return list.isEmpty() ? null : list.get(0);
	}
	
	//게시글 삭제 
	public boolean delete(int no) {
		String sql = "delete board where no=?";
		Object[] param = {no};
		return jdbcTemplate.update(sql, param)>0;
	}
	
	
	//게시글 상세
	
	
	
	//게시글 수정 입력, 수정 처리 
	public boolean editBoard(BoardDto boardDto) {
		String sql = "update board set board_title=?, board_content=?, board_head=?";
		Object[] param = {
			boardDto.getBoardTitle(), boardDto.getBoardContent(), boardDto.getBoardHead()
		};
		return jdbcTemplate.update(sql, param) > 0;
	}
	
}
