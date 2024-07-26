package com.entity.model;

import com.entity.JingdianOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 景点订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JingdianOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单号
     */
    private String jingdianOrderUuidNumber;


    /**
     * 景点
     */
    private Integer jingdianId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 购买数量
     */
    private Integer buyNumber;


    /**
     * 游玩日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date youwanTime;


    /**
     * 实付价格
     */
    private Double jingdianOrderTruePrice;


    /**
     * 订单类型
     */
    private Integer jingdianOrderTypes;


    /**
     * 支付类型
     */
    private Integer jingdianOrderPaymentTypes;


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
    public String getJingdianOrderUuidNumber() {
        return jingdianOrderUuidNumber;
    }


    /**
	 * 设置：订单号
	 */
    public void setJingdianOrderUuidNumber(String jingdianOrderUuidNumber) {
        this.jingdianOrderUuidNumber = jingdianOrderUuidNumber;
    }
    /**
	 * 获取：景点
	 */
    public Integer getJingdianId() {
        return jingdianId;
    }


    /**
	 * 设置：景点
	 */
    public void setJingdianId(Integer jingdianId) {
        this.jingdianId = jingdianId;
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
	 * 获取：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 设置：购买数量
	 */
    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 获取：游玩日期
	 */
    public Date getYouwanTime() {
        return youwanTime;
    }


    /**
	 * 设置：游玩日期
	 */
    public void setYouwanTime(Date youwanTime) {
        this.youwanTime = youwanTime;
    }
    /**
	 * 获取：实付价格
	 */
    public Double getJingdianOrderTruePrice() {
        return jingdianOrderTruePrice;
    }


    /**
	 * 设置：实付价格
	 */
    public void setJingdianOrderTruePrice(Double jingdianOrderTruePrice) {
        this.jingdianOrderTruePrice = jingdianOrderTruePrice;
    }
    /**
	 * 获取：订单类型
	 */
    public Integer getJingdianOrderTypes() {
        return jingdianOrderTypes;
    }


    /**
	 * 设置：订单类型
	 */
    public void setJingdianOrderTypes(Integer jingdianOrderTypes) {
        this.jingdianOrderTypes = jingdianOrderTypes;
    }
    /**
	 * 获取：支付类型
	 */
    public Integer getJingdianOrderPaymentTypes() {
        return jingdianOrderPaymentTypes;
    }


    /**
	 * 设置：支付类型
	 */
    public void setJingdianOrderPaymentTypes(Integer jingdianOrderPaymentTypes) {
        this.jingdianOrderPaymentTypes = jingdianOrderPaymentTypes;
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
