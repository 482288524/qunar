<template>
    <div class="card">
        <div class="card-top">
            <div class="card-score">
                <div class="card-score-t">
                    <span class="score-num">{{cardInfo.score}}</span><span>分</span>
                    <span>{{cardInfo.desc}}</span>
                </div>
                <div class="card-score-b bottom">
                    <span>{{cardInfo.comment}}条评论</span>
                    <span>{{cardInfo.walkthrough}}条攻略</span>
                    <i class="iconfont icon-jiantouyou"></i>
                </div>
            </div>
            <div class="card-introduce border-left">
                <div class="card-intro-t">
                    <span>景点简介</span>
                </div>
                <div class="card-intro-b bottom">
                    <span>开放时间、贴士</span>
                    <i class="iconfont icon-jiantouyou"></i>
                </div>
            </div>
        </div>
        <div class="address border-top">
            <i class="el-icon-location-outline"></i>
            <span>{{cardInfo.address}}</span>
            <i class="iconfont icon-jiantouyou"></i>
        </div>
    </div>
</template>

<script>
export default {
    name:'DetailCard',
    props:['cardInfo'],
        data() {
            return {

            }
        },
    }
</script>

<style lang='stylus' scoped>
.border-left::before,.border-top::before
    border-color #bbb
.icon-jiantouyou::before
    position absolute
    right 0
    top .3rem
.bottom
    color #9e9e9e
    font-size .26rem
.card
    position relative
    top -.1rem
    padding .1rem .2rem 0
    margin-bottom .1rem
    border-radius .1rem .1rem 0 0 
    .card-top
        display flex
        width 100%
        padding-top .1rem
        padding-bottom .2rem
        line-height .48rem
        .card-score
            position relative
            flex 1
            .card-score-t
                font-size .28rem
                line-height .44rem
                color #ff8300
                .score-num
                    font-size .44rem
            .card-score-b
                .icon-jiantouyou::before
                    right .2rem
        .card-introduce
            flex 1
            padding-left .2rem
.address
    position relative
    font-size .32rem
    padding-top .1rem
    i 
        margin-right .1rem
        font-size .38rem
    .icon-jiantouyou::before
        top .2rem
        color #9e9e9e
        font-size .28rem
</style>