<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수업과목 등록 페이지</title>
</head>
<body>
	<h1>수업 과목 등록</h1>
	<form action="insert" method="post">
		<input type="number" name="no" placeholder="번호를 적으세여" required><br><br>
		<input type="text"  name="name" placeholder="이름을 적으세여" required><br><br>
		<input type="number" name="period" placeholder="기간을 적으세여" required><br><br>
		<input type="number" name="price" placeholder="가격을 적으세여" min="0" max="10000000000" step="10000" required><br><br>
		<select name="type" required placeholder="수업 방식을 적으세여">
			<option>온라인</option>
			<option>오프라인</option>
			<option>혼합</option>
		</select>
		<br><br>
		<button>등록</button>
     </form>
</body>
</html>