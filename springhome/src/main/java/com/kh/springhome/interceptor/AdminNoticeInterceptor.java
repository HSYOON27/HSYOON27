package com.kh.springhome.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

@Service
public class AdminNoticeInterceptor implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, //사용자가 보낸 정보임 request
			HttpServletResponse response, //사용자에게 보낼 정보 resposne 중요 매우중요
			Object handler)
			throws Exception {
		// 전송 방식이 get 이면 통과
		if(request.getMethod().equals("GET")) {
			return true;
		}
		//나머지 POST는 검사
		String boardHead = request.getParameter("boardHead");
		boolean isNotice = boardHead != null && boardHead.equals("공지");
		
		if(isNotice) {//공지를 등록하려 한다면, 
			//여기서 관리자 검사를 한다.
			HttpSession session = request.getSession();
			String memberLevel = (String) session.getAttribute("memberLevel");
			boolean isAdmin = memberLevel != null && memberLevel.equals("관리자");
			if(isAdmin) { //관리자라면
				return true;
			}
		}
		else {//공지가 아니면 검사 자체를 할 필요가 없이 true ! 통과
			return true;
		}
		response.sendError(403);
		return false;
	}
}