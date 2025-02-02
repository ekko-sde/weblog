<script setup>

</script>

<template>
   <el-config-provider :locale="locale">
      <router-view></router-view>
   </el-config-provider>
</template>

<style scoped>
  #nprogress .bar {
   background: #409eff!important;
}

</style>

<script setup>
import zhCn from 'element-plus/dist/locale/zh-cn.mjs'
const locale = zhCn
</script>
