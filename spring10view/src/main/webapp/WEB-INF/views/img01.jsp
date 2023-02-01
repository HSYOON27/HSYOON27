<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html> <!-- 버전을 명시하는 애 html5 -->
<html>
	<head>
		<meta charset="UTF-8">
		<title>이미지 태그 사용법</title>
	</head>
	<body>
	     
	     <!-- 
	     	img 태그는 이미지를 화면에 표시하는 역할.
	     	- 종료 태그를 사용하지 않는다. 범위를 얘기하기 애매하잖아 이미지인디 
	     	- 태그만으로는 이미지를 표시할 수 없다. 
	     	- 태그에 속성(attribute)을 추가하여 정보를 제공해야 한다.
	     	     - src는 이미지의 위치(Source의 줄임말)
	     	     - 이미지의 크기를 폭(width)과 높이(height)로 설정할 수 있다. 
	     	     - 기본 단위는 픽셀(px)로 설정이 된다. 
	     	     - 비율(%)로 설정도 가능함. 매번 따지기 어려울때.
	     	- 내가 가진 이미지를 src에 경로로 작성할 수 있다.    
	     	- 이미지의 위치는 src/main/resources/static에 넣어 두어야 한다. 
	      --> 
	      <img width="600" height="600" src="https://mblogthumb-phinf.pstatic.net/MjAxNzA1MTBfMjY4/MDAxNDk0MzQ2NzgzNDAz.YBl-N_2oSanAnbl_LCB5JwI9kVdN_-hNsLclB7G-9AQg.fNqMz5JCTXK8vUFS-LmmsBv5Fv408wgxN3bzV9RFaj0g.JPEG.poponmiru/ejyh6yeyj566yy.jpg?type=w800">

          <br>
          
          <img width="50%" src = "https://mblogthumb-phinf.pstatic.net/MjAxNzA1MTBfMjY4/MDAxNDk0MzQ2NzgzNDAz.YBl-N_2oSanAnbl_LCB5JwI9kVdN_-hNsLclB7G-9AQg.fNqMz5JCTXK8vUFS-LmmsBv5Fv408wgxN3bzV9RFaj0g.JPEG.poponmiru/ejyh6yeyj566yy.jpg?type=w800">

          <br>
          <img width="200" src = "http://localhost:8080/lit.gif"><br>
          <img width="200" src = "//localhost:8080/lit.gif"><br>
          <img width="200" src = "/lit.gif"><br>
          
           
	</body>
</html>