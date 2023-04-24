<template>
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
           <RouterLink to="/">홈</RouterLink>
           &nbsp;
           <RouterLink to="/pocketmon">포켓몬스터</RouterLink>
           &nbsp;
           <RouterLink to="/subject">과목정보</RouterLink>
           &nbsp;
           <RouterLink to="/info">정보</RouterLink>

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