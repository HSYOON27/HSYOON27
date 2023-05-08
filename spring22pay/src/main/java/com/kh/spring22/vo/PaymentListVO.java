package com.kh.spring22.vo;

import java.util.List;

import com.kh.spring22.dto.PaymentDetailDto;
import com.kh.spring22.dto.PaymentDto;

import lombok.Data;

//payment와 payment_detail을 계층형으로 조회한 결과를 저장할 클래스
@Data
public class PaymentListVO {
	private PaymentDto paymentDto;
	private List<PaymentDetailDto> paymentDetailList;
}