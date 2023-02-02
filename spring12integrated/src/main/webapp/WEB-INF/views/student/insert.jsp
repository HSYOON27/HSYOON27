<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 등록</title>
</head>
<body>
	<h1>학생 등록하기</h1>
	<form action="insert" method="post">
	<input type="number" name="no" placeholder="번호를 적으세요" required><br><br>
	<input type="text" name="name" placeholder="이름을 적으세요" required><br><br>
	<input type="number" name="korean" placeholder="국어점수를 적으세요" min="0" max="100" step="1"  required><br><br>
	<input type="number" name="english" placeholder="영어점수를 적으세요" min="0" max="100" step="1" required><br><br>
	<input type="number" name="math" placeholder="수학점수를 적으세요" min="0" max="100" step="1" required><br><br>
	<Button>등록</Button>
	
	</form>

</body>
</html>