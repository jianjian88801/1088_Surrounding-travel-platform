
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 旅游团拼团
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/lvyoutuanOrder")
public class LvyoutuanOrderController {
    private static final Logger logger = LoggerFactory.getLogger(LvyoutuanOrderController.class);

    @Autowired
    private LvyoutuanOrderService lvyoutuanOrderService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private LvyoutuanService lvyoutuanService;
    @Autowired
    private YonghuService yonghuService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = lvyoutuanOrderService.queryPage(params);

        //字典表数据转换
        List<LvyoutuanOrderView> list =(List<LvyoutuanOrderView>)page.getList();
        for(LvyoutuanOrderView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        LvyoutuanOrderEntity lvyoutuanOrder = lvyoutuanOrderService.selectById(id);
        if(lvyoutuanOrder !=null){
            //entity转view
            LvyoutuanOrderView view = new LvyoutuanOrderView();
            BeanUtils.copyProperties( lvyoutuanOrder , view );//把实体数据重构到view中

                //级联表
                LvyoutuanEntity lvyoutuan = lvyoutuanService.selectById(lvyoutuanOrder.getLvyoutuanId());
                if(lvyoutuan != null){
                    BeanUtils.copyProperties( lvyoutuan , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setLvyoutuanId(lvyoutuan.getId());
                    view.setLvyoutuanYonghuId(lvyoutuan.getYonghuId());
                }
                //级联表
                YonghuEntity yonghu = yonghuService.selectById(lvyoutuanOrder.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody LvyoutuanOrderEntity lvyoutuanOrder, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,lvyoutuanOrder:{}",this.getClass().getName(),lvyoutuanOrder.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            lvyoutuanOrder.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        lvyoutuanOrder.setInsertTime(new Date());
        lvyoutuanOrder.setCreateTime(new Date());
        lvyoutuanOrderService.insert(lvyoutuanOrder);
        return R.ok();
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody LvyoutuanOrderEntity lvyoutuanOrder, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,lvyoutuanOrder:{}",this.getClass().getName(),lvyoutuanOrder.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            lvyoutuanOrder.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<LvyoutuanOrderEntity> queryWrapper = new EntityWrapper<LvyoutuanOrderEntity>()
            .eq("id",0)
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LvyoutuanOrderEntity lvyoutuanOrderEntity = lvyoutuanOrderService.selectOne(queryWrapper);
        if(lvyoutuanOrderEntity==null){
            lvyoutuanOrderService.updateById(lvyoutuanOrder);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


    /**
    * 审核
    */
    @RequestMapping("/shenhe")
    public R shenhe(@RequestBody LvyoutuanOrderEntity lvyoutuanOrder, HttpServletRequest request){
        logger.debug("shenhe方法:,,Controller:{},,lvyoutuanOrder:{}",this.getClass().getName(),lvyoutuanOrder.toString());

        if(lvyoutuanOrder.getLvyoutuanOrderYesnoTypes() == 2){//通过
            LvyoutuanOrderEntity lvyoutuanOrderEntity = lvyoutuanOrderService.selectById(lvyoutuanOrder.getId());
            List<LvyoutuanOrderEntity> lvyoutuanOrderEntities = lvyoutuanOrderService.selectList(new EntityWrapper<LvyoutuanOrderEntity>()
                    .eq("lvyoutuan_id", lvyoutuanOrderEntity.getLvyoutuanId())
                    .eq("lvyoutuan_order_yesno_types", 2)
            );
            LvyoutuanEntity lvyoutuanEntity = lvyoutuanService.selectById(lvyoutuanOrderEntity.getLvyoutuanId());
            if(lvyoutuanEntity == null)
                return R.error("查不到旅游团");

            int i = lvyoutuanEntity.getLvyoutuanNumber() - lvyoutuanOrderEntities.size();
            if(i<1)
                return R.error("该团已经预约满了");
        }else if(lvyoutuanOrder.getLvyoutuanOrderYesnoTypes() == 3){//拒绝
        }
        lvyoutuanOrder.setLvyoutuanOrderShenheTime(new Date());//审核时间
        lvyoutuanOrderService.updateById(lvyoutuanOrder);//审核
        return R.ok();
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        lvyoutuanOrderService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<LvyoutuanOrderEntity> lvyoutuanOrderList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            LvyoutuanOrderEntity lvyoutuanOrderEntity = new LvyoutuanOrderEntity();
//                            lvyoutuanOrderEntity.setLvyoutuanOrderUuidNumber(data.get(0));                    //订单号 要改的
//                            lvyoutuanOrderEntity.setLvyoutuanId(Integer.valueOf(data.get(0)));   //旅游团 要改的
//                            lvyoutuanOrderEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            lvyoutuanOrderEntity.setInsertTime(date);//时间
//                            lvyoutuanOrderEntity.setLvyoutuanOrderYesnoTypes(Integer.valueOf(data.get(0)));   //报名状态 要改的
//                            lvyoutuanOrderEntity.setLvyoutuanOrderYesnoText(data.get(0));                    //审核意见 要改的
//                            lvyoutuanOrderEntity.setLvyoutuanOrderShenheTime(sdf.parse(data.get(0)));          //审核时间 要改的
//                            lvyoutuanOrderEntity.setCreateTime(date);//时间
                            lvyoutuanOrderList.add(lvyoutuanOrderEntity);


                            //把要查询是否重复的字段放入map中
                                //订单号
                                if(seachFields.containsKey("lvyoutuanOrderUuidNumber")){
                                    List<String> lvyoutuanOrderUuidNumber = seachFields.get("lvyoutuanOrderUuidNumber");
                                    lvyoutuanOrderUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> lvyoutuanOrderUuidNumber = new ArrayList<>();
                                    lvyoutuanOrderUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("lvyoutuanOrderUuidNumber",lvyoutuanOrderUuidNumber);
                                }
                        }

                        //查询是否重复
                         //订单号
                        List<LvyoutuanOrderEntity> lvyoutuanOrderEntities_lvyoutuanOrderUuidNumber = lvyoutuanOrderService.selectList(new EntityWrapper<LvyoutuanOrderEntity>().in("lvyoutuan_order_uuid_number", seachFields.get("lvyoutuanOrderUuidNumber")));
                        if(lvyoutuanOrderEntities_lvyoutuanOrderUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(LvyoutuanOrderEntity s:lvyoutuanOrderEntities_lvyoutuanOrderUuidNumber){
                                repeatFields.add(s.getLvyoutuanOrderUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [订单号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        lvyoutuanOrderService.insertBatch(lvyoutuanOrderList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = lvyoutuanOrderService.queryPage(params);

        //字典表数据转换
        List<LvyoutuanOrderView> list =(List<LvyoutuanOrderView>)page.getList();
        for(LvyoutuanOrderView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        LvyoutuanOrderEntity lvyoutuanOrder = lvyoutuanOrderService.selectById(id);
            if(lvyoutuanOrder !=null){


                //entity转view
                LvyoutuanOrderView view = new LvyoutuanOrderView();
                BeanUtils.copyProperties( lvyoutuanOrder , view );//把实体数据重构到view中

                //级联表
                    LvyoutuanEntity lvyoutuan = lvyoutuanService.selectById(lvyoutuanOrder.getLvyoutuanId());
                if(lvyoutuan != null){
                    BeanUtils.copyProperties( lvyoutuan , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setLvyoutuanId(lvyoutuan.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(lvyoutuanOrder.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody LvyoutuanOrderEntity lvyoutuanOrder, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,lvyoutuanOrder:{}",this.getClass().getName(),lvyoutuanOrder.toString());
            LvyoutuanEntity lvyoutuanEntity = lvyoutuanService.selectById(lvyoutuanOrder.getLvyoutuanId());
            if(lvyoutuanEntity == null){
                return R.error(511,"查不到该旅游团");
            }

        Integer userId = (Integer) request.getSession().getAttribute("userId");
            if(lvyoutuanEntity.getYonghuId() == userId)
                return R.error("您不能报名自己发起的旅游团");

        ArrayList<Integer> lvyoutuan_order_yesno_types = new ArrayList<>();
        lvyoutuan_order_yesno_types.add(3);
        LvyoutuanOrderEntity lvyoutuanOrderEntity = lvyoutuanOrderService.selectOne(new EntityWrapper<LvyoutuanOrderEntity>()
                .eq("lvyoutuan_id", lvyoutuanOrder.getLvyoutuanId())
                .eq("yonghu_id", lvyoutuanOrder.getYonghuId())
                .notIn("lvyoutuan_order_yesno_types", lvyoutuan_order_yesno_types)
        );
        if(lvyoutuanOrderEntity != null)
            return R.error("您已经报名过当前旅游团");


        List<LvyoutuanOrderEntity> lvyoutuanOrderEntities = lvyoutuanOrderService.selectList(new EntityWrapper<LvyoutuanOrderEntity>()
                .eq("lvyoutuan_id", lvyoutuanOrder.getLvyoutuanId())
                .eq("lvyoutuan_order_yesno_types", 2)
        );
        int i = lvyoutuanEntity.getLvyoutuanNumber() - lvyoutuanOrderEntities.size();
        if(i<1)
            return R.error("该团已经预约满了");


        lvyoutuanOrder.setYonghuId(userId); //设置订单支付人id
            lvyoutuanOrder.setLvyoutuanOrderUuidNumber(String.valueOf(new Date().getTime()));
            lvyoutuanOrder.setInsertTime(new Date());
            lvyoutuanOrder.setCreateTime(new Date());
                lvyoutuanOrderService.insert(lvyoutuanOrder);//新增订单
            return R.ok();
    }



}
