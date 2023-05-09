<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1> 쿠키 배우기 </h1>

<h2> hello라는 이름의 쿠키가 있는가? ${cookie.hello != null} </h2>
<h2> hello라는 이름의 쿠키가 있는가? ${cookie['hello'] != null} </h2>

<c:if test="${cookie.hello != null}">
	<div> 광고창 </div>
</c:if>

<hr>

<c:choose>
	<c:when test="${cookie.saveId == null}">
		<input type="text" name="memberId">
		<input type="checkbox"> 아이디 저장하기 
	</c:when>
	<c:otherwise>
		<input type="text" name="memberId" value="${cookie.saveId.value}">
		<input type="checkbox" checked> 아이디 저장하기 
	</c:otherwise>
</c:choose>
