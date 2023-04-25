<template>
    <div class="container-fluid">
        <div class="row">
            <div class="offset-md-2 col-md-8 offset-1 col-10">

                    <!-- Jumbotron-->
                    <div class="row">
                        <div class="col p-4 bg-dark text-light rounded">
                            <h1> 포켓몬 관리 </h1>    
                        </div>
                    </div>

                    <div class="row mt-4">
                        <div class="col-sm-6 mb-4" v-for="(pocketmon) in pocketmonList" :key="pocketmon.no">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="pocketmonName">{{pocketmon.name}}</h4>
                                    <h6 class="card-subtitle mb-2 text-muted">{{pocketmon.type}}</h6>
                                    <p class="card-text">{{pocketmon.no}}</p>
                                    <a href="#" class="card-link">Card link</a>
                                    <a href="#" class="card-link">Another link</a>
                                </div>
                                </div>
                        </div>
                    </div>

            </div>
        </div>
    </div>
</template>

<script>
//이 파일에서만 Axios를 사용하고 싶다면 이곳에서 import를 진행하면 된다. 
// - axios에 추가적인 설정을 해야하는 경우가 있다면 매 파일마다 해야함. 

import axios from "axios";
console.log(axios);
        export default {
            data(){
                return {
                    pocketmonList:[],
                };
            },
            methods:{
                async loadList(){
                    const url = "http://localhost:8083/pocketmon/";
                    
                    // const resp = await axios.get(url);
                    const resp = await this.$http.get(url);//vue에 등록한 $http를 사용
                    this.pocketmonList.push(...resp.data);
                },
            },
            created(){
                this.loadList();
            },
        };
</script>

<style scoped>

</style>