<template>
    <div class="list" ref="wrapper">
        <ul>
            <li v-for="item in weekInfo">
                <img :src="item.imgUrl"/>
                <div class="content">
                    <h3>{{item.title}}</h3>
                    <p>{{item.desc}}</p>
                    <div class="price">
                        ￥<span class="num">{{item.price}}</span>
                        <span class="text">起</span>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</template>

<script>
import BScroll from 'better-scroll'
export default {
        name:'WeekList',
        props:['weekInfo'],
        data() {
            return {

            }
        },
        mounted(){
            this.scroll = new BScroll(this.$refs.wrapper)
        }
    }
</script>

<style lang='stylus' scoped>
.list
    position fixed
    overflow hidden
    top .86rem
    right 0
    bottom 0
    left 0
    img 
        width 100%
        height 3.6rem
    .content
        position relative
        padding .14rem .2rem .24rem
        h3
            font-size .36rem
            line-height .54rem
            padding-right 2.2rem
        p 
            font-size .28rem
            line-height .45rem
            color #616161
            white-space nowrap
            overflow hidden
            text-overflow ellipsis
        .price
            position absolute
            right .2rem
            top .5rem
            color #ff8300
            .num 
                font-size .46rem
                margin-left -.06rem
            .text
                color #616161
                font-size .24rem
</style>