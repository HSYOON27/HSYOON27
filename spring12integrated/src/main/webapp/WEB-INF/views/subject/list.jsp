<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 과목 ${mode} 결과 </title>
</head>
<body>
 	<!-- 제목 -->
	<h1>서브젝트 ${mode}/목록</h1>
			
	<!-- 검색창 -->	
		<form action="list" method="get">
			<select name="column">
				<option value="name">과목명</option>
				<option value="type">유형</option>
			</select>
		<input type = "search" name="keyword" placeholder="검색어" value="${keyword}" required >
			<button>검색</button>
	    </form>
	    
	    <hr>
			
		<c:choose>
		    <c:when test="${list.isEmpty()}">
			<h2>데이터가 존재하지 않습니다.</h2>
			<a href="insert">등록하기</a>
			</c:when>
			<c:otherwise>
	<br>

	
	
	<!--  테이블  -->
	<table border="1"width="500">
		<thead>
			<tr>
				<th>번호</th>
				<th>과목명</th>
				<th>기간</th>
				<th>가격</th>
				<th>유형</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var ="subjectDto" items="${list}">
				<tr align="center">
					<td>${subjectDto.no}</td>
					<td align="left">
					<a href = "detail?no=${subjectDto.no}">
								${subjectDto.name}</a></td>
					<td>${subjectDto.period}</td>
					<td>${subjectDto.price}</td>
					<td>${subjectDto.type}</td>
				</tr>
			</c:forEach>
		</tbody>
		<tfoot>
			<tr>
						<!-- 5칸 만큼 차지하세요 -->
				<td colspan="5" align="center">
				     <h2><a href="insert">신규등록</a></h2>
				</td>
			</tr>
		</tfoot>
	</table>	
	
</c:otherwise>
</c:choose>	
		

</body>
</html>
