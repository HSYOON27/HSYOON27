<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1> 파일 관리 예제 </h1>

<!-- 파일 전송은 input[type=file]로 한다
	 GET방식은 용량제한 때문에 파일 전송이 불가능하며 이름만 전송.
	 POST방식도 용량 제한은 없지만 전송이 불가능하며 이름만 전송. 
	 
	 POST방식은 Encoding Type에 따라 두 가지로 나뉘어 진다.
	 	- application/x-www-form-urlencoded은 기본 방식이며 key=value 형태로 전송된다.
	 	- key=value가 1:1 매칭이라 파일과 같이 보내야 할 정보가 많을때는 전송이 어렵다능..
	 	- 파일을 전송하고 싶다면 반드시 enctype="multipart/form-data"로 변경해야한다	
 -->

<h2>GET 예제</h2>
<form action = "upload1" method="get" enctype="application/x-www-form-urlencoded">
	<input type="file" name="attach">

	<br><br>
	
	<button>업로드</button>
</form>
<hr>
<h2>POST 예제</h2>
<form action="upload2" method="post">
	<input type="file" name="attach"> <br>
	<br>

	<button>업로드</button>
</form>
<hr>
<h2>POST(multipart 방식) 예제</h2>
<form action="upload3" method="post" enctype="multipart/form-data">
	<input type="file" name="attach"> 
	<br><br>
	<button>업로드</button>
</form>
<hr>

<h2>포켓몬스터 등록</h2>
<form action="upload4" method ="post" enctype="multipart/form-data">
	번호 : <input type = "text" name="no"><br><br>
	이름 : <input type = "text" name="name"><br><br>
	속성 : <input type = "text" name="type"><br><br>
	이미지 : <input type ="file" name="attach" accept=".jpg, .gif, .png"><br><br>
	<button>등록</button>	
</form>

<hr>

<!-- 
	파일 여러개 첨부하기 위해서
	1. input 태그를 여러개 만든당 - 개수 제한하고 싶을때 이 방법 사용
	2. input 태그에 multiple 옵션 추가한다 - 개수 무제한(제한하려면 프로그래밍 코드가 필요함)
 -->

<h2>파일 여러개 보내기</h2>

<form action="upload5" method ="post" enctype="multipart/form-data">
	<input type="file" name="attaches" multiple accept="image/*">
	<button>전송</button>
</form>

<hr>

<c:forEach var="pocketmonImageDto" items="${list}">
	<a href="/download?attachmentNo=${pocketmonImageDto.attachmentNo}">
	<img width="700" height="700" src="/download?attachmentNo=${pocketmonImageDto.attachmentNo}">
	</a>
	&nbsp;&nbsp;
	<br><br>
</c:forEach>