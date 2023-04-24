import { createApp } from 'vue'
import App from './App.vue'


//이미 개발된 router 모듈을 불러오도록 구현 (index.js는 경로에서 생략 가능)
import {router} from './utils/router' 

// 애플리케이션 생성 코드
// - 라우터를 사용하도록 설정해야함(use 함수 사용)
createApp(App).use(router).mount('#app')