package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouwanluxianEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 游玩路线 服务类
 */
public interface YouwanluxianService extends IService<YouwanluxianEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}