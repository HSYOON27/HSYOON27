package com.kh.spring12.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.spring12.dto.MemberImageDto;

@Repository
public class MemberImageDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<MemberImageDto> mapper = new RowMapper<MemberImageDto>() {
		@Override
		public MemberImageDto mapRow(ResultSet rs, int rowNum) throws SQLException{
			return MemberImageDto.builder()
						.memberId(rs.getString("member_id"))
						.attachmentNo(rs.getInt("attachment_no"))
					.build();
		}
	};
	
	public void insert(MemberImageDto memberImageDto) {
		String sql = "insert into member_image(member_id, attachment_no) values(?,?)";
		Object[] param = {
				memberImageDto.getMemberId(), memberImageDto.getAttachmentNo()
		};
		jdbcTemplate.update(sql, param);
	}
	
	public MemberImageDto selectOne(String memberId) {
		String sql = "select * from member_image where member_id = ?";
		Object[] param = {memberId};
		List<MemberImageDto> list = jdbcTemplate.query(sql, mapper, param);
		return list.isEmpty() ? null : list.get(0);
		
	}
}
