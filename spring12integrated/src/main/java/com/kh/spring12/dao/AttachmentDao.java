package com.kh.spring12.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.spring12.dto.AttachmentDto;

@Repository
public class AttachmentDao {

		@Autowired
		private JdbcTemplate jdbcTemplate;
		
		private RowMapper<AttachmentDto> mapper = new RowMapper<AttachmentDto>() {
		
			@Override
			public AttachmentDto mapRow(ResultSet rs, int rowNum) throws SQLException{

//				[1] 기존 방식				
//				AttachmentDto attachmentDto = new AttachmentDto();
//				attachmentDto.setAttachmentNo(rs.getInt("attachment_no"));
//				attachmentDto.setAttachmentNo(rs.getInt("attachment_no"));
//				attachmentDto.setAttachmentNo(rs.getInt("attachment_no"));
//				attachmentDto.setAttachmentNo(rs.getInt("attachment_no"));

// 				[2] Builder Pattern(Lombok 제공)
				return AttachmentDto.builder()
							.attachmentNo(rs.getInt("attachment_no"))
							.attachmentName(rs.getString("attachment_name"))
							.attachmentType(rs.getString("attachment_type"))
							.attachmentSize(rs.getLong("attachment_size"))
						.build();
			}
		};

// 파일 정보 등록
//	- 시퀀스를 insert에서 만들것인지 아니면 미리 생성할 것인지 판단
//	- 번호를 insert를 제외한 다른 코드에서 사용하려면 분할하고, 아니면 통합		
		
		//시퀀스 생성 명령
		public int sequence() {
			String sql = "select attachment_seq.nextval from dual";
			return jdbcTemplate.queryForObject(sql, int.class);
		}
		
		//insert 
		public void insert(AttachmentDto attachmentDto) {
			String sql = "insert into attachment("
					+ "attachment_no, attachment_name, "
					+ "attachment_type, attachment_size "
					+ ") values(?, ?, ?, ?)";
		Object[] param = {
					attachmentDto.getAttachmentNo(),
					attachmentDto.getAttachmentName(),
					attachmentDto.getAttachmentType(),
					attachmentDto.getAttachmentSize()
					};
		jdbcTemplate.update(sql, param);	
		}
}
