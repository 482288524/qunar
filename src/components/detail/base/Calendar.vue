<template>
    <div class="calendar border-top">
        <ul class="calend-title border-bottom">
            <li @click="handleTicket">门票</li>
            <li @click="handleOneDay">一日游</li>
        </ul>
        <div class="calend-item" v-for="item in calendarInfo">
            <h3 class="border-bottom" ref="Title">{{item.calendarInfo.title}}</h3>
            <div class="calend-info border-bottom" 
                @click="handleClick(item1)" 
                v-for="item1 in item.calendarInfo.result">
                <div class="calend-left">
                    <h4 class="calend-subtitle">{{item1.subtitle}}</h4>
                </div>
                <div class="calend-right">
                    <span class="price">￥</span><span class="price price-num">{{item1.price}}</span>
                    起<i class="iconfont icon-jiantouxiangxia" :style="item1.styleObj"></i>
                </div>
                <detail-recommend v-show="item1.isShow" :recommendInfo="item1.recommendInfo"></detail-recommend>
            </div>
        </div>
    </div>
</template>

<script>
import DetailRecommend from "./Recommend";
export default {
        name:'DetailCalendar',
        props:['calendarInfo'],
        data() {
            return {

            }
        },
        components:{
            DetailRecommend
        },
        methods:{
            handleClick(item1){
                item1.isShow = !item1.isShow
                item1.styleObj.transform = 'rotate('+ item1.isShow * 180 +'deg)'
            },
            handleTicket(){
                // console.log(this.$refs.Title[0].offsetTop)
                document.documentElement.scrollTop = this.$refs.Title[0].offsetTop + 592
            },
            handleOneDay(){
                // console.log(this.$refs.Title[2].offsetTop)
                document.documentElement.scrollTop = this.$refs.Title[2].offsetTop + 636
            }
        }
    }
</script>

<style lang='stylus' scoped>
.border-top::before
    border-color #E6E6E6
    border-width .6rem
.border-bottom::before 
    border-color #bbb
.calendar
    line-height .88rem
    .calend-title
        display flex 
        li
            width 50%
            font-size .32rem
            text-align center
            margin-top .2rem
    .calend-item
        padding 0 .2rem
        border-bottom .2rem solid #E6E6E6
        h3 
            font-size .34rem
        .calend-info
            display flex
            flex-wrap wrap
            line-height 1.8
            .calend-left
                flex 3
                padding-top .1rem
            .calend-right
                display flex
                flex 1
                font-size .24rem
                justify-content flex-end
                align-items flex-end
                color #9e9e9e
                line-height .8rem
                .price 
                    color #ff8300
                .price-num
                    font-size .4rem
            .recommend
                background #E6E6E6
                line-height 1
</style>