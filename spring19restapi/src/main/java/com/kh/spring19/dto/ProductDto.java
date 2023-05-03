package com.kh.spring19.dto;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.Data;

@Data
public class ProductDto {
	
	@Parameter(description = "제품 번호", example="1", required=true)
	private int no;
	@Parameter(description = "제품 이름", example="신라면", required=true)
	private String name;
	@Parameter(description = "제품 타입", example="식품", required=true)
	private String type;
	@Parameter(description = "제품 가격", example="100000", required=true)
	private int price;
}
