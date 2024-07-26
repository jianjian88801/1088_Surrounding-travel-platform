package com.entity.view;

import com.entity.LvyoutuanOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 旅游团拼团
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("lvyoutuan_order")
public class LvyoutuanOrderView extends LvyoutuanOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 报名状态的值
		*/
		private String lvyoutuanOrderYesnoValue;



		//级联表 lvyoutuan
			/**
			* 旅游团 的 用户
			*/
			private Integer lvyoutuanYonghuId;
			/**
			* 旅游团名称
			*/
			private String lvyoutuanName;
			/**
			* 旅游团编号
			*/
			private String lvyoutuanUuidNumber;
			/**
			* 旅游团照片
			*/
			private String lvyoutuanPhoto;
			/**
			* 旅行地点
			*/
			private String lvyoutuanLvxingdizhi;
			/**
			* 出行方式
			*/
			private Integer youwanluxianChuxingfangshiTypes;
				/**
				* 出行方式的值
				*/
				private String youwanluxianChuxingfangshiValue;
			/**
			* 旅游团类型
			*/
			private Integer lvyoutuanTypes;
				/**
				* 旅游团类型的值
				*/
				private String lvyoutuanValue;
			/**
			* 最大参与人数
			*/
			private Integer lvyoutuanNumber;
			/**
			* 旅游团热度
			*/
			private Integer lvyoutuanClicknum;
			/**
			* 旅游团详情
			*/
			private String lvyoutuanContent;
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
			private Integer lvyoutuanDelete;

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

	public LvyoutuanOrderView() {

	}

	public LvyoutuanOrderView(LvyoutuanOrderEntity lvyoutuanOrderEntity) {
		try {
			BeanUtils.copyProperties(this, lvyoutuanOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 报名状态的值
			*/
			public String getLvyoutuanOrderYesnoValue() {
				return lvyoutuanOrderYesnoValue;
			}
			/**
			* 设置： 报名状态的值
			*/
			public void setLvyoutuanOrderYesnoValue(String lvyoutuanOrderYesnoValue) {
				this.lvyoutuanOrderYesnoValue = lvyoutuanOrderYesnoValue;
			}








































				//级联表的get和set lvyoutuan

					/**
					* 获取：旅游团 的 用户
					*/
					public Integer getLvyoutuanYonghuId() {
						return lvyoutuanYonghuId;
					}
					/**
					* 设置：旅游团 的 用户
					*/
					public void setLvyoutuanYonghuId(Integer lvyoutuanYonghuId) {
						this.lvyoutuanYonghuId = lvyoutuanYonghuId;
					}


					/**
					* 获取： 旅游团名称
					*/
					public String getLvyoutuanName() {
						return lvyoutuanName;
					}
					/**
					* 设置： 旅游团名称
					*/
					public void setLvyoutuanName(String lvyoutuanName) {
						this.lvyoutuanName = lvyoutuanName;
					}

					/**
					* 获取： 旅游团编号
					*/
					public String getLvyoutuanUuidNumber() {
						return lvyoutuanUuidNumber;
					}
					/**
					* 设置： 旅游团编号
					*/
					public void setLvyoutuanUuidNumber(String lvyoutuanUuidNumber) {
						this.lvyoutuanUuidNumber = lvyoutuanUuidNumber;
					}

					/**
					* 获取： 旅游团照片
					*/
					public String getLvyoutuanPhoto() {
						return lvyoutuanPhoto;
					}
					/**
					* 设置： 旅游团照片
					*/
					public void setLvyoutuanPhoto(String lvyoutuanPhoto) {
						this.lvyoutuanPhoto = lvyoutuanPhoto;
					}

					/**
					* 获取： 旅行地点
					*/
					public String getLvyoutuanLvxingdizhi() {
						return lvyoutuanLvxingdizhi;
					}
					/**
					* 设置： 旅行地点
					*/
					public void setLvyoutuanLvxingdizhi(String lvyoutuanLvxingdizhi) {
						this.lvyoutuanLvxingdizhi = lvyoutuanLvxingdizhi;
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
					* 获取： 旅游团类型
					*/
					public Integer getLvyoutuanTypes() {
						return lvyoutuanTypes;
					}
					/**
					* 设置： 旅游团类型
					*/
					public void setLvyoutuanTypes(Integer lvyoutuanTypes) {
						this.lvyoutuanTypes = lvyoutuanTypes;
					}


						/**
						* 获取： 旅游团类型的值
						*/
						public String getLvyoutuanValue() {
							return lvyoutuanValue;
						}
						/**
						* 设置： 旅游团类型的值
						*/
						public void setLvyoutuanValue(String lvyoutuanValue) {
							this.lvyoutuanValue = lvyoutuanValue;
						}

					/**
					* 获取： 最大参与人数
					*/
					public Integer getLvyoutuanNumber() {
						return lvyoutuanNumber;
					}
					/**
					* 设置： 最大参与人数
					*/
					public void setLvyoutuanNumber(Integer lvyoutuanNumber) {
						this.lvyoutuanNumber = lvyoutuanNumber;
					}

					/**
					* 获取： 旅游团热度
					*/
					public Integer getLvyoutuanClicknum() {
						return lvyoutuanClicknum;
					}
					/**
					* 设置： 旅游团热度
					*/
					public void setLvyoutuanClicknum(Integer lvyoutuanClicknum) {
						this.lvyoutuanClicknum = lvyoutuanClicknum;
					}

					/**
					* 获取： 旅游团详情
					*/
					public String getLvyoutuanContent() {
						return lvyoutuanContent;
					}
					/**
					* 设置： 旅游团详情
					*/
					public void setLvyoutuanContent(String lvyoutuanContent) {
						this.lvyoutuanContent = lvyoutuanContent;
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
					public Integer getLvyoutuanDelete() {
						return lvyoutuanDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setLvyoutuanDelete(Integer lvyoutuanDelete) {
						this.lvyoutuanDelete = lvyoutuanDelete;
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
