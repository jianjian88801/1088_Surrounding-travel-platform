package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 房间订单
 *
 * @author 
 * @email
 */
@TableName("fangjian_order")
public class FangjianOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FangjianOrderEntity() {

	}

	public FangjianOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 订单号
     */
    @TableField(value = "fangjian_order_uuid_number")

    private String fangjianOrderUuidNumber;


    /**
     * 房间
     */
    @TableField(value = "fangjian_id")

    private Integer fangjianId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 入住日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "zhu_time")

    private Date zhuTime;


    /**
     * 住的天数
     */
    @TableField(value = "zhu_number")

    private Integer zhuNumber;


    /**
     * 实付价格
     */
    @TableField(value = "fangjian_order_true_price")

    private Double fangjianOrderTruePrice;


    /**
     * 订单类型
     */
    @TableField(value = "fangjian_order_types")

    private Integer fangjianOrderTypes;


    /**
     * 支付类型
     */
    @TableField(value = "fangjian_order_payment_types")

    private Integer fangjianOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：订单号
	 */
    public String getFangjianOrderUuidNumber() {
        return fangjianOrderUuidNumber;
    }
    /**
	 * 获取：订单号
	 */

    public void setFangjianOrderUuidNumber(String fangjianOrderUuidNumber) {
        this.fangjianOrderUuidNumber = fangjianOrderUuidNumber;
    }
    /**
	 * 设置：房间
	 */
    public Integer getFangjianId() {
        return fangjianId;
    }
    /**
	 * 获取：房间
	 */

    public void setFangjianId(Integer fangjianId) {
        this.fangjianId = fangjianId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：入住日期
	 */
    public Date getZhuTime() {
        return zhuTime;
    }
    /**
	 * 获取：入住日期
	 */

    public void setZhuTime(Date zhuTime) {
        this.zhuTime = zhuTime;
    }
    /**
	 * 设置：住的天数
	 */
    public Integer getZhuNumber() {
        return zhuNumber;
    }
    /**
	 * 获取：住的天数
	 */

    public void setZhuNumber(Integer zhuNumber) {
        this.zhuNumber = zhuNumber;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getFangjianOrderTruePrice() {
        return fangjianOrderTruePrice;
    }
    /**
	 * 获取：实付价格
	 */

    public void setFangjianOrderTruePrice(Double fangjianOrderTruePrice) {
        this.fangjianOrderTruePrice = fangjianOrderTruePrice;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getFangjianOrderTypes() {
        return fangjianOrderTypes;
    }
    /**
	 * 获取：订单类型
	 */

    public void setFangjianOrderTypes(Integer fangjianOrderTypes) {
        this.fangjianOrderTypes = fangjianOrderTypes;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getFangjianOrderPaymentTypes() {
        return fangjianOrderPaymentTypes;
    }
    /**
	 * 获取：支付类型
	 */

    public void setFangjianOrderPaymentTypes(Integer fangjianOrderPaymentTypes) {
        this.fangjianOrderPaymentTypes = fangjianOrderPaymentTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "FangjianOrder{" +
            "id=" + id +
            ", fangjianOrderUuidNumber=" + fangjianOrderUuidNumber +
            ", fangjianId=" + fangjianId +
            ", yonghuId=" + yonghuId +
            ", zhuTime=" + zhuTime +
            ", zhuNumber=" + zhuNumber +
            ", fangjianOrderTruePrice=" + fangjianOrderTruePrice +
            ", fangjianOrderTypes=" + fangjianOrderTypes +
            ", fangjianOrderPaymentTypes=" + fangjianOrderPaymentTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
