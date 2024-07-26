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
 * 旅游团
 *
 * @author 
 * @email
 */
@TableName("lvyoutuan")
public class LvyoutuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LvyoutuanEntity() {

	}

	public LvyoutuanEntity(T t) {
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
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 旅游团名称
     */
    @TableField(value = "lvyoutuan_name")

    private String lvyoutuanName;


    /**
     * 旅游团编号
     */
    @TableField(value = "lvyoutuan_uuid_number")

    private String lvyoutuanUuidNumber;


    /**
     * 旅游团照片
     */
    @TableField(value = "lvyoutuan_photo")

    private String lvyoutuanPhoto;


    /**
     * 旅行地点
     */
    @TableField(value = "lvyoutuan_lvxingdizhi")

    private String lvyoutuanLvxingdizhi;


    /**
     * 出行方式
     */
    @TableField(value = "youwanluxian_chuxingfangshi_types")

    private Integer youwanluxianChuxingfangshiTypes;


    /**
     * 旅游团类型
     */
    @TableField(value = "lvyoutuan_types")

    private Integer lvyoutuanTypes;


    /**
     * 最大参与人数
     */
    @TableField(value = "lvyoutuan_number")

    private Integer lvyoutuanNumber;


    /**
     * 旅游团热度
     */
    @TableField(value = "lvyoutuan_clicknum")

    private Integer lvyoutuanClicknum;


    /**
     * 旅游团详情
     */
    @TableField(value = "lvyoutuan_content")

    private String lvyoutuanContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "lvyoutuan_delete")

    private Integer lvyoutuanDelete;


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
	 * 设置：旅游团名称
	 */
    public String getLvyoutuanName() {
        return lvyoutuanName;
    }
    /**
	 * 获取：旅游团名称
	 */

    public void setLvyoutuanName(String lvyoutuanName) {
        this.lvyoutuanName = lvyoutuanName;
    }
    /**
	 * 设置：旅游团编号
	 */
    public String getLvyoutuanUuidNumber() {
        return lvyoutuanUuidNumber;
    }
    /**
	 * 获取：旅游团编号
	 */

    public void setLvyoutuanUuidNumber(String lvyoutuanUuidNumber) {
        this.lvyoutuanUuidNumber = lvyoutuanUuidNumber;
    }
    /**
	 * 设置：旅游团照片
	 */
    public String getLvyoutuanPhoto() {
        return lvyoutuanPhoto;
    }
    /**
	 * 获取：旅游团照片
	 */

    public void setLvyoutuanPhoto(String lvyoutuanPhoto) {
        this.lvyoutuanPhoto = lvyoutuanPhoto;
    }
    /**
	 * 设置：旅行地点
	 */
    public String getLvyoutuanLvxingdizhi() {
        return lvyoutuanLvxingdizhi;
    }
    /**
	 * 获取：旅行地点
	 */

    public void setLvyoutuanLvxingdizhi(String lvyoutuanLvxingdizhi) {
        this.lvyoutuanLvxingdizhi = lvyoutuanLvxingdizhi;
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
	 * 设置：旅游团类型
	 */
    public Integer getLvyoutuanTypes() {
        return lvyoutuanTypes;
    }
    /**
	 * 获取：旅游团类型
	 */

    public void setLvyoutuanTypes(Integer lvyoutuanTypes) {
        this.lvyoutuanTypes = lvyoutuanTypes;
    }
    /**
	 * 设置：最大参与人数
	 */
    public Integer getLvyoutuanNumber() {
        return lvyoutuanNumber;
    }
    /**
	 * 获取：最大参与人数
	 */

    public void setLvyoutuanNumber(Integer lvyoutuanNumber) {
        this.lvyoutuanNumber = lvyoutuanNumber;
    }
    /**
	 * 设置：旅游团热度
	 */
    public Integer getLvyoutuanClicknum() {
        return lvyoutuanClicknum;
    }
    /**
	 * 获取：旅游团热度
	 */

    public void setLvyoutuanClicknum(Integer lvyoutuanClicknum) {
        this.lvyoutuanClicknum = lvyoutuanClicknum;
    }
    /**
	 * 设置：旅游团详情
	 */
    public String getLvyoutuanContent() {
        return lvyoutuanContent;
    }
    /**
	 * 获取：旅游团详情
	 */

    public void setLvyoutuanContent(String lvyoutuanContent) {
        this.lvyoutuanContent = lvyoutuanContent;
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
    public Integer getLvyoutuanDelete() {
        return lvyoutuanDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setLvyoutuanDelete(Integer lvyoutuanDelete) {
        this.lvyoutuanDelete = lvyoutuanDelete;
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
        return "Lvyoutuan{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", lvyoutuanName=" + lvyoutuanName +
            ", lvyoutuanUuidNumber=" + lvyoutuanUuidNumber +
            ", lvyoutuanPhoto=" + lvyoutuanPhoto +
            ", lvyoutuanLvxingdizhi=" + lvyoutuanLvxingdizhi +
            ", youwanluxianChuxingfangshiTypes=" + youwanluxianChuxingfangshiTypes +
            ", lvyoutuanTypes=" + lvyoutuanTypes +
            ", lvyoutuanNumber=" + lvyoutuanNumber +
            ", lvyoutuanClicknum=" + lvyoutuanClicknum +
            ", lvyoutuanContent=" + lvyoutuanContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", lvyoutuanDelete=" + lvyoutuanDelete +
            ", createTime=" + createTime +
        "}";
    }
}
