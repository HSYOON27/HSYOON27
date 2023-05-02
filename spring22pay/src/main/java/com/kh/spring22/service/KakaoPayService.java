package com.kh.spring22.service;

import java.net.URISyntaxException;

import com.kh.spring22.vo.KakaoPayReadyRequestVO;
import com.kh.spring22.vo.KakaoPayReadyResponseVO;

public interface KakaoPayService {
	
//	//준비 - ready
	KakaoPayReadyResponseVO ready(KakaoPayReadyRequestVO vo) throws URISyntaxException;
	
//	//승인 - approve 
//	KakaoPayApproveResponseVO approve(KakaoPayApproveRequestVO vo);

}
