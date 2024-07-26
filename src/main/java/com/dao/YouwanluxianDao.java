package com.dao;

import com.entity.YouwanluxianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YouwanluxianView;

/**
 * 游玩路线 Dao 接口
 *
 * @author 
 */
public interface YouwanluxianDao extends BaseMapper<YouwanluxianEntity> {

   List<YouwanluxianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
