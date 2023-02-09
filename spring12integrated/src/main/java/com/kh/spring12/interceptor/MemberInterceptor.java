package com.kh.spring12.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

//비회원이 회원 기능에 접근하는 것을 차단하기 위한 인터셉터
@Service
public class MemberInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//로그인 상태라 함은 = 세션에 있는 memberId가 null이 아닌 경우를 말함.
		HttpSession session = request.getSession(); //세션을 직접 가져와야 함 컨트롤러가 아니기 때문에
		String memberId = (String)session.getAttribute("memberId");
		
		if(memberId != null) { //회원이라면 
			return true;
		}
		else {//비회원 이라면 - 로그인 페이지로 이동시키면서 차단 
			   //리다이렉트 코드 
			response.sendRedirect("/member/login"); //return "redirect:/member/login이랑 같은 의미 
			return false;
		}
	}
}
