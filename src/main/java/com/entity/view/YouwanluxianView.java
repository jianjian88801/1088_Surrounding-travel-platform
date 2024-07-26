package com.entity.view;

import com.entity.YouwanluxianEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 游玩路线
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("youwanluxian")
public class YouwanluxianView extends YouwanluxianEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 旅游方式的值
		*/
		private String youwanluxianLvyoufangshiValue;
		/**
		* 出发时间的值
		*/
		private String youwanluxianChufashijianValue;
		/**
		* 出行方式的值
		*/
		private String youwanluxianChuxingfangshiValue;



	public YouwanluxianView() {

	}

	public YouwanluxianView(YouwanluxianEntity youwanluxianEntity) {
		try {
			BeanUtils.copyProperties(this, youwanluxianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 旅游方式的值
			*/
			public String getYouwanluxianLvyoufangshiValue() {
				return youwanluxianLvyoufangshiValue;
			}
			/**
			* 设置： 旅游方式的值
			*/
			public void setYouwanluxianLvyoufangshiValue(String youwanluxianLvyoufangshiValue) {
				this.youwanluxianLvyoufangshiValue = youwanluxianLvyoufangshiValue;
			}
			/**
			* 获取： 出发时间的值
			*/
			public String getYouwanluxianChufashijianValue() {
				return youwanluxianChufashijianValue;
			}
			/**
			* 设置： 出发时间的值
			*/
			public void setYouwanluxianChufashijianValue(String youwanluxianChufashijianValue) {
				this.youwanluxianChufashijianValue = youwanluxianChufashijianValue;
			}
			/**
			* 获取： 出行方式的值
			*/
			public String getYouwanluxianChuxingfangshiValue() {
				return youwanluxianChuxingfangshiValue;
			}
			/**
			* 设置： 出行方式的值
			*/
			public void setYouwanluxianChuxingfangshiValue(String youwanluxianChuxingfangshiValue) {
				this.youwanluxianChuxingfangshiValue = youwanluxianChuxingfangshiValue;
			}























}
