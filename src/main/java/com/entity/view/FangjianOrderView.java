package com.entity.view;

import com.entity.FangjianOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 房间订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fangjian_order")
public class FangjianOrderView extends FangjianOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 订单类型的值
		*/
		private String fangjianOrderValue;
		/**
		* 支付类型的值
		*/
		private String fangjianOrderPaymentValue;



		//级联表 fangjian
			/**
			* 房间名称
			*/
			private String fangjianName;
			/**
			* 房间编号
			*/
			private String fangjianUuidNumber;
			/**
			* 酒店名称
			*/
			private String jiudianName;
			/**
			* 房间照片
			*/
			private String fangjianPhoto;
			/**
			* 房间特色
			*/
			private String fangjianTese;
			/**
			* 房间位置
			*/
			private String fangjianAddress;
			/**
			* 房间类型
			*/
			private Integer fangjianTypes;
				/**
				* 房间类型的值
				*/
				private String fangjianValue;
			/**
			* 房间原价
			*/
			private Double fangjianOldMoney;
			/**
			* 房间现价/天
			*/
			private Double fangjianNewMoney;
			/**
			* 房间介绍
			*/
			private String fangjianContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer fangjianDelete;

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

	public FangjianOrderView() {

	}

	public FangjianOrderView(FangjianOrderEntity fangjianOrderEntity) {
		try {
			BeanUtils.copyProperties(this, fangjianOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单类型的值
			*/
			public String getFangjianOrderValue() {
				return fangjianOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setFangjianOrderValue(String fangjianOrderValue) {
				this.fangjianOrderValue = fangjianOrderValue;
			}
			/**
			* 获取： 支付类型的值
			*/
			public String getFangjianOrderPaymentValue() {
				return fangjianOrderPaymentValue;
			}
			/**
			* 设置： 支付类型的值
			*/
			public void setFangjianOrderPaymentValue(String fangjianOrderPaymentValue) {
				this.fangjianOrderPaymentValue = fangjianOrderPaymentValue;
			}










				//级联表的get和set fangjian

					/**
					* 获取： 房间名称
					*/
					public String getFangjianName() {
						return fangjianName;
					}
					/**
					* 设置： 房间名称
					*/
					public void setFangjianName(String fangjianName) {
						this.fangjianName = fangjianName;
					}

					/**
					* 获取： 房间编号
					*/
					public String getFangjianUuidNumber() {
						return fangjianUuidNumber;
					}
					/**
					* 设置： 房间编号
					*/
					public void setFangjianUuidNumber(String fangjianUuidNumber) {
						this.fangjianUuidNumber = fangjianUuidNumber;
					}

					/**
					* 获取： 酒店名称
					*/
					public String getJiudianName() {
						return jiudianName;
					}
					/**
					* 设置： 酒店名称
					*/
					public void setJiudianName(String jiudianName) {
						this.jiudianName = jiudianName;
					}

					/**
					* 获取： 房间照片
					*/
					public String getFangjianPhoto() {
						return fangjianPhoto;
					}
					/**
					* 设置： 房间照片
					*/
					public void setFangjianPhoto(String fangjianPhoto) {
						this.fangjianPhoto = fangjianPhoto;
					}

					/**
					* 获取： 房间特色
					*/
					public String getFangjianTese() {
						return fangjianTese;
					}
					/**
					* 设置： 房间特色
					*/
					public void setFangjianTese(String fangjianTese) {
						this.fangjianTese = fangjianTese;
					}

					/**
					* 获取： 房间位置
					*/
					public String getFangjianAddress() {
						return fangjianAddress;
					}
					/**
					* 设置： 房间位置
					*/
					public void setFangjianAddress(String fangjianAddress) {
						this.fangjianAddress = fangjianAddress;
					}

					/**
					* 获取： 房间类型
					*/
					public Integer getFangjianTypes() {
						return fangjianTypes;
					}
					/**
					* 设置： 房间类型
					*/
					public void setFangjianTypes(Integer fangjianTypes) {
						this.fangjianTypes = fangjianTypes;
					}


						/**
						* 获取： 房间类型的值
						*/
						public String getFangjianValue() {
							return fangjianValue;
						}
						/**
						* 设置： 房间类型的值
						*/
						public void setFangjianValue(String fangjianValue) {
							this.fangjianValue = fangjianValue;
						}

					/**
					* 获取： 房间原价
					*/
					public Double getFangjianOldMoney() {
						return fangjianOldMoney;
					}
					/**
					* 设置： 房间原价
					*/
					public void setFangjianOldMoney(Double fangjianOldMoney) {
						this.fangjianOldMoney = fangjianOldMoney;
					}

					/**
					* 获取： 房间现价/天
					*/
					public Double getFangjianNewMoney() {
						return fangjianNewMoney;
					}
					/**
					* 设置： 房间现价/天
					*/
					public void setFangjianNewMoney(Double fangjianNewMoney) {
						this.fangjianNewMoney = fangjianNewMoney;
					}

					/**
					* 获取： 房间介绍
					*/
					public String getFangjianContent() {
						return fangjianContent;
					}
					/**
					* 设置： 房间介绍
					*/
					public void setFangjianContent(String fangjianContent) {
						this.fangjianContent = fangjianContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getFangjianDelete() {
						return fangjianDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setFangjianDelete(Integer fangjianDelete) {
						this.fangjianDelete = fangjianDelete;
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












}
