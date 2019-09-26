import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default  new Vuex.Store({
    state:{
        letter:'',
        city:localStorage.getItem('city')||'上海'
    },
    mutations:{
        letterChange(state,letter){
            state.letter = letter
        },
        cityChange(state,city){
            state.city = city
            localStorage.setItem('city',city)
        }
    }
})