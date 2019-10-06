<template>
    <div class="comment">
        <h3 class="border-bottom">用户评论</h3>
        <div class="comment-center" v-for="comment in commentInfo">
            <span class="comment-desc">{{comment.desc}}</span>
            <div class="comment-imgs" @click="handleClick(comment)">
                <img :src="item" v-if="index<6" v-for="(item,index) in comment.imgs">
                <span class="img-num" v-if="comment.imgs.length>6">共{{comment.imgs.length}}张</span>
            </div>
            <fade-animation>
                <common-gallary 
                    v-show="comment.isShow" 
                    @close="handleClose(comment)" 
                    :gallaryImgs="comment.imgs">
                </common-gallary>
            </fade-animation>
        </div>
    </div>
</template>

<script>
import CommonGallary from '@/common/Gallary'
import FadeAnimation from '@/common/FadeAnimation'
export default {
    name:'DetailComment',
    props:['commentInfo'],
        data() {
            return {
            }
        },
        components:{
            CommonGallary,
            FadeAnimation
        },
        methods:{
            handleClick(comment){
                comment.isShow = true
            },
            handleClose(comment){
                comment.isShow = false
            }
        }
    }
</script>

<style lang='stylus' scoped>
.border-bottom::before 
    border-color #bbb
.comment
    h3 
        line-height .88rem
        font-size .36rem
        padding-left .2rem
    .comment-center
        padding .1rem .2rem .3rem
        .comment-desc
            line-height .42rem
            color #616161
            font-size .26rem
        .comment-imgs
            position relative
            overflow hidden
            padding .2rem 0 .1rem
            width 100%
            img 
                float left
                width 32%
                margin 0 .1rem .1rem 0
            .img-num
                position absolute
                color #fff
                right .3rem
                top 3.5rem
                font-size .26rem
</style>