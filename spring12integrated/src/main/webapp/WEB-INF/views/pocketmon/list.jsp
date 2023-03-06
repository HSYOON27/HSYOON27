<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/adminHeader.jsp"></jsp:include>
	
	
        
	<!-- 검색을 위한 검색창도 존재해야 한다 -->
	
	<div class="container-700">
        <div class="row center">
            <h1>포켓몬 목록/검색</h1>
            <h2><a href="insertInput"> 신규등록</a></h2>
            <form action="list" method="get">
                <select class="form-input me-5" name="column">
                    <option value="name">이름</option>
                    <option value="type">속성</option>
                    <input class="form-input"  type="search" name="keyword"placeholder="검색어"required>
                    <button class="form-btn positive">검색</button>
                </select>
            </form>
        </div>
	
	<%-- 
		목록이든 검색이든 결과는 어차피 List<PocketmonDto> 형태이므로
		JSTL을 사용하여 반복적으로 출력하도록 구현 
	 --%>
	 
	 <%-- 목록 부분 --%>
	 <br>
	<body>
    <div class="row center">
        <table class="table table-border table-hover">
            <thead>
                <tr>
                    <th>번호</th>
                    <th>이름</th>
                    <th>속성</th>
                    <th>관리</th>
                </tr>
            </thead>
            <tbody>
              
            </tbody>
</body>
</div>

	 	
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
	<%--  <c:forEach var="pocketmonDto" items="${list}">
	 	<h2>
	 	${pocketmonDto}
	 	<a href="detail?no=${pocketmonDto.no}">보기</a>
	 	</h2>
	 </c:forEach> --%>
<jsp:include page="/WEB-INF/views/template/adminFooter.jsp"></jsp:include>
