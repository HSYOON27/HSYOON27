<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
	<!-- form의 전송 방식은 크게 2가지로 나뉜다
	- GET : 기본 방식, 주소를 통해 데이터를 전달하는 방식
		- 마치 편지 봉투에 할 말을 작성하는 것과 유사함.
		- 장점 : 간편하게 사용할 수 있다는 장점이 있음. 
		- 단점 : 용량 제한있음.. 256byte임. 주소 포함, 모든 데이터가 노출이 됨..
		- a, img, form, 주소를 직접 입력하는 등 다양한 형태로 가능하다
	- POST : 주소가 아니라 요청 내부에 숨겨서 데이터를 전달하는 방식(body)
	 	- 마치 편지지에 할 말을 작성하는 것과 유사함.
	 	- 장점 : 용량 제한이 없고, 데이터가 요청 바디(편지지)에 숨겨져서 전송이 됨. 
	 	- 지금은 form으로만 가능함
	 -->
	
	<!-- 절대경로<form action="/pocketmon/insertProcess"> -->
	
	<form action="insertProcess" method="post" autocomplete="off">
		<div class="container-300" >
    <div class="row center">
    <h1 >포켓몬 등록</h1>
    </div>

    <div class="row left">
    <input type="text" name="no" placeholder="번호를 적으세요" class="form-input w-100" required>
    </div>

    <div class="row left">
    <input type="text" name="name" placeholder="이름을 적으세요" class="form-input w-100" required>
    </div>

    <div class="row left">
    <input type="text" name="type" placeholder="타입을 적으세요" class="form-input w-100" required>
    </div>

    <div class="row right">
        <!-- 
            form 안에 있는 버튼은 전송용 버튼으로 기본 취급한다.
            문제를 해결하기 위해서는 다음과 같이 처리한다. 

            1. 버튼에 type을 설정해서 용도를 지정할 수 있다.
            - type="submit" 이면 폼을 전송시키는 버튼
            - type="button" 이면 그냥 버튼

            2. 버튼말고 다른 태그를 사용한다. 
            - a태그, input[type=button] 등을 사용 할 수 있다.
        -->
<!--     <button type="submit" class="form-btn neutral">목록</button> -->
<!--     <button type="button" class="form-btn positive">등록</button> -->
<!--     </div> -->

<!--     <div class="row"> -->
<!--         <button type="submit" class="form-btn neutral w-100">목록</button> -->
<!--     </div> -->

<!--     <div> -->
<!--         <button type="button" class="form-btn positive w-100" style="display: block; text-decoration: none;">등록</button> -->
<!--     </div> -->
    
    <div class="row right">
    	<a class="form-btn w-100 neutral" href="list">목록</a>
    </div>
    
   <div class="row right">
            <button class="form-btn w-100 positive" >등록</button>
    </div>
           
    
    
</div>    
    </form> 
</div>
     </form>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
     