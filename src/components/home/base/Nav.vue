<template>
<div class="homenav">
    <swiper :options="swiperOption">
            <!-- slides -->
            <swiper-slide v-for="(page,index) in filterItem" :key="index">
                <div class="nav">
                    <div class="item" v-for="item in page" :key="item.id">
                        <img class="item-img" :src="item.imgUrl" alt="">
                        <span class="item-desc">{{item.desc}}</span>
                    </div>
                </div>
            </swiper-slide>
            <!-- Optional controls -->
            <div class="swiper-pagination" slot="pagination"></div>
    </swiper>
</div>
</template>

<script>
    export default {
        name:'HomeNav',
        props:['itemList'],
        data() {
            return {
                swiperOption:{
                    pagination:{
                        el: '.swiper-pagination'
                    }
                },
            }
        },
        computed:{
            filterItem(){
                let items = []
                this.itemList.forEach((item,index)=>{
                    let page = ~~(index / 8)

                    if(!items[page]){
                        items[page] = []
                    }

                    items[page].push(item)
                })
                return items
            }
        }
    }
</script>

<style lang='stylus' scoped>
.homenav >>> .swiper-slide
    margin-bottom .44rem
.homenav
    height 3.8rem
    .nav
        display flex
        flex-wrap wrap
        height 100%
        .item
            display flex
            flex-direction column
            align-items center
            width 25%
            height 45%
            .item-img
                width 1.1rem
                height 1.1rem
                margin .2rem 0 .1rem 0
</style>