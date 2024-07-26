package com.entity.model;

import com.entity.LvyoutuanOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 旅游团拼团
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LvyoutuanOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单号
     */
    private String lvyoutuanOrderUuidNumber;


    /**
     * 旅游团
     */
    private Integer lvyoutuanId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 报名状态
     */
    private Integer lvyoutuanOrderYesnoTypes;


    /**
     * 审核意见
     */
    private String lvyoutuanOrderYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date lvyoutuanOrderShenheTime;


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
    public String getLvyoutuanOrderUuidNumber() {
        return lvyoutuanOrderUuidNumber;
    }


    /**
	 * 设置：订单号
	 */
    public void setLvyoutuanOrderUuidNumber(String lvyoutuanOrderUuidNumber) {
        this.lvyoutuanOrderUuidNumber = lvyoutuanOrderUuidNumber;
    }
    /**
	 * 获取：旅游团
	 */
    public Integer getLvyoutuanId() {
        return lvyoutuanId;
    }


    /**
	 * 设置：旅游团
	 */
    public void setLvyoutuanId(Integer lvyoutuanId) {
        this.lvyoutuanId = lvyoutuanId;
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
	 * 获取：报名时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：报名时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：报名状态
	 */
    public Integer getLvyoutuanOrderYesnoTypes() {
        return lvyoutuanOrderYesnoTypes;
    }


    /**
	 * 设置：报名状态
	 */
    public void setLvyoutuanOrderYesnoTypes(Integer lvyoutuanOrderYesnoTypes) {
        this.lvyoutuanOrderYesnoTypes = lvyoutuanOrderYesnoTypes;
    }
    /**
	 * 获取：审核意见
	 */
    public String getLvyoutuanOrderYesnoText() {
        return lvyoutuanOrderYesnoText;
    }


    /**
	 * 设置：审核意见
	 */
    public void setLvyoutuanOrderYesnoText(String lvyoutuanOrderYesnoText) {
        this.lvyoutuanOrderYesnoText = lvyoutuanOrderYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getLvyoutuanOrderShenheTime() {
        return lvyoutuanOrderShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setLvyoutuanOrderShenheTime(Date lvyoutuanOrderShenheTime) {
        this.lvyoutuanOrderShenheTime = lvyoutuanOrderShenheTime;
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
