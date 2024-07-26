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
 * 旅游团拼团
 *
 * @author 
 * @email
 */
@TableName("lvyoutuan_order")
public class LvyoutuanOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LvyoutuanOrderEntity() {

	}

	public LvyoutuanOrderEntity(T t) {
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
    @TableField(value = "lvyoutuan_order_uuid_number")

    private String lvyoutuanOrderUuidNumber;


    /**
     * 旅游团
     */
    @TableField(value = "lvyoutuan_id")

    private Integer lvyoutuanId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 报名时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 报名状态
     */
    @TableField(value = "lvyoutuan_order_yesno_types")

    private Integer lvyoutuanOrderYesnoTypes;


    /**
     * 审核意见
     */
    @TableField(value = "lvyoutuan_order_yesno_text")

    private String lvyoutuanOrderYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "lvyoutuan_order_shenhe_time")

    private Date lvyoutuanOrderShenheTime;


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
    public String getLvyoutuanOrderUuidNumber() {
        return lvyoutuanOrderUuidNumber;
    }
    /**
	 * 获取：订单号
	 */

    public void setLvyoutuanOrderUuidNumber(String lvyoutuanOrderUuidNumber) {
        this.lvyoutuanOrderUuidNumber = lvyoutuanOrderUuidNumber;
    }
    /**
	 * 设置：旅游团
	 */
    public Integer getLvyoutuanId() {
        return lvyoutuanId;
    }
    /**
	 * 获取：旅游团
	 */

    public void setLvyoutuanId(Integer lvyoutuanId) {
        this.lvyoutuanId = lvyoutuanId;
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
	 * 设置：报名时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：报名时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：报名状态
	 */
    public Integer getLvyoutuanOrderYesnoTypes() {
        return lvyoutuanOrderYesnoTypes;
    }
    /**
	 * 获取：报名状态
	 */

    public void setLvyoutuanOrderYesnoTypes(Integer lvyoutuanOrderYesnoTypes) {
        this.lvyoutuanOrderYesnoTypes = lvyoutuanOrderYesnoTypes;
    }
    /**
	 * 设置：审核意见
	 */
    public String getLvyoutuanOrderYesnoText() {
        return lvyoutuanOrderYesnoText;
    }
    /**
	 * 获取：审核意见
	 */

    public void setLvyoutuanOrderYesnoText(String lvyoutuanOrderYesnoText) {
        this.lvyoutuanOrderYesnoText = lvyoutuanOrderYesnoText;
    }
    /**
	 * 设置：审核时间
	 */
    public Date getLvyoutuanOrderShenheTime() {
        return lvyoutuanOrderShenheTime;
    }
    /**
	 * 获取：审核时间
	 */

    public void setLvyoutuanOrderShenheTime(Date lvyoutuanOrderShenheTime) {
        this.lvyoutuanOrderShenheTime = lvyoutuanOrderShenheTime;
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
        return "LvyoutuanOrder{" +
            "id=" + id +
            ", lvyoutuanOrderUuidNumber=" + lvyoutuanOrderUuidNumber +
            ", lvyoutuanId=" + lvyoutuanId +
            ", yonghuId=" + yonghuId +
            ", insertTime=" + insertTime +
            ", lvyoutuanOrderYesnoTypes=" + lvyoutuanOrderYesnoTypes +
            ", lvyoutuanOrderYesnoText=" + lvyoutuanOrderYesnoText +
            ", lvyoutuanOrderShenheTime=" + lvyoutuanOrderShenheTime +
            ", createTime=" + createTime +
        "}";
    }
}
