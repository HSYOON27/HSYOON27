package com.kh.spring12.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.spring12.dto.GuestBookDto;


@Repository
public class GuestBookDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<GuestBookDto> mapper = new RowMapper<GuestBookDto>() {
		@Override
		public GuestBookDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			GuestBookDto guestBookDto = new GuestBookDto();
			guestBookDto.setGuestBookNo(rs.getInt("guest_book_no"));
			guestBookDto.setGuestBookWriter(rs.getString("guest_book_writer"));
			guestBookDto.setGuestBookMemo(rs.getString("guest_book_memo"));
			guestBookDto.setGuestBookTime(rs.getDate("guest_book_time"));
			return guestBookDto;
		}
	};

	public GuestBookDto selectOne(int guestBookNo) {
		String sql = "select * from guest_book where guest_book_no = ?";
		Object[] param = {guestBookNo};
		List<GuestBookDto> list = jdbcTemplate.query(sql, mapper, param);
		return list.isEmpty() ? null : list.get(0);
	}
	
	
}
