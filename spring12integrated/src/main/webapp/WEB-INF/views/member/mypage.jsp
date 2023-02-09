<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>마이 페이지<h1>

<h4>
       <table border = "1" width ="800">
			<tbody align = "center">
			    <tr>
			    	<th width="30%">아이디</th>
			    	<td>${memberDto.memberId}</td>
				</tr>
				  <tr>
			    	<th>닉네임</th>
			    	<td>${memberDto.memberNick}</td>
				</tr>
				  <tr>
			    	<th>전화번호</th>
			    	<td>${memberDto.memberTel}</td>
				</tr>
				  <tr>
			    	<th>생년월일</th>
			    	<td>${memberDto.memberBirth}</td>
				</tr>
				  <tr>
			    	<th>이메일</th>
			    	<td>${memberDto.memberEmail}</td>
				</tr>
				<tr>
			    	<th>주소</th>
			    	<td>[${memberDto.memberPost}]
			    	${memberDto.memberBasicAddr}${memberDto.memberDetailAddr}</td>
				</tr>
				<tr>
			    	<th>회원등급</th>
			    	<td>${memberDto.memberLevel}</td>
				</tr>
				<tr>
			    	<th>회원 포인트</th>
			    	<td>${memberDto.memberPoint} point</td>
				</tr>
				<tr>
			    	<th>가입일</th>
			    	<td>
			    		<fmt:formatDate value="${memberDto.memberJoin}" 
			    		pattern="y년 M월 d일 E a h시 m분 s초"/>
			    	</td>
				</tr>
				<tr>
			    	<th>최종 로그인</th>
			    	<td>
			    	<fmt:formatDate value="${memberDto.memberLogin}" 
			    		pattern="y년 M월 d일 E a h시 m분 s초"/>
			    		</td>
				</tr>
			<hr>
			
			</tbody>
				 </table>
</h4>

<!-- 회원 관리 메뉴 -->
<h2><a href="password">비밀번호 변경</a></h2>
<h2><a href="information">개인정보 변경</a></h2>
<h2><a href="exit">회원 탈퇴</a></h2>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>


