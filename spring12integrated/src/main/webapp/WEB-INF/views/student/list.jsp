<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
  
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<!-- 제목 -->
		<h1>학생 ${mode}</h1>
		
	<!-- 검색창 -->
		<form action ="list" method = "get">
			<select name = "column">
				<option value="name">학생 이름</option>
				<option value="no">학생 번호</option>
			</select>
		<input type = "search" name ="keyword" placeholder="검색어" value="${keyword}"required>
		 	<button>검색</button>
		</form>
		
		<hr>
		
		<c:choose>
			<c:when test="${list.isEmpty()}">
				<h2>데이터가 존재하지 않습니다.</h2>
				<a href ="insert">등록하기</a>
			</c:when>
			<c:otherwise>
		<br>
		
	<!-- 테이블 -->
		<table border = "1" width ="500">
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>국어</th>
					<th>영어</th>
					<th>수학</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach var ="studentDto" items="${list}">
					<tr align = "center">
						<td>${studentDto.no}</td>
						<td align = "right">
						<a href = "detail?no=${studentDto.no}">
									${studentDto.name}</a></td>
					    <td>${studentDto.korean}</td>
					    <td>${studentDto.english}</td>
					    <td>${studentDto.math}</td>
					    <td>
					    <a href="$">수정</a>
					    <a href="delete?no=${studentDto.no}">삭제</a>
					    </td>
					</tr>
				</c:forEach>
			</tbody>
			
			<tfoot>
				<tr>
					<td colspan="5" align="center">
						<h2><a href="insert">학생 등록하기</a></h2>
						</td>
				</tr>		
			</tfoot>
		</table>
		
		<%-- 삭제 부분 --%>
		<c:forEach var="studentDto" items="${list}">
			<h2>
			${studentDto}
			<a href="detail?no=${studentDto.no}">보기</a>
			</h2>
		</c:forEach>
		
	</c:otherwise>
</c:choose>		 
		
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
