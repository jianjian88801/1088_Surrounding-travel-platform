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
 * 景点
 *
 * @author 
 * @email
 */
@TableName("jingdian")
public class JingdianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JingdianEntity() {

	}

	public JingdianEntity(T t) {
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
     * 景点名称
     */
    @TableField(value = "jingdian_name")

    private String jingdianName;


    /**
     * 景点编号
     */
    @TableField(value = "jingdian_uuid_number")

    private String jingdianUuidNumber;


    /**
     * 景点照片
     */
    @TableField(value = "jingdian_photo")

    private String jingdianPhoto;


    /**
     * 景点特色
     */
    @TableField(value = "jingdian_tese")

    private String jingdianTese;


    /**
     * 景点游玩路线
     */
    @TableField(value = "jingdian_luxian")

    private String jingdianLuxian;


    /**
     * 景点位置
     */
    @TableField(value = "jingdian_address")

    private String jingdianAddress;


    /**
     * 景点注意事项
     */
    @TableField(value = "jingdian_zhuyishixiang")

    private String jingdianZhuyishixiang;


    /**
     * 景点类型
     */
    @TableField(value = "jingdian_types")

    private Integer jingdianTypes;


    /**
     * 景点门票原价
     */
    @TableField(value = "jingdian_old_money")

    private Double jingdianOldMoney;


    /**
     * 景点门票现价
     */
    @TableField(value = "jingdian_new_money")

    private Double jingdianNewMoney;


    /**
     * 景点热度
     */
    @TableField(value = "jingdian_clicknum")

    private Integer jingdianClicknum;


    /**
     * 景点介绍
     */
    @TableField(value = "jingdian_content")

    private String jingdianContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "jingdian_delete")

    private Integer jingdianDelete;


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
	 * 设置：景点名称
	 */
    public String getJingdianName() {
        return jingdianName;
    }
    /**
	 * 获取：景点名称
	 */

    public void setJingdianName(String jingdianName) {
        this.jingdianName = jingdianName;
    }
    /**
	 * 设置：景点编号
	 */
    public String getJingdianUuidNumber() {
        return jingdianUuidNumber;
    }
    /**
	 * 获取：景点编号
	 */

    public void setJingdianUuidNumber(String jingdianUuidNumber) {
        this.jingdianUuidNumber = jingdianUuidNumber;
    }
    /**
	 * 设置：景点照片
	 */
    public String getJingdianPhoto() {
        return jingdianPhoto;
    }
    /**
	 * 获取：景点照片
	 */

    public void setJingdianPhoto(String jingdianPhoto) {
        this.jingdianPhoto = jingdianPhoto;
    }
    /**
	 * 设置：景点特色
	 */
    public String getJingdianTese() {
        return jingdianTese;
    }
    /**
	 * 获取：景点特色
	 */

    public void setJingdianTese(String jingdianTese) {
        this.jingdianTese = jingdianTese;
    }
    /**
	 * 设置：景点游玩路线
	 */
    public String getJingdianLuxian() {
        return jingdianLuxian;
    }
    /**
	 * 获取：景点游玩路线
	 */

    public void setJingdianLuxian(String jingdianLuxian) {
        this.jingdianLuxian = jingdianLuxian;
    }
    /**
	 * 设置：景点位置
	 */
    public String getJingdianAddress() {
        return jingdianAddress;
    }
    /**
	 * 获取：景点位置
	 */

    public void setJingdianAddress(String jingdianAddress) {
        this.jingdianAddress = jingdianAddress;
    }
    /**
	 * 设置：景点注意事项
	 */
    public String getJingdianZhuyishixiang() {
        return jingdianZhuyishixiang;
    }
    /**
	 * 获取：景点注意事项
	 */

    public void setJingdianZhuyishixiang(String jingdianZhuyishixiang) {
        this.jingdianZhuyishixiang = jingdianZhuyishixiang;
    }
    /**
	 * 设置：景点类型
	 */
    public Integer getJingdianTypes() {
        return jingdianTypes;
    }
    /**
	 * 获取：景点类型
	 */

    public void setJingdianTypes(Integer jingdianTypes) {
        this.jingdianTypes = jingdianTypes;
    }
    /**
	 * 设置：景点门票原价
	 */
    public Double getJingdianOldMoney() {
        return jingdianOldMoney;
    }
    /**
	 * 获取：景点门票原价
	 */

    public void setJingdianOldMoney(Double jingdianOldMoney) {
        this.jingdianOldMoney = jingdianOldMoney;
    }
    /**
	 * 设置：景点门票现价
	 */
    public Double getJingdianNewMoney() {
        return jingdianNewMoney;
    }
    /**
	 * 获取：景点门票现价
	 */

    public void setJingdianNewMoney(Double jingdianNewMoney) {
        this.jingdianNewMoney = jingdianNewMoney;
    }
    /**
	 * 设置：景点热度
	 */
    public Integer getJingdianClicknum() {
        return jingdianClicknum;
    }
    /**
	 * 获取：景点热度
	 */

    public void setJingdianClicknum(Integer jingdianClicknum) {
        this.jingdianClicknum = jingdianClicknum;
    }
    /**
	 * 设置：景点介绍
	 */
    public String getJingdianContent() {
        return jingdianContent;
    }
    /**
	 * 获取：景点介绍
	 */

    public void setJingdianContent(String jingdianContent) {
        this.jingdianContent = jingdianContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getJingdianDelete() {
        return jingdianDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setJingdianDelete(Integer jingdianDelete) {
        this.jingdianDelete = jingdianDelete;
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
        return "Jingdian{" +
            "id=" + id +
            ", jingdianName=" + jingdianName +
            ", jingdianUuidNumber=" + jingdianUuidNumber +
            ", jingdianPhoto=" + jingdianPhoto +
            ", jingdianTese=" + jingdianTese +
            ", jingdianLuxian=" + jingdianLuxian +
            ", jingdianAddress=" + jingdianAddress +
            ", jingdianZhuyishixiang=" + jingdianZhuyishixiang +
            ", jingdianTypes=" + jingdianTypes +
            ", jingdianOldMoney=" + jingdianOldMoney +
            ", jingdianNewMoney=" + jingdianNewMoney +
            ", jingdianClicknum=" + jingdianClicknum +
            ", jingdianContent=" + jingdianContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", jingdianDelete=" + jingdianDelete +
            ", createTime=" + createTime +
        "}";
    }
}
