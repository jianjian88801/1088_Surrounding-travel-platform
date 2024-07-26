package com.entity.view;

import com.entity.YouwanluxianLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 游玩路线留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("youwanluxian_liuyan")
public class YouwanluxianLiuyanView extends YouwanluxianLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

		//级联表 youwanluxian
			/**
			* 游玩路线名称
			*/
			private String youwanluxianName;
			/**
			* 游玩路线编号
			*/
			private String youwanluxianUuidNumber;
			/**
			* 游玩路线照片
			*/
			private String youwanluxianPhoto;
			/**
			* 旅游方式
			*/
			private Integer youwanluxianLvyoufangshiTypes;
				/**
				* 旅游方式的值
				*/
				private String youwanluxianLvyoufangshiValue;
			/**
			* 出发时间
			*/
			private Integer youwanluxianChufashijianTypes;
				/**
				* 出发时间的值
				*/
				private String youwanluxianChufashijianValue;
			/**
			* 行程时间
			*/
			private Integer youwanluxianXingchengNumber;
			/**
			* 出行方式
			*/
			private Integer youwanluxianChuxingfangshiTypes;
				/**
				* 出行方式的值
				*/
				private String youwanluxianChuxingfangshiValue;
			/**
			* 游玩路线热度
			*/
			private Integer youwanluxianClicknum;
			/**
			* 游玩路线介绍
			*/
			private String youwanluxianContent;
			/**
			* 逻辑删除
			*/
			private Integer youwanluxianDelete;

	public YouwanluxianLiuyanView() {

	}

	public YouwanluxianLiuyanView(YouwanluxianLiuyanEntity youwanluxianLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, youwanluxianLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
























































				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}


				//级联表的get和set youwanluxian

					/**
					* 获取： 游玩路线名称
					*/
					public String getYouwanluxianName() {
						return youwanluxianName;
					}
					/**
					* 设置： 游玩路线名称
					*/
					public void setYouwanluxianName(String youwanluxianName) {
						this.youwanluxianName = youwanluxianName;
					}

					/**
					* 获取： 游玩路线编号
					*/
					public String getYouwanluxianUuidNumber() {
						return youwanluxianUuidNumber;
					}
					/**
					* 设置： 游玩路线编号
					*/
					public void setYouwanluxianUuidNumber(String youwanluxianUuidNumber) {
						this.youwanluxianUuidNumber = youwanluxianUuidNumber;
					}

					/**
					* 获取： 游玩路线照片
					*/
					public String getYouwanluxianPhoto() {
						return youwanluxianPhoto;
					}
					/**
					* 设置： 游玩路线照片
					*/
					public void setYouwanluxianPhoto(String youwanluxianPhoto) {
						this.youwanluxianPhoto = youwanluxianPhoto;
					}

					/**
					* 获取： 旅游方式
					*/
					public Integer getYouwanluxianLvyoufangshiTypes() {
						return youwanluxianLvyoufangshiTypes;
					}
					/**
					* 设置： 旅游方式
					*/
					public void setYouwanluxianLvyoufangshiTypes(Integer youwanluxianLvyoufangshiTypes) {
						this.youwanluxianLvyoufangshiTypes = youwanluxianLvyoufangshiTypes;
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
					* 获取： 出发时间
					*/
					public Integer getYouwanluxianChufashijianTypes() {
						return youwanluxianChufashijianTypes;
					}
					/**
					* 设置： 出发时间
					*/
					public void setYouwanluxianChufashijianTypes(Integer youwanluxianChufashijianTypes) {
						this.youwanluxianChufashijianTypes = youwanluxianChufashijianTypes;
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
					* 获取： 行程时间
					*/
					public Integer getYouwanluxianXingchengNumber() {
						return youwanluxianXingchengNumber;
					}
					/**
					* 设置： 行程时间
					*/
					public void setYouwanluxianXingchengNumber(Integer youwanluxianXingchengNumber) {
						this.youwanluxianXingchengNumber = youwanluxianXingchengNumber;
					}

					/**
					* 获取： 出行方式
					*/
					public Integer getYouwanluxianChuxingfangshiTypes() {
						return youwanluxianChuxingfangshiTypes;
					}
					/**
					* 设置： 出行方式
					*/
					public void setYouwanluxianChuxingfangshiTypes(Integer youwanluxianChuxingfangshiTypes) {
						this.youwanluxianChuxingfangshiTypes = youwanluxianChuxingfangshiTypes;
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

					/**
					* 获取： 游玩路线热度
					*/
					public Integer getYouwanluxianClicknum() {
						return youwanluxianClicknum;
					}
					/**
					* 设置： 游玩路线热度
					*/
					public void setYouwanluxianClicknum(Integer youwanluxianClicknum) {
						this.youwanluxianClicknum = youwanluxianClicknum;
					}

					/**
					* 获取： 游玩路线介绍
					*/
					public String getYouwanluxianContent() {
						return youwanluxianContent;
					}
					/**
					* 设置： 游玩路线介绍
					*/
					public void setYouwanluxianContent(String youwanluxianContent) {
						this.youwanluxianContent = youwanluxianContent;
					}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getYouwanluxianDelete() {
						return youwanluxianDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setYouwanluxianDelete(Integer youwanluxianDelete) {
						this.youwanluxianDelete = youwanluxianDelete;
					}










}
