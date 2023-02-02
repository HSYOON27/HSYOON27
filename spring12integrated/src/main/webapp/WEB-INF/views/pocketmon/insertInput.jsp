<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포켓몬 등록 페이지</title>
</head>
<body>
	<h1>포켓몬 등록<h1>
	<!-- form의 전송 방식은 크게 2가지로 나뉜다
	- GET : 기본 방식, 주소를 통해 데이터를 전달하는 방식
		- 마치 편지 봉투에 할 말을 작성하는 것과 유사함.
		- 장점 : 간편하게 사용할 수 있다는 장점이 있음. 
		- 단점 : 용량 제한있음.. 256byte임. 주소 포함, 모든 데이터가 노출이 됨..
		- a, img, form, 주소를 직접 입력하는 등 다양한 형태로 가능하다
	- POST : 주소가 아니라 요청 내부에 숨겨서 데이터를 전달하는 방식(body)
	 	- 마치 편지지에 할 말을 작성하는 것과 유사함.
	 	- 장점 : 용량 제한이 없고, 데이터가 요청 바디(편지지)에 숨겨져서 전송이 됨. 
	 	- 지금은 form으로만 가능함
	 -->
	
	<!-- 절대경로<form action="/pocketmon/insertProcess"> -->
	<form action="insertProcess" method="post">
		<input type="text"name="no"placeholder="번호를 적으세여"required><br><br>
		<input type="text"name="name"placeholder="이름을 적으세여"required><br><br>
		<input type="text"name="type"placeholder="타입을 적으세여"required><br><br>
		<button>등록</button>
     </form>
</body>
</html>