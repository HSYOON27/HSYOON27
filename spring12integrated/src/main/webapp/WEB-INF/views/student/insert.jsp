<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<h1>학생 등록하기</h1>
	<form action="insert" method="post">
	<input type="number" name="no" placeholder="번호를 적으세요" required><br><br>
	<input type="text" name="name" placeholder="이름을 적으세요" required><br><br>
	<input type="number" name="korean" placeholder="국어점수를 적으세요" min="0" max="100" step="1"  required><br><br>
	<input type="number" name="english" placeholder="영어점수를 적으세요" min="0" max="100" step="1" required><br><br>
	<input type="number" name="math" placeholder="수학점수를 적으세요" min="0" max="100" step="1" required><br><br>
	<Button>등록</Button>
			<h2><a href="list"> 목록 보러가기</a></h2>
	</form>
	
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
