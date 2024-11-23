<template>
  <div class="dashboard-container">
    <div class="dashboard-text">
      随心博客管理系统
    </div>
    <div>
      github地址：<a href="https://github.com/lonelykkk">https://github.com/lonelykkk</a>   lonelykkk
    </div>
    <div>
      随心博客，没事就来写篇博客吧
    </div>
  </div>
</template>

<script>
import { mapGetters } from 'vuex'
export default {
  name: 'Dashboard',
  computed: {
    ...mapGetters([
      'name'
    ])
  }
}
</script>

<style lang="scss" scoped>
.dashboard {
  &-container {
    margin: 30px;
  }
  &-text {
    font-size: 30px;
    line-height: 46px;
  }
}
</style>
