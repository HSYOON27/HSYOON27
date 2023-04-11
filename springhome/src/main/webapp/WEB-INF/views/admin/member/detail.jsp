<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/adminHeader.jsp"></jsp:include>

<h1>회원 상세 정보<h1>

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
			    	<td>${memberDto.memberJoin}</td>
				</tr>
				<tr>
			    	<th>최종 로그인</th>
			    	<td>${memberDto.memberLogin}</td>
				</tr>
			<hr>
			
			</tbody>
				 </table>
</h4>

<!-- 회원 관리 메뉴 -->
<h2><a href="edit?memberId=${memberDto.memberId}">개인정보 변경</a></h2>
<h2><a href="password?memberId=${memberDto.memberId}">일회용 비밀번호 설정</a></h2>
<h2><a href="exit?memberId=${memberDto.memberId}">회원 강제 탈퇴</a></h2>
<h2><a href="list">목록 보기</a></h2>

<jsp:include page="/WEB-INF/views/template/adminFooter.jsp"></jsp:include>



