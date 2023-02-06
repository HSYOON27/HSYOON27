<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<title>회원정보 수정 페이지</title>
	<form action="login" method="post">
		아이디 : <input type = "text" name = "memberId" required>
		비밀번호 : <input type ="password" name="memberPw" required>
		<button>회원정보 수정하기</button>
	</form>

<c:if test = "${param.mode == 'error'}">
	<h4>비밀번호가 일치하지 않습니다</h4>
</c:if>		

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
