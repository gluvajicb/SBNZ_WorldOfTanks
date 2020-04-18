import Vue from 'vue'
import Router from 'vue-router'


import LoginPage from '@/components/homepage/LoginPage'
import RegisterPage from '@/components/homepage/RegisterPage'

Vue.use(Router)

export default new Router({
    mode: 'history',
    
    routes: [
        {
            path: '/',
            component: LoginPage
        },
        {
            path: '/register',
            component: RegisterPage
        }
    ]
})