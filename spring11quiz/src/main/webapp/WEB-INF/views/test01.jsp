<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서브젝트</title>
</head>
<body>
	<!-- 절대 경로 -->
	<h1>서브젝트 등록(절대경로)</h1>
	<form action="/subject/insert">
		<input name="no"><br>
		<br> <input name="name"><br>
		<br> <input name="period"><br>
		<br> <input name="price"><br>
		<br> <input name="type"><br>
		<br>
		<button>등록</button>
	</form>

	<!-- 상대 경로 -->
	<h1>서브젝트 등록(상대경로)</h1>
	<form action="/..subject/insert">
		<input name="no"><br>
		<br> <input name="name"><br>
		<br> <input name="period"><br>
		<br> <input name="price"><br>
		<br> <input name="type"><br>
		<br>
		<button>등록</button>
	</form>
	
	<h1>서브젝트 검색</h1>
	<a href="/subject/list">전체 목록보기</a>
	<br><br>
	<form action="/subject/list">
	<select name="column">
		<option value="no">번호</option>
	    <option value="name">이름</option>
	    <option value="period">기간</option>
	    <option value="price">가격</option>
	    <option value="type">유형</option>
	</select>
	   <br><br>
	   <input name="keyword"><br><br>
	   <button>검색</button>
	</form>
 	   <br><br>
    <h1>서브젝트 상세정보</h1>
    <form action="/subject/detail">
    <input type="number"name="no">
    <button>보기</button>
    </form>
    	   <br><br>
    
    <h1>서브젝트 수정</h1>
    <form action="subject/edit">
    	번호
    	<br>
    	<input name="no"><br>
    	과목명
		<br>
		<input name="name"><br>
		기간
		<br>
		<input name="period"><br>
		가격
		<br>
		<input name="price"><br>
		타입
		<br>
		<input name="type"><br><br>
		
    <button>수정</button>
    </form>
    	   <br><br>
    
    <h1>서브젝트 삭제</h1>
    <form action="subject/delete">
  		번호
			<input name="no">
    </form>
    <button>삭제</button>
    </form>
    
    
</body>
</html>