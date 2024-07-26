package com.dao;

import com.entity.YouwanluxianCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YouwanluxianCollectionView;

/**
 * 游玩路线收藏 Dao 接口
 *
 * @author 
 */
public interface YouwanluxianCollectionDao extends BaseMapper<YouwanluxianCollectionEntity> {

   List<YouwanluxianCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
