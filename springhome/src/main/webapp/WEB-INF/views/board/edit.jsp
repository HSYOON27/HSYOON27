<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<!--summernote cdn-->
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
	<script src="/static/js/textarea.js"></script>

<h1>${boardDto.boardNo }번 게시글 수정</h1>
<form action="edit" method="post">
   <input type="hidden" name="boardNo" value="${boardDto.boardNo }">
   <br><br>
   말머리 : 
   <c:if test="${admin}">
      <c:choose>
         <c:when test="${boardDto.boardHead == '정보' }">
            <select name="boardHead" class=>
               <option value="">없음</option>
               <option>공지</option>
               <option>유머</option>
               <option selected>정보</option>
            </select>
         </c:when>
         <c:when test="${boardDto.boardHead == '유머' }">
            <select name="boardHead">
               <option value="">없음</option>
               <option>공지</option>
               <option selected>유머</option>
               <option>정보</option>
            </select>
         </c:when>
         <c:when test="${boardDto.boardHead == '공지' }">
            <select name="boardHead">
               <option value="">없음</option>
               <option selected>공지</option>
               <option>유머</option>
               <option>정보</option>
            </select>
         </c:when>
         <c:otherwise>
            <select name="boardHead">
               <option value="" selected>없음</option>
               <option>공지</option>
               <option>유머</option>
               <option>정보</option>
            </select>
         </c:otherwise>
      </c:choose>
   </c:if>
   
   <c:if test="${!admin}">
      <c:choose>
         <c:when test="${boardDto.boardHead == '정보' }">
            <select name="boardHead">
               <option value="">없음</option>
               <option>유머</option>
               <option selected>정보</option>
            </select>
         </c:when>
         <c:when test="${boardDto.boardHead == '유머' }">
            <select name="boardHead">
               <option value="">없음</option>
               <option selected>유머</option>
               <option>정보</option>
            </select>
         </c:when>
         <c:otherwise>
            <select name="boardHead">
               <option value="" selected>없음</option>
               <option>유머</option>
               <option>정보</option>
            </select>
         </c:otherwise>
      </c:choose>
   </c:if>
   <br><br>
  <label>제목<i class="fa-solid fa-asterisk"></i><input type="text" name="boardTitle" value="${boardDto.boardTitle}" class="form-input w-100"required></label>
   <br><br>
   <!-- textarea는 value가 없다 -->
   <textarea name="boardContent" required rows="10" cols="60">${boardDto.boardContent }</textarea>
   <br><br>
	<div class="row">
      <button type="submit" class="form-btn positive w-100">수정</button>
   </div></form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>