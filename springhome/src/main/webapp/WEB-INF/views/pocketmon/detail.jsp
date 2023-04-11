<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<body>
	<%-- EL의 좋은 점 중 하나는 null을 화면에 출력하지 않는다는 것이다. --%>
	<h1>포켓몬 정보</h1>
	<h4>번호 : ${pocketmonDto.no}<br></h4>
	<h4>이름 : ${pocketmonDto.name}<br></h4>
    <h4>속성 : ${pocketmonDto.type}<br></h4>
    
    <h2><a href="list">목록으로 이동</a></h2>
    
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
