<template>
   <div class="search">
       <input type="text" 
        class="search-input" 
        placeholder="请输入城市名或拼音"
        v-model="keyword" />
       <div class="search-content" v-show="keyword" ref="wrapper">
           <ul>
               <li class="search-item border-bottom" 
               v-for="city in filterCities"
               :key="city.id"
               @click="selectCity(city.name)">{{city.name}}</li>
               <li class="search-item border-bottom" v-if="isShow">未搜索到相应地点</li>
           </ul>
       </div>
   </div>
</template>

<script>
import BScroll from 'better-scroll'
    export default {
        name:'CitySearch',
        props:['cities'],
        data() {
            return {
                keyword:''
            }
        },
        computed:{
            filterCities(){
                let result = []
                for(let key in this.cities){
                    this.cities[key].forEach(city => {
                        if(city.name.includes(this.keyword)||city.spell.includes(this.keyword)){
                            result.push(city)
                        }
                    });
                }
                return result
            },
            isShow(){
                return !this.filterCities.length
            }
        },
        mounted(){
            this.scroll = new BScroll(this.$refs.wrapper,{
                click:true
            })
        },
        methods:{
            selectCity(city){
                this.$store.commit('cityChange',city)
                this.$router.push('/')
            }
        }
    }
</script>

<style lang='stylus' scoped>
.search
    position relative
    height .72rem
    padding .1rem
    background-color #00bcd4
    .search-input
        width 100%
        height 100%
        text-align center
        border-radius .1rem
    .search-content
        position fixed
        overflow hidden
        z-index 10
        top 1.78rem
        left 0
        right 0
        bottom 0
        background-color #ccc
        .search-item
            padding-left .3rem
            line-height .7rem
            background-color #fff
</style>