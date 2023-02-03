<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테이블 예제</title>
</head>
<body>
	<!-- 
		table 태그는 표를 구현하는 도구이다.
		- 테이블 헤더(thead), 테이블 바디(tbody), 테이블 풋(tfoot)로 나눠진다.
		- 줄(tr)과 칸(th/td)이 자동으로 늘어난다.
			-th는 제목을 작성하는 칸(굵은 글씨에 가운데 정렬)
			-td는 내용을 작성하는 칸(일반 글씨에 왼쪽 정렬)
		- 내용은 칸 내부에만 작성이 가능하다
		- 테두리는 table에 border라는 속성으로 부여한다.
		- 폭은 width, 높이는 height로 부여가능(권장하진 않음.. 디자인에서 구현하도록)
		- 높이는 잘 안주는 편.. height="50"
	 -->
	<table border="1" width="300">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
			</tr>
		</thead>

		<tbody>
			<tr>
				<td>1</td>
				<td>이상해씨</td>
			</tr>
		</tbody>
	</table>

</body>
</html>