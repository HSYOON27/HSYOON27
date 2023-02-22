<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>


<form action="join" method="post" enctype="multipart/form-data">
<!-- 	아이디 : <input type="text" name="memberId" required> <br> -->
<!-- 	<br> 비밀번호 : <input type="password" name="memberPw" required><br> -->
<!-- 	<br> 닉네임 : <input type="text" name="memberNick" required><br> -->
<!-- 	<br> 전화번호 : <input type="tel" name="memberTel" required><br> -->
<!-- 	<br> 이메일 : <input type="email" name="memberEmail"><br> -->
<!-- 	<br> 생년월일 : <input type="date" name="memberBirth" required><br> -->
<!-- 	<br> 우편번호 : <input type="text" name="memberPost"><br> -->
<!-- 	<br> 기본주소 : <input type="text" name="memberBasicAddr"><br> -->
<!-- 	<br> 상세주소 : <input type="text" name="memberDetailAddr"><br> -->
<!-- 	<br> 프사 : <input type="file" name="attach" accept=".jpg, .gif, .pgn">	<br> -->
<!-- 	<br> -->
<!-- 	<button>가입</button> -->
<div class="container-400" >

                <div class="row">
                    <h1>가입 정보 입력</h1> 
                </div>

                <div class="row">
                  아이디 : <input type="text" name="memberId" required class="form-input w-100">
                </div>   

                <div class="row">
                    비밀번호 : <input type="password" name="memberPw" required class="form-input w-100">
                  </div>     

                  <div class="row">
                    닉네임 : <input type="text" name="memberNick" required class="form-input w-100">
                  </div>      

                  <div class="row">
                    전화번호 : <input type="number" name="memberTel" required class="form-input w-100">
                  </div>      

                  <div class="row">
                    이메일 : <input type="text" name="memberEmail" required class="form-input w-100">
                  </div>     

                  <div class="row">
                    생년월일 : <input type="date" name="memberBirth" required class="form-input w-100">
                  </div>      

                  <div class="row">
                    우편번호 : <input type="number" name="memberPost" required class="form-input w-100">
                  </div>  

                  <div class="row">
                    기본주소 : <input type="text" name="memberBasicAddr" required class="form-input w-100">
                  </div>    

                  <div class="row">
                    상세주소 : <input type="text" name="memberDetailAddr" required class="form-input w-100">
                  </div> 

                  <div class="row left">
                  프로필 사진<br>
                  <input type="file" name="attach" accept=".*" class="form-input positive w-100">
                </div>
                
                <label>회원 가입</label>
                
                <div class="row">
          			  <button class="form-btn w-100 positive" >가입</button>
                </div>
                
        </div>
</form>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
