package com.kh.spring19.dto;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;

@Data
public class SubjectDto {

	@Parameter(description = "과목 번호 ", example="1", required=true)
	private int no;
	@Parameter(description = "과목명 ", example="자바마스터", required=true)
	private String name;
	@Parameter(description = "기간", example="90", required=true)
	private int period;
	@Parameter(description = "가격", example="100000", required=true)
	private int price;
	@Parameter(description = "유형", example="온라인", required=true)
	private String type;
	
	
	
}
