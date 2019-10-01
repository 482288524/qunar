// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'

//build 下 webpack.base.conf文件中配置style替代路径src/assets/style 第30行
import 'style/reset.css'
import 'style/border.css'
import 'style/iconfont.css'
import App from './App'
import router from './router'
import store from './store'
import VueAwesomeSwiper from 'vue-awesome-swiper'
import 'swiper/dist/css/swiper.css'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

//使用轮播图插件
Vue.use(VueAwesomeSwiper)
Vue.config.productionTip = false
Vue.use(ElementUI);

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
})
