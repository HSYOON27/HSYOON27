<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${subjectDto.no}번 과목의 상세 정보</title>
</head>
<body>	
	<h1>과목 상세 정보</h1>
	<h4>번호 : ${subjectDto.no}</h4><br>
	<h4>이름 : ${subjectDto.name}</h4><br>
	<h4>기간 : ${subjectDto.period}</h4><br>
	<h4>가격 : ${subjectDto.price}</h4><br>
	<h4>종류 : ${subjectDto.type}</h4><br>
	
	<h2><a href="list">목록 보러가기</a></h2>
    <h2><a href="delete?no=${subjectDto.no}">과목 정보 삭제하기</a></h2>
	
</body>
</html>