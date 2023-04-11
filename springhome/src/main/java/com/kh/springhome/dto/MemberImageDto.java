package com.kh.springhome.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class MemberImageDto {
	
	private String memberId;
	private int attachmentNo;
		
}
