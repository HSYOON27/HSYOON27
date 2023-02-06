<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<h1>포켓몬 정보 변경</h1>
	<!-- 
	수정 입력 페이지에서는 전달 받은 정보를 value로 표시해야 된다. 
	- 사실상 상세 페이지를 입력창으로 표시한 형태와 같다.
	- PK(Primary Key) 는 변경이 불가하도록 처리. 방법 2개가 있음.
		1. 입력창 잠금(readonly 속성 추가).
		2. 입력창 type을 hidden으로 설정하면 표시되지 않음.
	-->
	    
	<form action="edit"method="post">
		<input type="hidden" name="no"  value="${pocketmonDto.no}"readonly><br><br>
		이름 : <input type="text" name="name" value="${pocketmonDto.name}"><br><br>
		속성 : <input type="text" name="type" value="${pocketmonDto.type}"><br><br>
		<button>수정하기</button>
	</form>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
