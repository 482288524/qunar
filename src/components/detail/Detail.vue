<template>
   <div class="detail">
        <detail-banner :bannerImg="bannerImg"
                       :sightName="sightName"
                       :gallaryImgs="gallaryImgs"></detail-banner>
        <detail-header></detail-header>
        <detail-card :cardInfo="cardInfo"></detail-card>
        <detail-recommend :recommendInfo="recommendInfo">
            <div class="border-bottom title-solt">
                <i class="el-icon-s-promotion"></i>
                <span class="det-rec-title">去哪儿推荐</span>
            </div>
        </detail-recommend>
        <detail-calendar :calendarInfo="calendarInfo"></detail-calendar>
        <detail-comment :commentInfo="commentInfo"></detail-comment>
   </div>
</template>

<script>
import {getDetails} from '@/api'
import DetailBanner from './base/Banner'
import DetailHeader from './base/Header'
import DetailCard from './base/Card'
import DetailRecommend from './base/Recommend'
import DetailCalendar from './base/Calendar'
import DetailComment from './base/Comment'
    export default {
        name:'Detail',
        data() {
            return {
                bannerImg:'',
                sightName:'',
                gallaryImgs:[],
                cardInfo:{},
                recommendInfo:[],
                calendarInfo:[],
                commentInfo:[]
            }
        },
        components:{
            DetailBanner,
            DetailHeader,
            DetailCard,
            DetailRecommend,
            DetailCalendar,
            DetailComment
        },
        activated(){
            this.getData()
        },
        methods:{
            async getData(){
                let {bannerImg,sightName,gallaryImgs,cardInfo,recommendInfo,calendarInfo,commentInfo} = await getDetails(this.$route.params.id)
                this.bannerImg = bannerImg
                this.sightName = sightName
                this.gallaryImgs = gallaryImgs
                this.cardInfo = cardInfo
                this.recommendInfo = recommendInfo
                this.calendarInfo = calendarInfo
                this.commentInfo = commentInfo
                // console.log(await getDetails(this.$route.params.id))
            }
        }
    }
</script>

<style lang='stylus' scoped>
.border-bottom::before
    border-color #bbb
.detail 
    height 1900px
    .title-solt
        .det-rec-title
            font-size .36rem
            line-height .88rem
</style>