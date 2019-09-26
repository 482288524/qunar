<template>
   <div class="favorite">
        <div class="title">
            <img class="fav-title-img" src="http://img1.qunarzz.com/piao/fusion/1711/89/ebc329f16c55bb02.png" alt="">
            <h3 class="fav-title">猜你喜欢</h3>
        </div>
        <ul class="fav-list">
            <router-link :to="{name:'detaillink',params:{id:fav.id}}" tag="li" class="fav-item border-bottom" 
            v-for="fav in favList" 
            :key="fav.id">
                <img class="fav-img" :src="fav.imgUrl" alt="">
                <div class="fav-info">
                    <h4>{{fav.title}}</h4>
                    <div class="fav-info-center clearfix">
                        <p class="fav-lev">
                            <i v-for='i in 5' class='iconfont icon-star'></i>
                            <span class='fav-star' :style="fav.score|star">
                                <i v-for='i in 5' class='iconfont icon-star'></i>
                            </span>
                        </p>
                        <p class="fav-comment-num">
                            <span>{{fav.comment}}条评论</span>
                        </p>
                    </div>
                    <div class="fav-price">
                        <span class="fav-price-1">
                            ￥<span class="fav-price-2">{{fav.price}}</span>
                        </span>起
                        <span class="fav-address">{{fav.address}}</span>
                    </div>
                </div>
            </router-link>
        </ul>
   </div>
</template>

<script>
    export default {
        name:'HomeFavorite',
        props:['favList'],
        data() {
            return {

            }
        },
        filters:{
            star(score){
                return {
                    width: score * 100 / 5 + "%"
                }
            }
        }
    }
</script>

<style lang='stylus' scoped>
.border-bottom:before
    border-color #777 
.icon-star:before
    font-size .24rem
.title
    padding .24rem .26rem
    .fav-title-img
        display inline-block
        overflow hidden
        height .4rem
        width .4rem
        vertical-align top
    .fav-title
        display inline-block
        line-height .44rem
.fav-item
    display flex
    height 2.2rem
    padding .2rem .26rem
    .fav-img
        width 2rem
        height 2rem
    .fav-info
        flex 1
        padding .1rem
        margin-left .12rem
        h4
            margin-top .16rem
            width 100%
            font-size .32rem
            line-height .44rem
        .fav-info-center
            line-height .6rem
            font-size .26rem
            .fav-lev
                position relative
                display inline-block
                float left
                color #ccc
                margin-right .5rem
                .fav-star
                    overflow hidden
                    position absolute
                    left 0
                    top 0
                    color #ffb436
            .fav-comment-num
                float left
                line-height .66rem
                color #999
        .fav-price
            margin-top .12rem
            position relative
            font-size .24rem
            line-height .4rem
            color #616161
            .fav-price-1
                color #ff8300
                .fav-price-2
                    color #ff8300
                    font-size .4rem
            .fav-address
                position absolute
                right 0
                bottom 0
</style>