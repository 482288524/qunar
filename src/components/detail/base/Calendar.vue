<template>
    <div class="calendar border-top">
        <ul class="calend-title border-bottom">
            <li>门票</li>
            <li>一日游</li>
        </ul>
        <div class="calend-item" v-for="item in calendarInfo">
            <h3 class="border-bottom">{{item.calendarInfo.title}}</h3>
            <div class="calend-info border-bottom" v-for="item1 in item.calendarInfo.result">
                <div class="calend-left">
                    <h4 class="calend-title">{{item1.subtitle}}</h4>
                </div>
                <div class="calend-right">
                    <span class="price">￥</span><span class="price price-num">{{item1.price}}</span>
                    起<i class="iconfont icon-jiantouxiangxia"></i>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
        name:'DetailCalendar',
        props:['calendarInfo'],
        data() {
            return {

            }
        },
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
        .calend-info
            display flex
            .calend-left
                flex 3
            .calend-right
                display flex
                flex 1
                font-size .24rem
                justify-content flex-end
                align-items flex-end
                color #9e9e9e
                .price 
                    color #ff8300
                .price-num
                    font-size .4rem
</style>