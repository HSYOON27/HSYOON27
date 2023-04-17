package com.kh.spring19.dto;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;

@Data
public class StudentDto {

	@Parameter(description = "학생 번호 ", example="1", required=true)
	private int no;
	@Parameter(description = "학생명 ", example="윤형석", required=true)
	private String name;
	@Parameter(description = "국어", example="90", required=true)
	private int korean;
	@Parameter(description = "영어", example="90", required=true)
	private int english;
	@Parameter(description = "수학", example="90", required=true)
	private int math;
	
}
