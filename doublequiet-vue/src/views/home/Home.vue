<template>
  <div>
    <el-container style="height: 100%">
      <el-header style="border-bottom: 1px solid #ccc;">
        <el-col :span="4">title</el-col>
        <el-col :span="16">
          <el-menu default-active="1" class="el-menu-demo" mode="horizontal">
            <el-menu-item index="1">处理中心</el-menu-item>
            <el-submenu index="2">
              <template slot="title">我的工作台</template>
              <el-menu-item index="2-1">选项1</el-menu-item>
              <el-menu-item index="2-2">选项2</el-menu-item>
              <el-menu-item index="2-3">选项3</el-menu-item>
              <el-submenu index="2-4">
                <template slot="title">选项4</template>
                <el-menu-item index="2-4-1">选项1</el-menu-item>
                <el-menu-item index="2-4-2">选项2</el-menu-item>
                <el-menu-item index="2-4-3">选项3</el-menu-item>
              </el-submenu>
            </el-submenu>
          </el-menu>
        </el-col>
        <el-col :span="4">
          <el-link type="primary" :underline="false">登录</el-link>
          <el-divider direction="vertical"/>
          <el-link type="primary" :underline="false">注册</el-link>
        </el-col>
      </el-header>
      <div class="line"></div>
      <el-main :style="height">
        <HomeImage></HomeImage>
      </el-main>
      <el-footer>
        <el-row>
          <el-link type="primary" href="http://localhost:81" target="_blank" :underline="false">联系我们</el-link>
          <el-divider direction="vertical"/>
          <el-link type="primary" href="http://localhost:81" target="_blank" :underline="false">项目简介</el-link>
          <el-divider direction="vertical"/>
          <el-link type="primary" href="http://localhost:81" target="_blank" :underline="false">DoubleQuiet</el-link>
        </el-row>
        <el-row>
          2020-03-26
        </el-row>
      </el-footer>
    </el-container>


  </div>
</template>
<script>
  import HomeImage from "@/views/home/HomeImage"

  export default {
    components: {HomeImage},
    name: "Home",
    props: {},
    watch: {
      // 'window.innerHeight': {
      //   handler(value) {
      //     console.log("测试事件");
      //   },
      //   immediate: true,
      //   deep:true,
      // }
    },
    data() {
      return {
        height: {
          height: window.innerHeight - 160 + 'px',//header 60，footer 60+20，main padding 20
        }
      }
    },
    methods: {
      click() {
        console.log("测试事件")
      }
    },
    created() {
    }
  }
</script>
<style scoped>
  .el-header .el-col {
    line-height: 60px;
  }

  .el-footer {
    margin-bottom: 20px;
  }

  .el-footer .el-row {
    height: 30px;
    line-height: 30px;
  }
</style>
