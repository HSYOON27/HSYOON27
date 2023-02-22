<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<h1>수업 과목 등록</h1>
	<form action="insert" method="post">
		 <div class="container-400">
    <div class="row center">
        <h1>수업 과목 등록</h1>
    </div>
    <div class="row">
        <input type="number" name="no" required placeholder="과목 번호를 적으세요" class="form-input w-100">
    </div> 
    <div class="row">
        <input type="text" name="name" required placeholder="이름을 적으세요" class="form-input w-100">
    </div>   
    <div class="row">
        <input type="number" name="period" required placeholder="수강 기간을 적으세요" class="form-input w-100">
    </div>   
    <div class="row">
        <input type="number" name="price" required placeholder="가격을 적으세요" class="form-input w-100">
    </div>   
    <div class="row">
        <label class="form-label w-100">강의 유형</label>
        <select name="type" required>
            <option value="">선택하세요</option>
            <option class="form-btn neutral">온라인</option>
            <option class="form-btn neutral">오프라인</option>
            <option class="form-btn neutral">혼합</option>
        </select>
    </div>
    
    <div class="row right">   
    <button class="form-btn w-100 positive">등록</button>
    <a class="form-btn w-100 neutral">목록</a> 
    </div>  
</div>
     </form>
     
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
