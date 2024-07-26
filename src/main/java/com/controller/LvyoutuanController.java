
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
 * 旅游团
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/lvyoutuan")
public class LvyoutuanController {
    private static final Logger logger = LoggerFactory.getLogger(LvyoutuanController.class);

    @Autowired
    private LvyoutuanService lvyoutuanService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
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
        params.put("lvyoutuanDeleteStart",1);params.put("lvyoutuanDeleteEnd",1);
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = lvyoutuanService.queryPage(params);

        //字典表数据转换
        List<LvyoutuanView> list =(List<LvyoutuanView>)page.getList();
        for(LvyoutuanView c:list){
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
        LvyoutuanEntity lvyoutuan = lvyoutuanService.selectById(id);
        if(lvyoutuan !=null){
            //entity转view
            LvyoutuanView view = new LvyoutuanView();
            BeanUtils.copyProperties( lvyoutuan , view );//把实体数据重构到view中

                //级联表
                YonghuEntity yonghu = yonghuService.selectById(lvyoutuan.getYonghuId());
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
    public R save(@RequestBody LvyoutuanEntity lvyoutuan, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,lvyoutuan:{}",this.getClass().getName(),lvyoutuan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            lvyoutuan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<LvyoutuanEntity> queryWrapper = new EntityWrapper<LvyoutuanEntity>()
            .eq("yonghu_id", lvyoutuan.getYonghuId())
            .eq("lvyoutuan_name", lvyoutuan.getLvyoutuanName())
            .eq("lvyoutuan_uuid_number", lvyoutuan.getLvyoutuanUuidNumber())
            .eq("lvyoutuan_lvxingdizhi", lvyoutuan.getLvyoutuanLvxingdizhi())
            .eq("youwanluxian_chuxingfangshi_types", lvyoutuan.getYouwanluxianChuxingfangshiTypes())
            .eq("lvyoutuan_types", lvyoutuan.getLvyoutuanTypes())
            .eq("lvyoutuan_number", lvyoutuan.getLvyoutuanNumber())
            .eq("lvyoutuan_clicknum", lvyoutuan.getLvyoutuanClicknum())
            .eq("shangxia_types", lvyoutuan.getShangxiaTypes())
            .eq("lvyoutuan_delete", lvyoutuan.getLvyoutuanDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LvyoutuanEntity lvyoutuanEntity = lvyoutuanService.selectOne(queryWrapper);
        if(lvyoutuanEntity==null){
            lvyoutuan.setLvyoutuanClicknum(1);
            lvyoutuan.setShangxiaTypes(1);
            lvyoutuan.setLvyoutuanDelete(1);
            lvyoutuan.setCreateTime(new Date());
            lvyoutuanService.insert(lvyoutuan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody LvyoutuanEntity lvyoutuan, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,lvyoutuan:{}",this.getClass().getName(),lvyoutuan.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            lvyoutuan.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<LvyoutuanEntity> queryWrapper = new EntityWrapper<LvyoutuanEntity>()
            .notIn("id",lvyoutuan.getId())
            .andNew()
            .eq("yonghu_id", lvyoutuan.getYonghuId())
            .eq("lvyoutuan_name", lvyoutuan.getLvyoutuanName())
            .eq("lvyoutuan_uuid_number", lvyoutuan.getLvyoutuanUuidNumber())
            .eq("lvyoutuan_lvxingdizhi", lvyoutuan.getLvyoutuanLvxingdizhi())
            .eq("youwanluxian_chuxingfangshi_types", lvyoutuan.getYouwanluxianChuxingfangshiTypes())
            .eq("lvyoutuan_types", lvyoutuan.getLvyoutuanTypes())
            .eq("lvyoutuan_number", lvyoutuan.getLvyoutuanNumber())
            .eq("lvyoutuan_clicknum", lvyoutuan.getLvyoutuanClicknum())
            .eq("shangxia_types", lvyoutuan.getShangxiaTypes())
            .eq("lvyoutuan_delete", lvyoutuan.getLvyoutuanDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LvyoutuanEntity lvyoutuanEntity = lvyoutuanService.selectOne(queryWrapper);
        if("".equals(lvyoutuan.getLvyoutuanPhoto()) || "null".equals(lvyoutuan.getLvyoutuanPhoto())){
                lvyoutuan.setLvyoutuanPhoto(null);
        }
        if(lvyoutuanEntity==null){
            lvyoutuanService.updateById(lvyoutuan);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        ArrayList<LvyoutuanEntity> list = new ArrayList<>();
        for(Integer id:ids){
            LvyoutuanEntity lvyoutuanEntity = new LvyoutuanEntity();
            lvyoutuanEntity.setId(id);
            lvyoutuanEntity.setLvyoutuanDelete(2);
            list.add(lvyoutuanEntity);
        }
        if(list != null && list.size() >0){
            lvyoutuanService.updateBatchById(list);
        }
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
            List<LvyoutuanEntity> lvyoutuanList = new ArrayList<>();//上传的东西
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
                            LvyoutuanEntity lvyoutuanEntity = new LvyoutuanEntity();
//                            lvyoutuanEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            lvyoutuanEntity.setLvyoutuanName(data.get(0));                    //旅游团名称 要改的
//                            lvyoutuanEntity.setLvyoutuanUuidNumber(data.get(0));                    //旅游团编号 要改的
//                            lvyoutuanEntity.setLvyoutuanPhoto("");//详情和图片
//                            lvyoutuanEntity.setLvyoutuanLvxingdizhi(data.get(0));                    //旅行地点 要改的
//                            lvyoutuanEntity.setYouwanluxianChuxingfangshiTypes(Integer.valueOf(data.get(0)));   //出行方式 要改的
//                            lvyoutuanEntity.setLvyoutuanTypes(Integer.valueOf(data.get(0)));   //旅游团类型 要改的
//                            lvyoutuanEntity.setLvyoutuanNumber(Integer.valueOf(data.get(0)));   //最大参与人数 要改的
//                            lvyoutuanEntity.setLvyoutuanClicknum(Integer.valueOf(data.get(0)));   //旅游团热度 要改的
//                            lvyoutuanEntity.setLvyoutuanContent("");//详情和图片
//                            lvyoutuanEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            lvyoutuanEntity.setLvyoutuanDelete(1);//逻辑删除字段
//                            lvyoutuanEntity.setCreateTime(date);//时间
                            lvyoutuanList.add(lvyoutuanEntity);


                            //把要查询是否重复的字段放入map中
                                //旅游团编号
                                if(seachFields.containsKey("lvyoutuanUuidNumber")){
                                    List<String> lvyoutuanUuidNumber = seachFields.get("lvyoutuanUuidNumber");
                                    lvyoutuanUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> lvyoutuanUuidNumber = new ArrayList<>();
                                    lvyoutuanUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("lvyoutuanUuidNumber",lvyoutuanUuidNumber);
                                }
                        }

                        //查询是否重复
                         //旅游团编号
                        List<LvyoutuanEntity> lvyoutuanEntities_lvyoutuanUuidNumber = lvyoutuanService.selectList(new EntityWrapper<LvyoutuanEntity>().in("lvyoutuan_uuid_number", seachFields.get("lvyoutuanUuidNumber")).eq("lvyoutuan_delete", 1));
                        if(lvyoutuanEntities_lvyoutuanUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(LvyoutuanEntity s:lvyoutuanEntities_lvyoutuanUuidNumber){
                                repeatFields.add(s.getLvyoutuanUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [旅游团编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        lvyoutuanService.insertBatch(lvyoutuanList);
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
        PageUtils page = lvyoutuanService.queryPage(params);

        //字典表数据转换
        List<LvyoutuanView> list =(List<LvyoutuanView>)page.getList();
        for(LvyoutuanView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        LvyoutuanEntity lvyoutuan = lvyoutuanService.selectById(id);
            if(lvyoutuan !=null){

                //点击数量加1
                lvyoutuan.setLvyoutuanClicknum(lvyoutuan.getLvyoutuanClicknum()+1);
                lvyoutuanService.updateById(lvyoutuan);

                //entity转view
                LvyoutuanView view = new LvyoutuanView();
                BeanUtils.copyProperties( lvyoutuan , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(lvyoutuan.getYonghuId());
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
    public R add(@RequestBody LvyoutuanEntity lvyoutuan, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,lvyoutuan:{}",this.getClass().getName(),lvyoutuan.toString());
        Wrapper<LvyoutuanEntity> queryWrapper = new EntityWrapper<LvyoutuanEntity>()
            .eq("yonghu_id", lvyoutuan.getYonghuId())
            .eq("lvyoutuan_name", lvyoutuan.getLvyoutuanName())
            .eq("lvyoutuan_uuid_number", lvyoutuan.getLvyoutuanUuidNumber())
            .eq("lvyoutuan_lvxingdizhi", lvyoutuan.getLvyoutuanLvxingdizhi())
            .eq("youwanluxian_chuxingfangshi_types", lvyoutuan.getYouwanluxianChuxingfangshiTypes())
            .eq("lvyoutuan_types", lvyoutuan.getLvyoutuanTypes())
            .eq("lvyoutuan_number", lvyoutuan.getLvyoutuanNumber())
            .eq("lvyoutuan_clicknum", lvyoutuan.getLvyoutuanClicknum())
            .eq("shangxia_types", lvyoutuan.getShangxiaTypes())
            .eq("lvyoutuan_delete", lvyoutuan.getLvyoutuanDelete())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        LvyoutuanEntity lvyoutuanEntity = lvyoutuanService.selectOne(queryWrapper);
        if(lvyoutuanEntity==null){
            lvyoutuan.setLvyoutuanDelete(1);
            lvyoutuan.setCreateTime(new Date());
        lvyoutuanService.insert(lvyoutuan);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
