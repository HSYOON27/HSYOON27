<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내가 만든 홈페이지</title>
</head>
<body>
		  <!-- 
		  홈페이지를 상단(header), 컨텐츠(main), 하단(footer) 구분하여 
	 	  생성 후 불러오기
	 	  - 상단과 하단은 별도의 페이지로 만든 뒤 불러오도록 처리
	 	  - 이러한 페이지들을 템플릿 페이지(template page)라고 부름
	 	  -->
	 
	 <!-- 상단 -->	  
	 	  
	<h2><a href="/pocketmon/list">포켓몬 관리</a> <br></h2>
	<h2><a href="/subject/list">과목 관리</a> <br></h2>
	<h2><a href="/student/list">학생 관리</a> <br></h2>
	<hr>