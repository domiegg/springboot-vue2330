import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import fuzhuangkuanshiList from '../pages/fuzhuangkuanshi/list'
import fuzhuangkuanshiDetail from '../pages/fuzhuangkuanshi/detail'
import fuzhuangkuanshiAdd from '../pages/fuzhuangkuanshi/add'
import mianliaoleibieList from '../pages/mianliaoleibie/list'
import mianliaoleibieDetail from '../pages/mianliaoleibie/detail'
import mianliaoleibieAdd from '../pages/mianliaoleibie/add'
import remaixifuList from '../pages/remaixifu/list'
import remaixifuDetail from '../pages/remaixifu/detail'
import remaixifuAdd from '../pages/remaixifu/add'
import fuzhuangyuyueList from '../pages/fuzhuangyuyue/list'
import fuzhuangyuyueDetail from '../pages/fuzhuangyuyue/detail'
import fuzhuangyuyueAdd from '../pages/fuzhuangyuyue/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'fuzhuangkuanshi',
					component: fuzhuangkuanshiList
				},
				{
					path: 'fuzhuangkuanshiDetail',
					component: fuzhuangkuanshiDetail
				},
				{
					path: 'fuzhuangkuanshiAdd',
					component: fuzhuangkuanshiAdd
				},
				{
					path: 'mianliaoleibie',
					component: mianliaoleibieList
				},
				{
					path: 'mianliaoleibieDetail',
					component: mianliaoleibieDetail
				},
				{
					path: 'mianliaoleibieAdd',
					component: mianliaoleibieAdd
				},
				{
					path: 'remaixifu',
					component: remaixifuList
				},
				{
					path: 'remaixifuDetail',
					component: remaixifuDetail
				},
				{
					path: 'remaixifuAdd',
					component: remaixifuAdd
				},
				{
					path: 'fuzhuangyuyue',
					component: fuzhuangyuyueList
				},
				{
					path: 'fuzhuangyuyueDetail',
					component: fuzhuangyuyueDetail
				},
				{
					path: 'fuzhuangyuyueAdd',
					component: fuzhuangyuyueAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
