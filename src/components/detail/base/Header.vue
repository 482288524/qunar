<template>
    <div class="header">
        <router-link 
            to="/"
            tag="i" 
            class="header-back iconfont icon-fanhui"
            v-show="isShow">
        </router-link>
        <!-- <h3 @click="handleScroll">点我触发</h3> -->
        <div class="header-fixed" v-show="!isShow" :style="styleObj">
            <router-link 
                class="header-goback iconfont icon-fanhui"
                tag="i"
                to="/">
            </router-link>
            <h2 class="msg">景点详情</h2>
        </div>
    </div>
</template>

<script>
    export default {
        name:'DetailHeader',
        data() {
            return {
                isShow:true,
                styleObj:{}
            }
        },
        methods:{
            // 监听滚动事件
            handleScroll(){
                let scrollTop = document.documentElement.scrollTop

                // header-fixed隐藏或显示
                if(scrollTop > 50){
                    this.isShow = false
                }else{
                    this.isShow =  true
                }
                this.styleObj = {opacity:(scrollTop-50)/100}
            }
        },
        activated(){
            window.addEventListener('scroll',this.handleScroll)
        },
        deactivated(){
            window.removeEventListener('scroll',this.handleScroll)
        }
    }
</script>

<style lang='stylus' scoped>
.header
    position fixed 
    top 0
    left 0
    right 0
    z-index 1
    .header-back 
        position absolute
        top .08rem
        left .08rem
        width .72rem
        line-height .72rem
        text-align center
        color #fff
        font-size .36rem
        font-weight bold
        border-radius 50%
        background rgba(0,0,0,.6)
    .header-fixed
        position:relative
        width 100%
        line-height .88rem
        text-align center
        background #00bcd4
        .header-goback
            position absolute
            top 0
            left 0
            width .88rem
            color #fff
            font-size .36rem
            font-weight bold
        .msg
            margin 0 1rem
            font-size .32rem
            color #fff
</style>