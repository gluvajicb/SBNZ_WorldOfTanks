import Vue from 'vue'
import Router from 'vue-router'


import LoginPage from '@/components/homepage/LoginPage'
import RegisteredUserHomePage from '@/components/registered_user/RegisteredUserHomePage'
import PlaystylePage from '@/components/registered_user/PlaystylePage'

Vue.use(Router)

export default new Router({
    mode: 'history',
    
    routes: [
        {
            path: '/',
            component: LoginPage
        },
        {
            path: '/homepage',
            component: RegisteredUserHomePage
        },
        {
            path: '/playstyle',
            component: PlaystylePage
        }
    ]
})