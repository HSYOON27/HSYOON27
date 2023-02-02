<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과목 관리 페이지</title>
</head>
<body>
	<h1>과목 관리 페이지</h1>
	<h2><a href="../">홈으로</a></h2>

	<!-- 
		required="required" 라는 속성을 입력창에 적으면 
		해당 입력창은 필수입력창이 된다
		
		특별히 속성과 값이 같은 입력창들은 값을 생략할 수 있다
		- required, readonly, selected, checked, disabled, ...
		
		placeholder 속성을 이용하면 미입력 시 표기될 설명을 작성할 수 있다.
	 -->

	<hr>
	<h2>과목 등록</h2>
<!-- 	<form action="/subject/insert"> -->
	<form action="../subject/insert">
		이름 : <input type="text" name="name" required placeholder="개설할 과정 이름"><br><br>
		시수 : <input type="number" name="period" min="0" max="150" step="30" value="30"  required>
		<br><br>
		가격 : <input type="number" name="price" required placeholder="과정 월 수강료"><br><br>
		유형 : 
		<select name="type" required>
			<option>온라인</option>
			<option>오프라인</option>
			<option>혼합</option>
		</select>
		<br><br>
		<button>등록</button>
	</form>

	<hr><!-- 구분선 -->
	<h2>과정 목록</h2>
	<a href="/subject/list">보러가기</a>

	<hr>
	<h2>과정 검색</h2>
	<form action="/subject/list">
		<select name="column">
			<option value="name">이름</option>
			<option value="type">유형</option>
		</select>
		<input type="text" name="keyword" placeholder="검색할 단어 입력" required>
		<button>검색</button>
	</form>

	<hr>
	<h2>과정 상세조회</h2>
	<form action="/subject/detail">
		<input type="number" name="no" placeholder="검색할 과정번호" required>
		<button>조회</button>
	</form>

	<hr>
	<h2>과정 정보 수정</h2>
	<form action="/subject/edit">
		번호 : <input type="number" name="no" placeholder="변경할 과정 번호"> <br><br>
		이름 : <input type="text" name="name" placeholder="과정 이름"> <br><br>
		시수 : <input type="number" name="period" min="0" max="150" step="30"> <br><br>
		가격 : <input type="number" name="price" placeholder="월 수강료"> <br><br>
		유형 : 
		<select name="type" required>
			<option>온라인</option>
			<option>오프라인</option>
			<option>혼합</option>
		</select>
	 	<br><br>
		<button>수정</button>
	</form>

	<hr>
	<h2>과정 삭제</h2>
	<form action="/subject/delete">
		<input type="number" name="no" placeholder="삭제할 과정번호" required>
		<button>삭제하기</button>
	</form>
</body>
</html>