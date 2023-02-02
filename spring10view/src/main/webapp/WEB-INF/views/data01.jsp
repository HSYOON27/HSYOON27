<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--
 	컨트롤러에서 JSP 화면으로 전달된 데이터(Model)은
 	EL(Expression Language, 표현언어)이라는 문법으로 출력할 수 있다. (HTML이 아님)
 	 
 	표현 언어는 서버에서 클라이언트에게 전송되기 전에 실행. 
 	출력하는 방법은 ${이름}
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>a = ${a}</h1>
	<h1>b = ${b}</h1>
<%-- 	<h1>포케몬 = ${monster}</h1> --%>

	<h1>no = ${monster.getNo()}</h1>
	<h1>name = ${monster.getName()}</h1>
	<h1>type = ${monster.getType()}</h1>
	
<%-- EL에서는 객체의 필드를 추론식으로도 꺼낼 수 있다.
       (주의) 규칙에 맞는 이름의 getter 메소드가 없으면 에러 발생
--%>	
	<h1>no = ${monster.no}</h1>
	<h1>name = ${monster.name}</h1>
	<h1>type = ${monster.type}</h1>
	
	
</body>
</html>