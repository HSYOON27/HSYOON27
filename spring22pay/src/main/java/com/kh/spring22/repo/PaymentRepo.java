package com.kh.spring22.repo;

import java.util.List;

import com.kh.spring22.dto.PaymentDto;
import com.kh.spring22.vo.PaymentListVO;

public interface PaymentRepo {

   int sequence();
   void save(PaymentDto dto);
   List<PaymentDto> selectByMember(String memberId);
   List<PaymentDto> selectAll();
   PaymentDto find(int paymentNo);
   
   List<PaymentListVO> treeSelect();
   List<PaymentListVO> treeSelect(String memberId);
    
   
   void cancelRemain(int paymentNo); //전체 취소
   void cancelRemain(int paymentNo, int itemTotal);

   
}