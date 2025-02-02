import './assets/main.css'
// 导入路由
import router from '@/router'
import '@/permission'
import 'animate.css';
import { createApp } from 'vue'
import App from '@/App.vue'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
import 'nprogress/nprogress.css'
// 引入全局状态管理 Pinia
import pinia from '@/stores'
import 'viewerjs/dist/viewer.css'
import VueViewer from 'v-viewer'

const app = createApp(App)

// 应用路由
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
}
app.use(VueViewer)
app.use(router)
app.use(pinia)
app.mount('#app')