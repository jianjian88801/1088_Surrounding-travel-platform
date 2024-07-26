package com.dao;

import com.entity.LvyoutuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LvyoutuanView;

/**
 * 旅游团 Dao 接口
 *
 * @author 
 */
public interface LvyoutuanDao extends BaseMapper<LvyoutuanEntity> {

   List<LvyoutuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
