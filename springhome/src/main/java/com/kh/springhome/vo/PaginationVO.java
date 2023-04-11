package com.kh.springhome.vo;

import lombok.Data;

//VO(Value Object)
//- 필요에 의해 특정 값들을 묶어서 사용하고 싶을 때 만드는 클래스.
//- DTO와 비슷한 의미를 가지지지만, DTO는 테이블 모양이어야 하고 VO는 제약이 없음
//- 등록하지 않고 일회용으로 사용한다.

@Data
public class PaginationVO {
	private String column = "boardTitle";
	private String keyword = "";
	private int page = 1;
	private int size = 10;
	private int count;
	private int blocksize = 10;
	
	//검색 여부 판정 기능
	public boolean isSearch() {
		return !keyword.equals("");
	}
	public boolean isList() {
		return !isSearch();
	}
	//파라미터 생성 메소드
	//- 목록일 경우 size=ooo 형태의 문자열을 반환
	//- 검색일 경우 size=ooo&column=ooo&keyword=000 형태의 문자열을 반환
	public String getParameter() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("size=");
		buffer.append(size);
	
		if(isSearch()) {//검색이라면 항목을 더 추가
			buffer.append("&column=");
			buffer.append(column);
			buffer.append("&keyword=");
			buffer.append(keyword);
		}
		return buffer.toString();
		
	
	}
	
	
	//시작행 번호 계산
	public int getBegin() {
		return page * size - (size-1);
	}
	
	//종료행 번호 계산
	public int getEnd() {
		//return page * size;
		return Math.min(page*size, count);
	}
	//전체페이지 계산 
	public int getTotalPage() {
		return (count+blocksize-1)/blocksize;
	}
	
	//시작블록 계산 
	public int getStartBlock() {
		return (page-1)/blocksize*blocksize+1;
	}
	//종료블록 계산
	public int getFinishBlock() {
		int value =(page-1) / blocksize * blocksize + blocksize;
		return Math.min(value,  getTotalPage());
	}
	
	//첫 페이지인가?
	public boolean isFirst() {
		return page ==1;
	}
	
	//마지막 페이지 인가?
	public boolean isLast() {
		return page == getTotalPage();
	}
	
	//[이전]이 나오는 조건 = 시작 블록이 1보다 크면 => page > size
	public boolean isPrev() {
		return getStartBlock() > 1;
	}
	
	//[다음]이 나오는 조건 = 종료 블록이 마지막페이지보다 작으면 
	public boolean isNext() {
		return getFinishBlock() < getTotalPage();
	}
	
	//[이전]을 누를때 나오는 페이지 번호 
	public int getPrevPage() {
		return getStartBlock()-1;
	}
	//[다음]을 누르면 나오는 페이지 번호
	public int getNextPage() {
		return getFinishBlock()+1;
	}
}
