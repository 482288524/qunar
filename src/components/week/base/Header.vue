<template>
    <div class="header">
        <router-link to="/" tag="i" class="iconfont icon-fanhui header-back"></router-link>
        <h4>{{title}}</h4>
    </div>
</template>

<script>
export default {
        name:'WeekHeader',
        data() {
            return {
                title:''
            }
        },
        activated(){
            this.title = this.$store.state.week
        }
    }
</script>

<style lang='stylus' scoped>
.header
    position relative
    line-height .86rem
    background-color #00bcd4
    text-align center
    color #fff
    .header-back
        position absolute
        top 0
        left 0
        width .8rem
    h4 
        text-align center
        font-size .32rem
</style>