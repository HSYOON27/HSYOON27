package com.kh.spring22.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class PaymentDto {
	private int paymentNo;
	private String paymentTid;
	private String paymentName;
	private int paymentTotal;
	private int paymentRemain;
	private Date paymentTime;
	private String memberId;
	
	//결제 상태
	public String getPaymentStatus() {
		if(paymentTotal == paymentRemain) {
			return "승인되었습니다.";
		}
		else if(paymentRemain == 0) {
			return "완전 취소";
		}
		else {
			return "부분 취소";
		}
	}
}