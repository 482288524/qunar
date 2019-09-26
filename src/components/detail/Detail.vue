<template>
   <div class="detail">
        <detail-banner :bannerImg="bannerImg"
                       :sightName="sightName"
                       :gallaryImgs="gallaryImgs"></detail-banner>
        <detail-header></detail-header>
   </div>
</template>

<script>
import {getDetails} from '@/api'
import DetailBanner from './base/Banner'
import DetailHeader from './base/Header'
    export default {
        name:'Detail',
        data() {
            return {
                bannerImg:'',
                sightName:'',
                gallaryImgs:[]
            }
        },
        components:{
            DetailBanner,
            DetailHeader
        },
        created(){
            this.getData()
        },
        methods:{
            async getData(){
                let {bannerImg,sightName,gallaryImgs} = await getDetails(this.$route.params.id)
                this.bannerImg = bannerImg
                this.sightName = sightName
                this.gallaryImgs = gallaryImgs
                // console.log(await getDetails(this.$route.params.id))
            }
        }
    }
</script>

<style lang='stylus' scoped>
.detail 
    height 2000px
</style>