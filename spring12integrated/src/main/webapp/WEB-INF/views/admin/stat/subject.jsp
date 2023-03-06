<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="/WEB-INF/views/template/adminHeader.jsp"></jsp:include>

<h1> 과목 현황 </h1>

<div class="row center">
        <table class="table table-border table-hover">
            <thead>
                <tr>
                 	 <th>유형</th>
					<th>강의수</th>
					<th>가격 평균 </th>
                </tr>
            </thead>
           <tbody>
		<c:forEach var="subjectStatDto" items="${list}">
			<tr>
				<td>
					<a href="/subject/list?column=type&keyword=${subjectStatDto.type}">
						${subjectStatDto.type}
					</a>
				</td>
				<td align="center">${subjectStatDto.cnt}</td>
		     	<td align="center">	
			<fmt:formatNumber value = "${subjectStatDto.average}" pattern="#,##0.00"></fmt:formatNumber>
				</td>
			</tr>
		</c:forEach>
	</tbody>
            </table>
            </div>


<jsp:include page="/WEB-INF/views/template/adminFooter.jsp"></jsp:include>
