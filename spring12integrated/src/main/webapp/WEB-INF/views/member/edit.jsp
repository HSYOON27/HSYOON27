<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<jsp:include page="/WEB-INF/views/template/adminHeader.jsp"></jsp:include>

<title>회원정보 수정 페이지</title>
	
	<table border="1" width="400px">	
		
		<tbody>
		<tr>
			<th width="30%">아이디</th>
			<td>${memberDto.memberId}</td>
		</tr>
		<tr>
			<th>비밀번호확인</th>
			<td>
				<input type="password" name="memberPw" required placeholder="확인을 위한 비밀번호 입력">
			</td>
		</tr>
		<tr>
			<th>닉네임</th>
			<td>
				<input type="text" name="memberNick" required value="${memberDto.memberNick}">
			</td>
		</tr>
		<tr>
			<th>전화번호</th>
			<td>
				<input type="tel" name="memberTel" required value="${memberDto.memberTel}">
			</td>
		</tr>
		<tr>
			<th>생년월일</th>
			<td>
				<input type="date" name="memberBirth" required value="${memberDto.memberBirth}">
			</td>
		</tr>
		<tr>
			<th>이메일</th>
			<td>
				<input type="email" name="memberEmail" value="${memberDto.memberEmail}">
			</td>
		</tr>
		<tr>
			<th rowspan="3">주소</th>
			<td>
				<input type="text" name="memberPost" 
					value="${memberDto.memberPost}" placeholder="우편번호">
			</td>
		</tr>
		<tr>
			<td>
				<input type="text" name="memberBasicAddr" 
					value="${memberDto.memberBasicAddr}" placeholder="기본주소">
			</td>
		</tr>
		<tr>
			<td>
				<input type="text" name="memberDetailAddr" 
					value="${memberDto.memberDetailAddr}" placeholder="상세주소">
			</td>
		</tr>
		
		
		<tr>
			<td colspan="2" align="center">
				<button>수정하기</button>
			</td>
		</tr>
	</tbody>
	</table>

<c:if test="${param.mode == 'error'}">
	<h2>비밀번호가 일치하지 않습니다</h2>
</c:if>

<jsp:include page="/WEB-INF/views/template/adminFooter.jsp"></jsp:include>
