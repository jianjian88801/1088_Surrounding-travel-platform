package com.entity.vo;

import com.entity.YouwanluxianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 游玩路线
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("youwanluxian")
public class YouwanluxianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
