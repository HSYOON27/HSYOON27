<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<h1>웹소켓 예제 모음</h1>

<c:choose>
	<c:when test="${memberId == null}">
			<!-- 로그인 화면 : 로그아웃 상태일 때 -->
		<form action="login" method="post">
			<input type="text" name="memberId" required placeholder="아이디">
			<input type="password" name="memberPw" required placeholder="비밀번호">
			<button type="submit">로그인</button>
		</form>
	</c:when>
	
	<c:otherwise>
		<!-- 사용자 정보 : 로그인 상태일 때 -->
		<h2>
		아이디 : ${sessionScope.memberId}, 
		등급 : ${sessionScope.memberLevel}
		<a href="logout">로그아웃</a>
		</h2>
	</c:otherwise>
</c:choose>


<h2><a href="basic">기본 웹 소켓 연결</a></h2>
<h2><a href="chat">채팅</a></h2>
<h2><a href="sockjs">SocjJs채팅</a></h2>
<h2><a href="json">JSON채팅</a></h2>
<h2><a href="channel1">채널예제 1번 (사용자 클래스화)</a></h2>
<h2><a href="channel2">채널예제 2번 (채팅창 클래스화)</a></h2>
<h2><a href="channel3">채널예제 3번 (채널 클래스화)</a></h2>


<h2><a href="member">회원 전용 채팅(jQuery)</a></h2>
<h2><a href="vuemember">회원 전용 채팅(Vue)</a></h2>