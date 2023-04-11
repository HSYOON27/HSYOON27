package com.kh.springhome.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class GuestBookDto {

	private int GuestBookNo;
	private String GuestBookWriter;
	private String GuestBookMemo;
	private Date GuestBookTime;
	
}
