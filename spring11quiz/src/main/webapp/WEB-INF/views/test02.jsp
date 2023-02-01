<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스튜던트</title>
</head>
<body>
<!-- 절대 경로 -->
	<h1>스튜던트 등록(절대경로)</h1>
	<form action="/student/insert">
		<input name="no"><br>
		<br> <input name="name"><br>
		<br> <input name="korean"><br>
		<br> <input name="english"><br>
		<br> <input name="math"><br>
		<br>
		<button>등록</button>
	</form>

	<!-- 상대 경로 -->
	<h1>스튜던트 등록(상대경로)</h1>
	<form action="/..student/insert">
		<input name="no"><br>
		<br> <input name="name"><br>
		<br> <input name="korean"><br>
		<br> <input name="english"><br>
		<br> <input name="math"><br>
		<br>
		<button>등록</button>
	</form>
	
	<h1>스튜던트 검색</h1>
	<a href="/student/list">전체 목록보기</a>
	<br><br>
	<form action="/student/list">
	<select name="column">
		<option value="no">번호</option>
	    <option value="name">이름</option>
	    <option value="korean">국어</option>
	    <option value="english">영어</option>
	    <option value="math">수학</option>
	</select>
	   <br><br>
	   <input name="keyword"><br><br>
	   <button>검색</button>
	</form>
 	   <br><br>
    <h1>스튜던트 상세정보</h1>
    <form action="/student/detail">
    <input type="number"name="no">
    <button>보기</button>
    </form>
    	   <br><br>
    
    <h1>스튜던트 수정</h1>
    <form action="/student/edit">
   
    </form>
        번호
    	<br>
    	<input name="no"><br>
    	이름
		<br>
		<input name="name"><br>
		국어
		<br>
		<input name="korean"><br>
		영어
		<br>
		<input name="english"><br>
		수학
		<br>
		<input name="math"><br>
		<br>
    </form>
    <button>수정</button>
    
    <h1>스튜던트 삭제</h1>
    <form action="/student/delete">
         <input name="no">
    </form>
    <br>
    <button>삭제</button> 
    
    </form>
</body>
</html>