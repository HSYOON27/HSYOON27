<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포켓몬 목록</title>
</head>
<body>
	<h1>포켓몬 목록/검색</h1>
	<h2><a href="insertInput"> 신규등록</a></h2>
	
	<!-- 검색을 위한 검색창도 존재해야 한다 -->
	<form action="list" method="get">
		<select name="column">
			<option value="name">이름</option>
			<option value="type">속성</option>
		</select>
		<input type="search" name="keyword"placeholder="검색어"required>
			<button>검색</button>
	</form>
	
	<%-- 
		목록이든 검색이든 결과는 어차피 List<PocketmonDto> 형태이므로
		JSTL을 사용하여 반복적으로 출력하도록 구현 
	 --%>
	 
	 <%-- 목록 부분 --%>
	 <br>
	 <table border="1" width="300">
	 	<thead>
	 		<tr>
	 			<th>번호</th>
	 			<th>이름</th>
	 		    <th>속성</th>
	 		    <th>관리</th>
	 		</tr>
	 	</thead>
	 	
	 		 <%-- 삭제 부분 --%>
	 	
	 	<tbody>
	 	<c:forEach var="pocketmonDto" items="${list}">
	 		<tr>
	 			<td>${pocketmonDto.no}</td>
	 			<td>
	 				<a href="detail?no=${pocketmonDto.no}">
	 				${pocketmonDto.name}
	 				</a>
	 				</td>
	 			<td>${pocketmonDto.type}</td>
	 			<td>
	 			<a href="edit?no=${pocketmonDto.no}">수정</a>
	 			<a href="delete?no=${pocketmonDto.no}">삭제</a>
	 			</td>
	 		</tr>
	 	</c:forEach>
	 	</tbody>
	 	
	 </table>
	 <c:forEach var="pocketmonDto" items="${list}">
	 	<h2>
	 	${pocketmonDto}
	 	<a href="detail?no=${pocketmonDto.no}">보기</a>
	 	</h2>
	 </c:forEach>

</body>
</html>