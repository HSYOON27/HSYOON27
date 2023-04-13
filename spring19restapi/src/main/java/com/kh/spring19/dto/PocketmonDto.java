package com.kh.spring19.dto;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;

@Data
public class PocketmonDto {
	
	@Parameter(description = "포켓몬 번호", example="1", required=true)
	private int no;
	@Parameter(description = "포켓몬 이름", example="성현몬", required=true)
	private String name;
	@Parameter(description = "포켓몬 속성", example="근육", required=true)
	private String type;
	
}
