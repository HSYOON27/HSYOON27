<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포켓몬 등록</title>
</head>
<body>

   <!-- 
   		목표 : 미리 구현해둔 포켓몬 등록 컨트롤러로 필요한 데이터를 전송하는 것. 
   		
   		주소 : https://localhost:8080/pocketmon/insert
   		파라미터 : no, name, type
    -->
    <!-- 절대 경로 -->
    <h1>포켓몬스터 등록(절대경로)</h1>
    <form action="/pocketmon/insert">
    	<input name="no"><br><br>
    	<input name="name"><br><br>
    	<input name="type"><br><br>
    	<button>등록</button>
    </form>
    
    <!-- 상대 경로 -->
        <h1>포켓몬스터 등록(상대경로)</h1>
    <form action="/..pocketmon/insert">
 	    <input name="no"><br><br>
    	<input name="name"><br><br>
    	<input name="type"><br><br>
    	<button>등록</button>
    </form>


</body>
</html>