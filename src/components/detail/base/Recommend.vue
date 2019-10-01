<template>
    <div class="recommend border-top">
        <slot></slot>
        <div class="rec-center border-bottom" v-for="item in recommendInfo">
            <div class="center-left">
                <p class="title">{{item.title}}</p>
                <p class="time">{{item.time}}</p>
                <p class="tag">随时可退</p>
            </div>
            <div class="center-right">
                <p class="price">
                    ￥<span class="price-num">{{item.price}}</span>
                </p>
                <button class="type">{{item.type}}</button>
            </div>
        </div>
    </div>
</template>

<script>
export default {
        name:'DetailRecommend',
        props:['recommendInfo'],
        data() {
            return {

            }
        },
    }
</script>

<style lang='stylus' scoped>
.border-bottom::before
    border-color #bbb
.border-top::before 
    border-color #E6E6E6
    border-width .6rem
.recommend
    padding 0 .2rem
    .rec-center
        display flex
        padding .2rem 0
        .center-left
            flex 3
            padding-right .6rem
            .title
                font-size .28rem
                line-height 1.5
                height .8rem
                overflow hidden
            .time
                font-size .24rem
                margin .1rem 0 0 .1rem
            .tag
                font-size .26rem
                color #00b3d4
                margin .1rem 0 0 .1rem
        .center-right
            flex 1
            text-align center
            margin-top .4rem
            .price
                color #ff8300
                font-size .24rem
                .price-num
                    font-size .4rem
            .type
                line-height .6rem
                width 1.8rem
                border-radius .1rem
                background #ffab1e
                color #fff
</style>