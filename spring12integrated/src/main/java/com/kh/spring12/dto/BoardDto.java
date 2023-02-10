package com.kh.spring12.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardDto {

	private int BoardNo;
	private String BoardWriter;
	private String BoardTitle;
	private String BoardContent;
	private Date	BoardTime;
	private String BoardHead;
	private int BoardRead;
	private int BoardLike;
	private int BoardReply;
	
}
