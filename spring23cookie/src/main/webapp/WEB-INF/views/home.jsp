<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<h1>쿠키 배우기</h1>

<h2>hello라는 이름의 쿠키가 있는가? ${cookie.hello != null}</h2>
<h2>hello라는 이름의 쿠키가 있는가? ${cookie['hello'] != null}</h2>

<c:if test="${cookie.hello != null}">
   <div>광고창</div>
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

<hr>

<h2>visit 쿠키 = ${cookie.visit.value }</h2>

<h2><a href="create">생성하기</a></h2>
<h2><a hre="delete">삭제하기</a></h2>

<h2>first = ${first}, diff = ${diff}</h2>

<c:if test="${first}">
   <h2>첫 방문을 환영합니다!</h2>
</c:if>
<c:if test="${!first && diff != null}">
   <h2>${diff/1000/60/60/24}일만에 오셨네요</h2>
   <h2>
      <fmt:parseNumber integerOnly="true" value="${diff/1000/60/60/24}" ></fmt:parseNumber>
      일만에 오셨네요
   </h2>
</c:if>
