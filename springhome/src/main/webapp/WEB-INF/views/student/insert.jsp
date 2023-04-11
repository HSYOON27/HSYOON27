<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

	<form action="insert" method="post">
<!-- 	<input type="number" name="no" placeholder="번호를 적으세요" required><br><br> -->
<!-- 	<input type="text" name="name" placeholder="이름을 적으세요" required><br><br> -->
<!-- 	<input type="number" name="korean" placeholder="국어점수를 적으세요" min="0" max="100" step="1"  required><br><br> -->
<!-- 	<input type="number" name="english" placeholder="영어점수를 적으세요" min="0" max="100" step="1" required><br><br> -->
<!-- 	<input type="number" name="math" placeholder="수학점수를 적으세요" min="0" max="100" step="1" required><br><br> -->
<!-- 	<Button>등록</Button> -->
<!-- 			<h2><a href="list"> 목록 보러가기</a></h2> -->
	<div class="container-500 mt-50">
            <div class="row center">
                <h1>학생 등록하기</h1> 
            </div>

            <div class="row">
                <label>번호를 적으세요</label>
                <input type="text" name="no" placeholder="번호를 적으세요" class="form-input w-100" required>
            </div>

            <div class="row">
                <input type="text" name="name" placeholder="이름을 적으세요" class="form-input w-100" required>
            </div>

            <div class="row">
                <input type="number" name="korean" placeholder="국어점수를 적으세요" class="form-input w-100" required>
            </div>

            <div class="row">
                <input type="number" name="english" placeholder="영어점수를 적으세요" class="form-input w-100" required>
            </div>

            <div class="row">
                <input type="number" name="math" placeholder="수학점수를 적으세요" class="form-input w-100" required>
            </div>
            
            <div class="row center">
                <button class="form-btn w-100 positive" >등록</button>
            </div>
            
            <div class="row center">
            	<a class="form-btn w-100 neutral" >목록</a>
            </div>
            
        </div>

	</form>
	
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
