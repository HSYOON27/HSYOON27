<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<title>게시글 상세 페이지</title>

<h1>게시글 정보<h1>

<h4>
       <table border = "1" width ="800">
			<tbody align = "center">
			    <tr>
			    	<th width="30%">회원 번호</th>
			    	<td>${boardDto.boardId}</td>
				</tr>
				  <tr>
			    	<th>작성자</th>
			    	<td>${boardDto.boardWriter}</td>
				</tr>
				<tr>
					<th>제목</th>
					<td>${boardDto.boardTitle}</td>
				</tr>
					<tr>
					<th>내용</th>
					<td>${boardDto.boardContent}</td>
				</tr>
				  <tr>
					<th>작성시간</th>
					<td>${boardDto.boardTime}</td>
				</tr><tr>
					<th>머릿말</th>
					<td>${boardDto.boardHead}</td>
				</tr><tr>
					<th>조회수</th>
					<td>${boardDto.boardRead}</td>
				</tr><tr>
					<th>좋아요</th>
					<td>${boardDto.boardLike}</td>
				</tr>
				<tr>
					<th>댓글수</th>
					<td>${boardDto.boardReply}</td>
				</tr>
			
			</tbody>
				 </table>
</h4>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
