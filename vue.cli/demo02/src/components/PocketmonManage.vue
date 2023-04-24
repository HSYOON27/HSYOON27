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
                        <div class="col">
                        <ul>
                            <li v-for="pocketmon in pocketmonList" :key="pocketmon">
                                번호 : {{pocketmon.no}}, 이름 : {{ pocketmon.name }}, 타입 : {{ pocketmon.type }}
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
//이 파일에서만 Axios를 사용하고 싶다면 이곳에서 import를 진행하면 된다. 
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
                    const resp = await axios.get(url);
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