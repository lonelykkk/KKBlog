import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

/* Layout */
import Layout from '@/layout'

/**
 * Note: sub-menu only appear when route children.length >= 1
 * Detail see: https://panjiachen.github.io/vue-element-admin-site/guide/essentials/router-and-nav.html
 *
 * hidden: true                   if set true, item will not show in the sidebar(default is false)
 * alwaysShow: true               if set true, will always show the root menu
 *                                if not set alwaysShow, when item has more than one children route,
 *                                it will becomes nested mode, otherwise not show the root menu
 * redirect: noRedirect           if set noRedirect will no redirect in the breadcrumb
 * name:'router-name'             the name is used by <keep-alive> (must set!!!)
 * meta : {
    roles: ['admin','editor']    control the page roles (you can set multiple roles)
    title: 'title'               the name show in sidebar and breadcrumb (recommend set)
    icon: 'svg-name'/'el-icon-x' the icon show in the sidebar
    breadcrumb: false            if set false, the item will hidden in breadcrumb(default is true)
    activeMenu: '/example/list'  if set path, the sidebar will highlight the path you set
  }
 */

/**
 * constantRoutes
 * a base page that does not have permission requirements
 * all roles can be accessed
 */
export const constantRoutes = [
  {
    path: '/login',
    component: () => import('@/views/login/index'),
    hidden: true
  },
  {
    path: '/',
    component: Layout,
    redirect: '/dashboard',
    children: [{
      path: 'dashboard',
      name: 'Dashboard',
      component: () => import('@/views/dashboard/index'),
      meta: { title: '首页', icon: 'dashboard' }
    }]
  },
  {
    path: '/write',
    component: Layout,
    children: [{
      path: '/',
      name: 'Write',
      component: () => import('@/views/content/article/write/index'),
      hidden: true
    }]
  },
  {
    path: '/system/user',
    component: Layout,
    children: [{
      path: '/',
      name: 'User',
      component: () => import('@/views/system/user'),
      hidden: true
    }]
  },
  {
    path: '/system/role',
    component: Layout,
    children: [{
      path: '/',
      name: 'role',
      component: () => import('@/views/system/role'),
      hidden: true
    }]
  },
  {
    path: '/system/menu',
    component: Layout,
    children: [{
      path: '/',
      name: 'menu',
      component: () => import('@/views/system/menu'),
      hidden: true
    }]
  },
  {
    path: '/system/role',
    component: Layout,
    children: [{
      path: '/',
      name: 'role',
      component: () => import('@/views/system/role'),
      hidden: true
    }]
  },
  {
    path: '/content/article',
    component: Layout,
    children: [{
      path: '/',
      name: 'article',
      component: () => import('@/views/content/article/index'),
      hidden: true
    }]
  },
  {
    path: '/content/category',
    component: Layout,
    children: [{
      path: '/',
      name: 'category',
      component: () => import('@/views/content/category/index'),
      hidden: true
    }]
  },
  {
    path: '/content/link',
    component: Layout,
    children: [{
      path: '/',
      name: 'link',
      component: () => import('@/views/content/link/index'),
      hidden: true
    }]
  },
  {
    path: '/content/tag',
    component: Layout,
    children: [{
      path: '/',
      name: 'tag',
      component: () => import('@/views/content/tag/index'),
      hidden: true
    }]
  }
]

const createRouter = () => new Router({
  // mode: 'history', // require service support
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
})

const router = createRouter()

// Detail see: https://github.com/vuejs/vue-router/issues/1234#issuecomment-357941465
export function resetRouter() {
  const newRouter = createRouter()
  router.matcher = newRouter.matcher // reset router
}

export default router
