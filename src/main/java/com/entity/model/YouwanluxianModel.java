package com.entity.model;

import com.entity.YouwanluxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 游玩路线
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YouwanluxianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 游玩路线名称
     */
    private String youwanluxianName;


    /**
     * 游玩路线编号
     */
    private String youwanluxianUuidNumber;


    /**
     * 游玩路线照片
     */
    private String youwanluxianPhoto;


    /**
     * 旅游方式
     */
    private Integer youwanluxianLvyoufangshiTypes;


    /**
     * 出发时间
     */
    private Integer youwanluxianChufashijianTypes;


    /**
     * 行程时间
     */
    private Integer youwanluxianXingchengNumber;


    /**
     * 出行方式
     */
    private Integer youwanluxianChuxingfangshiTypes;


    /**
     * 游玩路线热度
     */
    private Integer youwanluxianClicknum;


    /**
     * 游玩路线介绍
     */
    private String youwanluxianContent;


    /**
     * 逻辑删除
     */
    private Integer youwanluxianDelete;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：游玩路线名称
	 */
    public String getYouwanluxianName() {
        return youwanluxianName;
    }


    /**
	 * 设置：游玩路线名称
	 */
    public void setYouwanluxianName(String youwanluxianName) {
        this.youwanluxianName = youwanluxianName;
    }
    /**
	 * 获取：游玩路线编号
	 */
    public String getYouwanluxianUuidNumber() {
        return youwanluxianUuidNumber;
    }


    /**
	 * 设置：游玩路线编号
	 */
    public void setYouwanluxianUuidNumber(String youwanluxianUuidNumber) {
        this.youwanluxianUuidNumber = youwanluxianUuidNumber;
    }
    /**
	 * 获取：游玩路线照片
	 */
    public String getYouwanluxianPhoto() {
        return youwanluxianPhoto;
    }


    /**
	 * 设置：游玩路线照片
	 */
    public void setYouwanluxianPhoto(String youwanluxianPhoto) {
        this.youwanluxianPhoto = youwanluxianPhoto;
    }
    /**
	 * 获取：旅游方式
	 */
    public Integer getYouwanluxianLvyoufangshiTypes() {
        return youwanluxianLvyoufangshiTypes;
    }


    /**
	 * 设置：旅游方式
	 */
    public void setYouwanluxianLvyoufangshiTypes(Integer youwanluxianLvyoufangshiTypes) {
        this.youwanluxianLvyoufangshiTypes = youwanluxianLvyoufangshiTypes;
    }
    /**
	 * 获取：出发时间
	 */
    public Integer getYouwanluxianChufashijianTypes() {
        return youwanluxianChufashijianTypes;
    }


    /**
	 * 设置：出发时间
	 */
    public void setYouwanluxianChufashijianTypes(Integer youwanluxianChufashijianTypes) {
        this.youwanluxianChufashijianTypes = youwanluxianChufashijianTypes;
    }
    /**
	 * 获取：行程时间
	 */
    public Integer getYouwanluxianXingchengNumber() {
        return youwanluxianXingchengNumber;
    }


    /**
	 * 设置：行程时间
	 */
    public void setYouwanluxianXingchengNumber(Integer youwanluxianXingchengNumber) {
        this.youwanluxianXingchengNumber = youwanluxianXingchengNumber;
    }
    /**
	 * 获取：出行方式
	 */
    public Integer getYouwanluxianChuxingfangshiTypes() {
        return youwanluxianChuxingfangshiTypes;
    }


    /**
	 * 设置：出行方式
	 */
    public void setYouwanluxianChuxingfangshiTypes(Integer youwanluxianChuxingfangshiTypes) {
        this.youwanluxianChuxingfangshiTypes = youwanluxianChuxingfangshiTypes;
    }
    /**
	 * 获取：游玩路线热度
	 */
    public Integer getYouwanluxianClicknum() {
        return youwanluxianClicknum;
    }


    /**
	 * 设置：游玩路线热度
	 */
    public void setYouwanluxianClicknum(Integer youwanluxianClicknum) {
        this.youwanluxianClicknum = youwanluxianClicknum;
    }
    /**
	 * 获取：游玩路线介绍
	 */
    public String getYouwanluxianContent() {
        return youwanluxianContent;
    }


    /**
	 * 设置：游玩路线介绍
	 */
    public void setYouwanluxianContent(String youwanluxianContent) {
        this.youwanluxianContent = youwanluxianContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getYouwanluxianDelete() {
        return youwanluxianDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setYouwanluxianDelete(Integer youwanluxianDelete) {
        this.youwanluxianDelete = youwanluxianDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
