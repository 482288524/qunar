<template>
   <div class="alphabet">
       <ul>
           <li v-for="(city,key) in cities" :key="city.id"
            @click="handleClick(key)">{{key}}</li>
       </ul>
   </div>
</template>

<script>
    export default {
        name:'CityAlphabet',
        props:['cities'],
        data() {
            return {
            }
        },
        methods:{
            handleClick(letter){
                this.$store.commit('letterChange',letter)
            }
        }
    }
</script>

<style lang='stylus' scoped>
.alphabet
    position fixed
    display flex
    flex-direction column
    justify-content center
    top 0
    right 0
    bottom 0
    li
        line-height .5rem
        text-align center
        font-weight 600
        color red
</style>