import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import chat from '@/views/modules/chat/list'
    import dictionary from '@/views/modules/dictionary/list'
    import fangjian from '@/views/modules/fangjian/list'
    import fangjianCollection from '@/views/modules/fangjianCollection/list'
    import fangjianCommentback from '@/views/modules/fangjianCommentback/list'
    import fangjianOrder from '@/views/modules/fangjianOrder/list'
    import gonggao from '@/views/modules/gonggao/list'
    import jingdian from '@/views/modules/jingdian/list'
    import jingdianCollection from '@/views/modules/jingdianCollection/list'
    import jingdianCommentback from '@/views/modules/jingdianCommentback/list'
    import jingdianOrder from '@/views/modules/jingdianOrder/list'
    import liuyan from '@/views/modules/liuyan/list'
    import lvyoutuan from '@/views/modules/lvyoutuan/list'
    import lvyoutuanCollection from '@/views/modules/lvyoutuanCollection/list'
    import lvyoutuanLiuyan from '@/views/modules/lvyoutuanLiuyan/list'
    import lvyoutuanOrder from '@/views/modules/lvyoutuanOrder/list'
    import yonghu from '@/views/modules/yonghu/list'
    import youwanluxian from '@/views/modules/youwanluxian/list'
    import youwanluxianCollection from '@/views/modules/youwanluxianCollection/list'
    import youwanluxianLiuyan from '@/views/modules/youwanluxianLiuyan/list'
    import config from '@/views/modules/config/list'
    import dictionaryChat from '@/views/modules/dictionaryChat/list'
    import dictionaryFangjian from '@/views/modules/dictionaryFangjian/list'
    import dictionaryFangjianCollection from '@/views/modules/dictionaryFangjianCollection/list'
    import dictionaryFangjianOrder from '@/views/modules/dictionaryFangjianOrder/list'
    import dictionaryFangjianOrderPayment from '@/views/modules/dictionaryFangjianOrderPayment/list'
    import dictionaryGonggao from '@/views/modules/dictionaryGonggao/list'
    import dictionaryJingdian from '@/views/modules/dictionaryJingdian/list'
    import dictionaryJingdianCollection from '@/views/modules/dictionaryJingdianCollection/list'
    import dictionaryJingdianOrder from '@/views/modules/dictionaryJingdianOrder/list'
    import dictionaryJingdianOrderPayment from '@/views/modules/dictionaryJingdianOrderPayment/list'
    import dictionaryLvyoutuan from '@/views/modules/dictionaryLvyoutuan/list'
    import dictionaryLvyoutuanCollection from '@/views/modules/dictionaryLvyoutuanCollection/list'
    import dictionaryLvyoutuanOrderYesno from '@/views/modules/dictionaryLvyoutuanOrderYesno/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'
    import dictionaryYouwanluxianChufashijian from '@/views/modules/dictionaryYouwanluxianChufashijian/list'
    import dictionaryYouwanluxianChuxingfangshi from '@/views/modules/dictionaryYouwanluxianChuxingfangshi/list'
    import dictionaryYouwanluxianCollection from '@/views/modules/dictionaryYouwanluxianCollection/list'
    import dictionaryYouwanluxianLvyoufangshi from '@/views/modules/dictionaryYouwanluxianLvyoufangshi/list'
    import dictionaryZhuangtai from '@/views/modules/dictionaryZhuangtai/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryChat',
        name: '数据类型',
        component: dictionaryChat
    }
    ,{
        path: '/dictionaryFangjian',
        name: '房间类型',
        component: dictionaryFangjian
    }
    ,{
        path: '/dictionaryFangjianCollection',
        name: '收藏表类型',
        component: dictionaryFangjianCollection
    }
    ,{
        path: '/dictionaryFangjianOrder',
        name: '订单类型',
        component: dictionaryFangjianOrder
    }
    ,{
        path: '/dictionaryFangjianOrderPayment',
        name: '订单支付类型',
        component: dictionaryFangjianOrderPayment
    }
    ,{
        path: '/dictionaryGonggao',
        name: '公告类型',
        component: dictionaryGonggao
    }
    ,{
        path: '/dictionaryJingdian',
        name: '景点类型',
        component: dictionaryJingdian
    }
    ,{
        path: '/dictionaryJingdianCollection',
        name: '收藏表类型',
        component: dictionaryJingdianCollection
    }
    ,{
        path: '/dictionaryJingdianOrder',
        name: '订单类型',
        component: dictionaryJingdianOrder
    }
    ,{
        path: '/dictionaryJingdianOrderPayment',
        name: '订单支付类型',
        component: dictionaryJingdianOrderPayment
    }
    ,{
        path: '/dictionaryLvyoutuan',
        name: '旅游团类型',
        component: dictionaryLvyoutuan
    }
    ,{
        path: '/dictionaryLvyoutuanCollection',
        name: '收藏表类型',
        component: dictionaryLvyoutuanCollection
    }
    ,{
        path: '/dictionaryLvyoutuanOrderYesno',
        name: '订单类型',
        component: dictionaryLvyoutuanOrderYesno
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/dictionaryYouwanluxianChufashijian',
        name: '出发时间',
        component: dictionaryYouwanluxianChufashijian
    }
    ,{
        path: '/dictionaryYouwanluxianChuxingfangshi',
        name: '出行方式',
        component: dictionaryYouwanluxianChuxingfangshi
    }
    ,{
        path: '/dictionaryYouwanluxianCollection',
        name: '收藏表类型',
        component: dictionaryYouwanluxianCollection
    }
    ,{
        path: '/dictionaryYouwanluxianLvyoufangshi',
        name: '旅游方式',
        component: dictionaryYouwanluxianLvyoufangshi
    }
    ,{
        path: '/dictionaryZhuangtai',
        name: '状态',
        component: dictionaryZhuangtai
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/chat',
        name: '客服聊天',
        component: chat
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/fangjian',
        name: '房间',
        component: fangjian
      }
    ,{
        path: '/fangjianCollection',
        name: '房间收藏',
        component: fangjianCollection
      }
    ,{
        path: '/fangjianCommentback',
        name: '房间评价',
        component: fangjianCommentback
      }
    ,{
        path: '/fangjianOrder',
        name: '房间订单',
        component: fangjianOrder
      }
    ,{
        path: '/gonggao',
        name: '公告',
        component: gonggao
      }
    ,{
        path: '/jingdian',
        name: '景点',
        component: jingdian
      }
    ,{
        path: '/jingdianCollection',
        name: '景点收藏',
        component: jingdianCollection
      }
    ,{
        path: '/jingdianCommentback',
        name: '景点评价',
        component: jingdianCommentback
      }
    ,{
        path: '/jingdianOrder',
        name: '景点订单',
        component: jingdianOrder
      }
    ,{
        path: '/liuyan',
        name: '留言板',
        component: liuyan
      }
    ,{
        path: '/lvyoutuan',
        name: '旅游团',
        component: lvyoutuan
      }
    ,{
        path: '/lvyoutuanCollection',
        name: '旅游团收藏',
        component: lvyoutuanCollection
      }
    ,{
        path: '/lvyoutuanLiuyan',
        name: '旅游团留言',
        component: lvyoutuanLiuyan
      }
    ,{
        path: '/lvyoutuanOrder',
        name: '旅游团拼团',
        component: lvyoutuanOrder
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/youwanluxian',
        name: '游玩路线',
        component: youwanluxian
      }
    ,{
        path: '/youwanluxianCollection',
        name: '游玩路线收藏',
        component: youwanluxianCollection
      }
    ,{
        path: '/youwanluxianLiuyan',
        name: '游玩路线留言',
        component: youwanluxianLiuyan
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
