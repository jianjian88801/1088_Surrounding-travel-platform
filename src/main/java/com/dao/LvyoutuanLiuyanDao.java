package com.dao;

import com.entity.LvyoutuanLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LvyoutuanLiuyanView;

/**
 * 旅游团留言 Dao 接口
 *
 * @author 
 */
public interface LvyoutuanLiuyanDao extends BaseMapper<LvyoutuanLiuyanEntity> {

   List<LvyoutuanLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
