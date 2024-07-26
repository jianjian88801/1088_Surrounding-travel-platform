package com.entity.model;

import com.entity.FangjianOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 房间订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FangjianOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单号
     */
    private String fangjianOrderUuidNumber;


    /**
     * 房间
     */
    private Integer fangjianId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 入住日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zhuTime;


    /**
     * 住的天数
     */
    private Integer zhuNumber;


    /**
     * 实付价格
     */
    private Double fangjianOrderTruePrice;


    /**
     * 订单类型
     */
    private Integer fangjianOrderTypes;


    /**
     * 支付类型
     */
    private Integer fangjianOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：订单号
	 */
    public String getFangjianOrderUuidNumber() {
        return fangjianOrderUuidNumber;
    }


    /**
	 * 设置：订单号
	 */
    public void setFangjianOrderUuidNumber(String fangjianOrderUuidNumber) {
        this.fangjianOrderUuidNumber = fangjianOrderUuidNumber;
    }
    /**
	 * 获取：房间
	 */
    public Integer getFangjianId() {
        return fangjianId;
    }


    /**
	 * 设置：房间
	 */
    public void setFangjianId(Integer fangjianId) {
        this.fangjianId = fangjianId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：入住日期
	 */
    public Date getZhuTime() {
        return zhuTime;
    }


    /**
	 * 设置：入住日期
	 */
    public void setZhuTime(Date zhuTime) {
        this.zhuTime = zhuTime;
    }
    /**
	 * 获取：住的天数
	 */
    public Integer getZhuNumber() {
        return zhuNumber;
    }


    /**
	 * 设置：住的天数
	 */
    public void setZhuNumber(Integer zhuNumber) {
        this.zhuNumber = zhuNumber;
    }
    /**
	 * 获取：实付价格
	 */
    public Double getFangjianOrderTruePrice() {
        return fangjianOrderTruePrice;
    }


    /**
	 * 设置：实付价格
	 */
    public void setFangjianOrderTruePrice(Double fangjianOrderTruePrice) {
        this.fangjianOrderTruePrice = fangjianOrderTruePrice;
    }
    /**
	 * 获取：订单类型
	 */
    public Integer getFangjianOrderTypes() {
        return fangjianOrderTypes;
    }


    /**
	 * 设置：订单类型
	 */
    public void setFangjianOrderTypes(Integer fangjianOrderTypes) {
        this.fangjianOrderTypes = fangjianOrderTypes;
    }
    /**
	 * 获取：支付类型
	 */
    public Integer getFangjianOrderPaymentTypes() {
        return fangjianOrderPaymentTypes;
    }


    /**
	 * 设置：支付类型
	 */
    public void setFangjianOrderPaymentTypes(Integer fangjianOrderPaymentTypes) {
        this.fangjianOrderPaymentTypes = fangjianOrderPaymentTypes;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
