<template>
   <div class="home">
       <home-header></home-header>
       <div class="contaniner" ref="wrapper">
            <div>
                <home-swiper :swiperList='swiperList'></home-swiper>
                <home-nav :itemList='iconList'></home-nav>
                <home-favorite :favList='recommendList'></home-favorite>
                <home-weekend :weekendList='weekendList'></home-weekend>
            </div>
       </div>
   </div>
</template>

<script>
import {getHome} from '@/api'
import HomeHeader from './base/Header'
import HomeSwiper from './base/Swiper'
import HomeNav from './base/Nav'
import HomeFavorite from './base/Favorite'
import HomeWeekend from './base/Weekend'
import BScroll from 'better-scroll'
    export default {
        name:'Home',
        data() {
            return {
                iconList:[],
                recommendList:[],
                swiperList:[],
                weekendList:[]
            }
        },
        components:{
            HomeHeader,
            HomeSwiper,
            HomeNav,
            HomeFavorite,
            HomeWeekend
        },
        created(){
            this.getData()
        },
        methods:{
            async getData(){
                let {iconList,recommendList,swiperList,weekendList} = await getHome()
                this.iconList = iconList
                this.recommendList = recommendList
                this.swiperList = swiperList
                this.weekendList = weekendList
            }
        },
        mounted(){
            this.scroll = new BScroll(this.$refs.wrapper,{
                click:true
            })
        }
    }
</script>

<style scoped lang="stylus">
.contaniner
    position fixed
    overflow hidden
    left 0
    right 0
    bottom 0
    top .88rem
</style>