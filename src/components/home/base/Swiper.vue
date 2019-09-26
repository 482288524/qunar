<template>
    <div class="swiper">
        <swiper :options="swiperOption" v-if="isShow">
            <!-- slides -->
            <swiper-slide v-for="(img,index) in swiperList" :key="index">
                <img class="swiper-img" :src="img.imgUrl" alt="">
            </swiper-slide>
            <!-- Optional controls -->
            <div class="swiper-pagination" slot="pagination"></div>
        </swiper>
    </div>
</template>

<script>
export default {
    name: "HomeSwiper",
    props:['swiperList'],
    data() {
        return {
            swiperOption:{
                pagination:{
                    el: '.swiper-pagination'
                },
                loop:true,
                autoplay:true,
            },
        };
    },
    computed:{
        isShow(){
            return this.swiperList.length > 0
        }
    }
};
</script>

<style lang="stylus" scoped>
.swiper >>> .swiper-container
    height 100%
.swiper >>> .swiper-pagination-bullet-active
    background-color #fff
.swiper
    height 2.18rem
    .swiper-img
        width 100%
</style>