<template>
    <div>
        <h3 class="week-title">周末去哪儿</h3>
        <ul class="week-list">
            <router-link 
                tag="li" 
                :to="{name:'weeklink',params:{id:week.id}}"
                class="week-item border-bottom" 
                v-for="(week,index) in weekendList" 
                @click.native="handleClick(index)"
                :key="week.id">
                <img class="week-img" :src="week.imgUrl" alt="" />
                <div class="week-info">
                    <h4>{{week.title}}</h4>
                    <div class="week-desc">{{week.desc}}</div>
                </div>
            </router-link>
        </ul>
    </div>
</template>

<script>
export default {
    name: "HomeWeekend",
    props: ["weekendList"],
    data() {
        return {};
    },
    methods:{
        handleClick(index){
            this.$store.commit('weekChange',this.weekendList[index].title)
        }
    }
};
</script>

<style lang='stylus' scoped>
.week-title
    padding-left .26rem
    height .8rem
    line-height .8rem
    color #212121
.week-list
    .week-img
        width 100%
    .week-info
        padding .14rem 1.6rem .2rem .2rem
        h4
            font-size .28rem
            line-height .48rem
            color #212121
        .week-desc
            font-size .24rem
            line-height .42rem
            color #616161
            white-space nowrap
            overflow hidden
            text-overflow ellipsis
</style>