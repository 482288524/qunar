<template>
   <div class="gallary" @click="handleClick">
       <div class="wrapper">
           <swiper :options="swiperOption">
                <!-- slides -->
                <swiper-slide v-for="(img,index) in gallaryImgs" :key="index">
                    <img class="swiper-img" :src="img" alt="">
                </swiper-slide>
                <!-- Optional controls -->
                <div class="swiper-pagination" slot="pagination"></div>
            </swiper>
       </div>
   </div>
</template>

<script>
    export default {
        name:'CommonGallary',
        props:['gallaryImgs'],
        data() {
            return {
                swiperOption:{
                    pagination:{
                        el: '.swiper-pagination',
                        type:'fraction'
                    },
                    loop:true,
                    observer:true,
                    observeParents:true,
                },
            }
        },
        methods:{
            handleClick(){
                this.$emit('close')
            }
        }
    }
</script>

<style lang='stylus' scoped>
.wrapper >>> .swiper-container
    overflow:inherit
.gallary
    position fixed
    z-index 10
    top 0 
    right 0
    bottom 0
    left 0
    background #000
    .wrapper
        position absolute
        top 0
        bottom 0
        height 0
        width 100%
        margin auto
        padding-bottom 62.5%
        background #fff
        .swiper-img
            width 100%
        .swiper-pagination
            bottom -1rem
            color #fff
</style>