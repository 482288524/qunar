<template>
   <div class="list" ref="wrapper">
       <div>
           <div class="current-city">
                <h3 class="list-title">当前城市</h3>
                <div class="city">
                    <span>{{$store.state.city}}</span>
                </div>
            </div>
            <div class="hot-city">
                <h3 class="list-title">热门城市</h3>
                <div class="hot-city-list">
                    <span v-for="city in hotCities" 
                    :key="city.id"
                    @click="selectCity(city.name)">{{city.name}}</span>
                </div>
            </div>
            <div class="sort">
                <h3 class="list-title">字母排序</h3>
                <div class="sort-list">
                    <span v-for="(city,key) in cities" 
                    :key="city.id"
                    @click="handleClick(key)">{{key}}</span>
                </div>
            </div>
            <div class="list-item" v-for="(item,key) in cities">
                <h3 class="list-title border-topbottom" :ref="key">{{key}}</h3>
                <ul>
                    <li class="city-item border-bottom" 
                    v-for="city in item"
                    @click="selectCity(city.name)">{{city.name}}</li>
                </ul>
            </div>
       </div>
   </div>
</template>

<script>
import BScroll from 'better-scroll'
    export default {
        name:'CityList',
        props:['hotCities','cities'],
        data() {
            return {
            }
        },
        mounted(){
            this.scroll = new BScroll(this.$refs.wrapper,{
                click:true
            })
        },
        computed:{
            letter(){
                return this.$store.state.letter
            }
        },
        watch:{
            letter(value){
                this.scroll.scrollToElement(this.$refs[value][0])
            }
        },
        methods:{
            handleClick(letter){
                this.$store.commit('letterChange',letter)
            },
            selectCity(city){
                this.$store.commit('cityChange',city)
                this.$router.push('/')
            }
        }
    }
</script>

<style lang='stylus' scoped>
.border-bottom:before
    border-color #aaa
.list-title
    line-height: 0.54rem
    padding-left: 0.2rem
    color: #666
    font-size: 0.26rem
.list
    position:fixed
    overflow: hidden
    top: 1.78rem
    left: 0
    right: 0
    bottom: 0
    background: #eee
    .current-city
        .city
            background-color #fff
            padding .1rem .3rem
        span
            display inline-block
            width 25%
            line-height .604rem
            text-align center
            border .02rem solid #ccc
.hot-city
    .hot-city-list
        display flex
        flex-wrap wrap
        justify-content space-between
        align-content space-between
        height 1.48rem
        span 
            display inline-block
            width 32.7%
            line-height .7rem
            text-align center
            background-color #fff
.sort
    .sort-list
        display flex
        flex-wrap wrap
        line-height 2.8rem
        background-color #fff
        span 
            width 16.66%
            line-height .7rem
            text-align center
.city-item
    padding-left .3rem
    line-height .7rem
    background-color #fff
</style>