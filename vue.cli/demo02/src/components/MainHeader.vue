<template>
    
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary mb-2">
<div class="container-fluid">
<RouterLink class="navbar-brand" to="/">KH Academy</RouterLink>
<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
  <span class="navbar-toggler-icon"></span>
</button>
<div class="collapse navbar-collapse" id="navbarColor01">
  <ul class="navbar-nav me-auto">
    <li class="nav-item">
      <RouterLink class="nav-link active" to="/">Home
        <span class="visually-hidden">(current)</span>
      </RouterLink>
    </li>
    <li class="nav-item">
      <RouterLink class="nav-link" to="/pocketmon">Pocketmon</RouterLink>
    </li>
    <li class="nav-item">
      <RouterLink class="nav-link" to="/subject">Subject</RouterLink>
    </li>
    <li class="nav-item">
      <RouterLink class="nav-link" to="/info">About</RouterLink>
    </li>
  </ul>
  <form class="d-flex">
    <input class="form-control me-sm-2" type="search" placeholder="Search">
    <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
  </form>
</div>
</div>
</nav>
    <div class="header">
           <h1> {{ title }}</h1>

           <!-- 
                메뉴 구현
                - 메뉴를 누르면 <RouterView/> 가 변해야 한다
                - 일반적인 a태그로는 연결하기가 어렵다(Hash 여부를 알 수 없음)
                - <RouterView/>에 연결하기 위해서는 <RouterLink/>를 사용한다
                        - to 속성에 이동할 주소를 작성
                        - /가 절대경로 시작점을 의미 
                        - v-bind가 붙으면 동적으로 설정 가능(회원 비회원 차이)
            -->
          

    </div>
</template>

<script>

export default { 

    //외부에서 불려질 이름(태그명)
    name:"MainHeader", 

    //상위 태그에서 전달한 값 중 사용할 값을 선언해야함
    //props:[title]

    props:{
        title:String
    },

    data( ) {
      return {

        };
    }
};
</script>

<style>

</style>