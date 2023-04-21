<template>
  <div>
    <!-- 헤더 -->
    <!-- <MainHeader v-bind:title="title"> -->
    <MainHeader :title="title">
      
    </MainHeader>

    <!-- 컨텐츠 -->
    <MainContent>


    </MainContent>

    <!-- 푸터 -->
    <MainFooter>


    </MainFooter>

    </div>
  </template>

<script>
  import MainHeader from './components/MainHeader.vue';
  import MainContent from './components/MainContent.vue';
  import MainFooter from './components/MainFooter.vue';
 
  export default {
    //components에서는 사용할 화면 조각(vue)를 정의한다. 
    components:{MainHeader, MainContent, MainFooter}, 

    //data에서는 현재 컴포넌트에서 사용할 데이터를 정의한다
    data( ) {
      return {
        title:"KH당산 화이팅",
      };
    }
  };
</script>


<!--
     style 사용 시 전체 스타일과 컴포넌트 스타일을 구분할 수 있따.
     - <style>로 만들면 전체 스타일이 된다.
     - <style scoped>로 만들면 컴포넌트 전용 스타일이 된다. 
-->
<style>

</style>
