import { createApp } from 'vue'
import './style.css'
import App from './App.vue'

import { createRouter, createWebHistory} from 'vue-router'
import MainPage from './view/MainPage.vue';
import ComponentsPresentantion from './view/ComponentsPresentantion.vue'


const routes = [
    { path: '/', component: MainPage },
    {path: '/components', component: ComponentsPresentantion}
  ]

const router = createRouter({
    history: createWebHistory(),
    routes,
})

createApp(App).use(router).mount('#app')