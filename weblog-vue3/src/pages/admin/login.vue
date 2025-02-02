<template>
  <div class="grid grid-cols-2 h-screen">
    <div class="col-span-2 order-2 p-10 md:col-span-1 md:order-1 bg-slate-900">
    <!-- 指定为 flex 布局，并设置为屏幕垂直水平居中，高度为 100% -->
        <div class="flex justify-center items-center h-full flex-col animate__animated animate__bounceInLeft animate__fast">
            <h2 class="font-bold text-4xl mb-7 text-white">Weblog 博客登录</h2>
            <p class="text-white">一款由 Spring Boot + Mybaits Plus + Vue 3.2 + Vite 4 开发的前后端分离博客。</p>
            <!-- 指定图片宽度为父级元素的 1/2 -->
            <img src="@/assets/developer.png" class="w-1/2">
        </div>
    </div>
      <div class="col-span-2 order-1 md:col-span-1 md:order-2 bg-white">
        <div class="flex justify-center items-center h-full flex-col animate__animated animate__bounceInRight animate__fast">
                <h1 class="font-bold text-4xl mb-5">欢迎回来</h1>
                <div class="flex items-center justify-center mb-7 text-gray-400 space-x-2">
                    <!-- 左边横线，高度为 1px, 宽度为 16，背景色设置 -->
                    <span class="h-[1px] w-16 bg-gray-200"></span>
                    <span>账号密码登录</span>
                    <!-- 右边横线 -->
                    <span class="h-[1px] w-16 bg-gray-200"></span>
                </div>
                <!-- 引入 Element Plus 表单组件，移动端设置宽度为 5/6，PC 端设置为 2/5 -->
                <el-form class="w-5/6 md:w-2/5" ref="formRef" :rules="rules" :model="form">
                    <el-form-item prop="username">
                        <!-- 输入框组件 -->
                        <el-input size="large" v-model="form.username" placeholder="请输入用户名" :prefix-icon="User" clearable />
                    </el-form-item>
                    <el-form-item prop="password">
                        <!-- 密码框组件 -->
                        <el-input size="large" type="password" v-model="form.password" placeholder="请输入密码"
                            :prefix-icon="Lock" clearable show-password />
                    </el-form-item>
                    <el-form-item>
                        <!-- 登录按钮，宽度设置为 100% -->
                        <el-button class="w-full mt-2" size="large" :loading="loading" type="primary" @click="onSubmit">登录</el-button>
                    </el-form-item>
                </el-form>
            </div>
      </div>
  </div>
</template>
<script setup>
// 引入 Element Plus 中的用户、锁图标
import { User, Lock } from '@element-plus/icons-vue'
import { login } from '@/api/admin/user'
import { ref,reactive,onMounted, onBeforeUnmount  } from 'vue' 
import { useRouter } from 'vue-router';
import { showMessage} from '@/composables/util'
import { useUserStore } from '@/stores/user'
import { setToken } from '@/composables/cookie'
const router = useRouter()
const formRef = ref(null)
const loading = ref(false)
const userStore = useUserStore()
const rules = {
    username: [
        {
            required: true,
            message: '用户名不能为空',
            trigger: 'blur'
        }
    ],
    password: [
        {
            required: true,
            message: '密码不能为空',
            trigger: 'blur',
        },
    ]
}
const form = reactive({
    username: '',
    password: ''
})

function onKeyUp(e) {
    console.log(e)
    if (e.key == 'Enter') {
        onSubmit()
    }
}
onMounted(() => {
    console.log('添加键盘监听')
    document.addEventListener('keyup', onKeyUp)
})
onBeforeUnmount(() => {
    document.removeEventListener('keyup', onKeyUp)
})
// 登录
const onSubmit = () => {
    console.log('登录')
    formRef.value.validate((valid) => {
        loading.value = true
        if (!valid) {
            console.log('表单验证不通过')
            return false
        }

        // 调用登录接口
        login(form.username, form.password).then((res) => {
            console.log(res)
            // 判断是否成功
            if (res.success == true) {
                showMessage('登录成功')
                let token = res.data.token
                setToken(token)
                userStore.setUserInfo()
                // 跳转到后台首页
                router.push('/admin/index')
            }else {
                // 获取服务端返回的错误消息
                let message = res.message
                // 提示消息
                showMessage(message, 'error')
            }
        }).finally(() => {
            // 结束加载
            loading.value = false
        })
    })
}

</script>

