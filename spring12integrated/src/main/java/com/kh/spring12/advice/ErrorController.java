package com.kh.spring12.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

//예외만 전문적으로 처리하는 컨트롤러(사용자가 부를 수 없음.)
//-(주의) 컨트롤러만 감시가 가능 

@ControllerAdvice//프로젝트 전체에 대한 catch 블록 
//@ControllerAdvice(annotations = {Controller.class})//@Controller에 대한 catch 
//@ControllerAdvice(basePackages = {"com.kh.spring12.controller"})

public class ErrorController {

	//마치 catch 블록을 만들듯이 메소드를 구현 
	//@ExceptionHandler 뒤에 (처리할 예외 클래스의 정보)
	//- 컨트롤러처럼 특정 페이지를 보여주거나 Redirect 처리를 하는 등이 가능하다.
	//- 컨트롤러에서 제공받는 도구들을 모두 사용할 수 있다.
	//근데 얘는 전체에 대한 예외처리라..
	@ExceptionHandler(Exception.class) 
	public String error(Exception ex) {
		return "/WEB-INF/views/error/sorry.jsp";
	}
	
	
	//404 예외에만 처리 메소드
	@ExceptionHandler(NoHandlerFoundException.class)
	public String notFound(Exception ex) {
//		ex.printStackTrace();
		return "/WEB-INF/views/error/404.jsp";
	}
	
	//403번은? 우리가 만든 RequirePermissionException으로 대체하여 처리하겠다!
	@ExceptionHandler (RequirePermissionException.class)
	public String forbidden(Exception ex) {
		return "/WEB-INF/views/error/403.jsp";
	}
	
	//401번은? 우리가 만든 RequireLoginException으로 대체하여 처리!
	// - 사용자가 봐야 하는 페이지는 로그인 페이지 이다. 
	@ExceptionHandler(RequireLoginException.class)
	public String unAuthorized(Exception ex) {
//		return "/WEB-INF/views/member/login.jsp"; // 얘는 주소를 유지하고 화면만 변경
		return "redirect:/member/login"; //재접속 지시
	}
	
}
