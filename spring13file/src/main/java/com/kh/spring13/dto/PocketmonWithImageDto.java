package com.kh.spring13.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class PocketmonWithImageDto {
	private int no;
	private String name;
	private String type;
	private Integer attachmentNo;

	//이미지의 URL을 반환하는 메소드
	public String getImageURL() {
		if(attachmentNo == null) return "/image/user.png";
		else return "/download?attachmentNo="+attachmentNo;
		
	}
}

