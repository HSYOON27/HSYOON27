package com.kh.spring22.repo;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring22.dto.PaymentDetailDto;

@Repository
public class PaymentDetailRepoImpl implements PaymentDetailRepo{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void save(PaymentDetailDto paymentDetailDto) {
		sqlSession.insert("paymentDetail.save", paymentDetailDto);
	}
	
	@Override
	public void cancelPaymentDetail(int paymentNo) {
		sqlSession.update("paymentDetail.cancelPaymentDetail", paymentNo);
	}

	@Override
	public void cancelPaymentDetailItem(int paymentDetailNo) {
		sqlSession.update("paymentDetail.cancelPaymentDetailItem", paymentDetailNo);
	}
	
	@Override
	public PaymentDetailDto find(int paymentDetailNo) {
		return sqlSession.selectOne("paymentDetail.find", paymentDetailNo);
	}
	
}