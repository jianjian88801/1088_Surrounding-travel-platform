package com.dao;

import com.entity.YouwanluxianLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YouwanluxianLiuyanView;

/**
 * 游玩路线留言 Dao 接口
 *
 * @author 
 */
public interface YouwanluxianLiuyanDao extends BaseMapper<YouwanluxianLiuyanEntity> {

   List<YouwanluxianLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
