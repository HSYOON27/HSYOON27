import { createApp } from 'vue'
import App from './App.vue'

createApp(App).mount('#app')

/* 
    CDN 방식일 때는

    Vue.createApp ({}).mount("#app"); 과 같이 작성했다.

    모듈 방식에서 

    import { createApp } from 'vue' 코드를 이용하여

    createApp 함수만 별도로 불러왔기 때문에 다음과 같은 코드로 작성

    -> createApp({ }).mount('#app')

    App.vue에서 export default로 내보내진 객체를 불러와서 

    -> import App from './App.vue'

    이걸 createApp에 객체로 설정하겠다
    -> createApp(app).mount('#app')
*/