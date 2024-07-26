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
 * 游玩路线
 *
 * @author 
 * @email
 */
@TableName("youwanluxian")
public class YouwanluxianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YouwanluxianEntity() {

	}

	public YouwanluxianEntity(T t) {
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
     * 游玩路线名称
     */
    @TableField(value = "youwanluxian_name")

    private String youwanluxianName;


    /**
     * 游玩路线编号
     */
    @TableField(value = "youwanluxian_uuid_number")

    private String youwanluxianUuidNumber;


    /**
     * 游玩路线照片
     */
    @TableField(value = "youwanluxian_photo")

    private String youwanluxianPhoto;


    /**
     * 旅游方式
     */
    @TableField(value = "youwanluxian_lvyoufangshi_types")

    private Integer youwanluxianLvyoufangshiTypes;


    /**
     * 出发时间
     */
    @TableField(value = "youwanluxian_chufashijian_types")

    private Integer youwanluxianChufashijianTypes;


    /**
     * 行程时间
     */
    @TableField(value = "youwanluxian_xingcheng_number")

    private Integer youwanluxianXingchengNumber;


    /**
     * 出行方式
     */
    @TableField(value = "youwanluxian_chuxingfangshi_types")

    private Integer youwanluxianChuxingfangshiTypes;


    /**
     * 游玩路线热度
     */
    @TableField(value = "youwanluxian_clicknum")

    private Integer youwanluxianClicknum;


    /**
     * 游玩路线介绍
     */
    @TableField(value = "youwanluxian_content")

    private String youwanluxianContent;


    /**
     * 逻辑删除
     */
    @TableField(value = "youwanluxian_delete")

    private Integer youwanluxianDelete;


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
	 * 设置：游玩路线名称
	 */
    public String getYouwanluxianName() {
        return youwanluxianName;
    }
    /**
	 * 获取：游玩路线名称
	 */

    public void setYouwanluxianName(String youwanluxianName) {
        this.youwanluxianName = youwanluxianName;
    }
    /**
	 * 设置：游玩路线编号
	 */
    public String getYouwanluxianUuidNumber() {
        return youwanluxianUuidNumber;
    }
    /**
	 * 获取：游玩路线编号
	 */

    public void setYouwanluxianUuidNumber(String youwanluxianUuidNumber) {
        this.youwanluxianUuidNumber = youwanluxianUuidNumber;
    }
    /**
	 * 设置：游玩路线照片
	 */
    public String getYouwanluxianPhoto() {
        return youwanluxianPhoto;
    }
    /**
	 * 获取：游玩路线照片
	 */

    public void setYouwanluxianPhoto(String youwanluxianPhoto) {
        this.youwanluxianPhoto = youwanluxianPhoto;
    }
    /**
	 * 设置：旅游方式
	 */
    public Integer getYouwanluxianLvyoufangshiTypes() {
        return youwanluxianLvyoufangshiTypes;
    }
    /**
	 * 获取：旅游方式
	 */

    public void setYouwanluxianLvyoufangshiTypes(Integer youwanluxianLvyoufangshiTypes) {
        this.youwanluxianLvyoufangshiTypes = youwanluxianLvyoufangshiTypes;
    }
    /**
	 * 设置：出发时间
	 */
    public Integer getYouwanluxianChufashijianTypes() {
        return youwanluxianChufashijianTypes;
    }
    /**
	 * 获取：出发时间
	 */

    public void setYouwanluxianChufashijianTypes(Integer youwanluxianChufashijianTypes) {
        this.youwanluxianChufashijianTypes = youwanluxianChufashijianTypes;
    }
    /**
	 * 设置：行程时间
	 */
    public Integer getYouwanluxianXingchengNumber() {
        return youwanluxianXingchengNumber;
    }
    /**
	 * 获取：行程时间
	 */

    public void setYouwanluxianXingchengNumber(Integer youwanluxianXingchengNumber) {
        this.youwanluxianXingchengNumber = youwanluxianXingchengNumber;
    }
    /**
	 * 设置：出行方式
	 */
    public Integer getYouwanluxianChuxingfangshiTypes() {
        return youwanluxianChuxingfangshiTypes;
    }
    /**
	 * 获取：出行方式
	 */

    public void setYouwanluxianChuxingfangshiTypes(Integer youwanluxianChuxingfangshiTypes) {
        this.youwanluxianChuxingfangshiTypes = youwanluxianChuxingfangshiTypes;
    }
    /**
	 * 设置：游玩路线热度
	 */
    public Integer getYouwanluxianClicknum() {
        return youwanluxianClicknum;
    }
    /**
	 * 获取：游玩路线热度
	 */

    public void setYouwanluxianClicknum(Integer youwanluxianClicknum) {
        this.youwanluxianClicknum = youwanluxianClicknum;
    }
    /**
	 * 设置：游玩路线介绍
	 */
    public String getYouwanluxianContent() {
        return youwanluxianContent;
    }
    /**
	 * 获取：游玩路线介绍
	 */

    public void setYouwanluxianContent(String youwanluxianContent) {
        this.youwanluxianContent = youwanluxianContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getYouwanluxianDelete() {
        return youwanluxianDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setYouwanluxianDelete(Integer youwanluxianDelete) {
        this.youwanluxianDelete = youwanluxianDelete;
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
        return "Youwanluxian{" +
            "id=" + id +
            ", youwanluxianName=" + youwanluxianName +
            ", youwanluxianUuidNumber=" + youwanluxianUuidNumber +
            ", youwanluxianPhoto=" + youwanluxianPhoto +
            ", youwanluxianLvyoufangshiTypes=" + youwanluxianLvyoufangshiTypes +
            ", youwanluxianChufashijianTypes=" + youwanluxianChufashijianTypes +
            ", youwanluxianXingchengNumber=" + youwanluxianXingchengNumber +
            ", youwanluxianChuxingfangshiTypes=" + youwanluxianChuxingfangshiTypes +
            ", youwanluxianClicknum=" + youwanluxianClicknum +
            ", youwanluxianContent=" + youwanluxianContent +
            ", youwanluxianDelete=" + youwanluxianDelete +
            ", createTime=" + createTime +
        "}";
    }
}
