import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
    state:{
        letter:'',
        city:localStorage.getItem('city')||'上海',
        week:localStorage.getItem('week')
    },
    mutations:{
        letterChange(state,letter){
            state.letter = letter
        },
        cityChange(state,city){
            state.city = city
            localStorage.setItem('city',city)
        },
        weekChange(state,week){
            state.week = week
            localStorage.setItem('week',week)
        },
    }
})