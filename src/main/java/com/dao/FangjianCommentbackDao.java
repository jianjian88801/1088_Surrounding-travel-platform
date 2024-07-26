package com.dao;

import com.entity.FangjianCommentbackEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FangjianCommentbackView;

/**
 * 房间评价 Dao 接口
 *
 * @author 
 */
public interface FangjianCommentbackDao extends BaseMapper<FangjianCommentbackEntity> {

   List<FangjianCommentbackView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
