<template>
    <div class="header">
        <i class="iconfont icon-fanhui header-back"></i>
        <div class="header-input">
            <i class="iconfont icon-sousuo"></i>
            <input type="text" placeholder="输入城市/景点/游玩主题" />
        </div>
        <router-link to="/city" tag="div"class="header-right">
            <span>{{$store.state.city}}</span>
            <i class="iconfont icon-jiantou"></i>
        </router-link>
    </div>
</template>

<script>
export default {
    name: "HomeHeader",
    data() {
        return {};
    }
};
</script>

<style lang="stylus" scoped>
.header 
    display flex
    height .88rem
    background-color #00bcd4
    line-height .88rem
    color #fff
    .header-back
        width .88rem
        text-align center
    .header-input
        flex 1
        padding-left .14rem
        margin-top .12rem
        line-height .64rem
        height .64rem
        background-color #fff
        border-radius .1rem
        .icon-sousuo
            color #ccc
            vertical-align middle
        input
            vertical-align middle
            font-size .26rem
    .header-right
        padding 0 .12rem
        span
            font-size .26rem
        .icon-jiantou
            font-size .24rem
</style>