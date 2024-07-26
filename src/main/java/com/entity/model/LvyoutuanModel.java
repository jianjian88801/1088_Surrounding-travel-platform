package com.entity.model;

import com.entity.LvyoutuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 旅游团
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LvyoutuanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 旅游团名称
     */
    private String lvyoutuanName;


    /**
     * 旅游团编号
     */
    private String lvyoutuanUuidNumber;


    /**
     * 旅游团照片
     */
    private String lvyoutuanPhoto;


    /**
     * 旅行地点
     */
    private String lvyoutuanLvxingdizhi;


    /**
     * 出行方式
     */
    private Integer youwanluxianChuxingfangshiTypes;


    /**
     * 旅游团类型
     */
    private Integer lvyoutuanTypes;


    /**
     * 最大参与人数
     */
    private Integer lvyoutuanNumber;


    /**
     * 旅游团热度
     */
    private Integer lvyoutuanClicknum;


    /**
     * 旅游团详情
     */
    private String lvyoutuanContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer lvyoutuanDelete;


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
	 * 获取：旅游团名称
	 */
    public String getLvyoutuanName() {
        return lvyoutuanName;
    }


    /**
	 * 设置：旅游团名称
	 */
    public void setLvyoutuanName(String lvyoutuanName) {
        this.lvyoutuanName = lvyoutuanName;
    }
    /**
	 * 获取：旅游团编号
	 */
    public String getLvyoutuanUuidNumber() {
        return lvyoutuanUuidNumber;
    }


    /**
	 * 设置：旅游团编号
	 */
    public void setLvyoutuanUuidNumber(String lvyoutuanUuidNumber) {
        this.lvyoutuanUuidNumber = lvyoutuanUuidNumber;
    }
    /**
	 * 获取：旅游团照片
	 */
    public String getLvyoutuanPhoto() {
        return lvyoutuanPhoto;
    }


    /**
	 * 设置：旅游团照片
	 */
    public void setLvyoutuanPhoto(String lvyoutuanPhoto) {
        this.lvyoutuanPhoto = lvyoutuanPhoto;
    }
    /**
	 * 获取：旅行地点
	 */
    public String getLvyoutuanLvxingdizhi() {
        return lvyoutuanLvxingdizhi;
    }


    /**
	 * 设置：旅行地点
	 */
    public void setLvyoutuanLvxingdizhi(String lvyoutuanLvxingdizhi) {
        this.lvyoutuanLvxingdizhi = lvyoutuanLvxingdizhi;
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
	 * 获取：旅游团类型
	 */
    public Integer getLvyoutuanTypes() {
        return lvyoutuanTypes;
    }


    /**
	 * 设置：旅游团类型
	 */
    public void setLvyoutuanTypes(Integer lvyoutuanTypes) {
        this.lvyoutuanTypes = lvyoutuanTypes;
    }
    /**
	 * 获取：最大参与人数
	 */
    public Integer getLvyoutuanNumber() {
        return lvyoutuanNumber;
    }


    /**
	 * 设置：最大参与人数
	 */
    public void setLvyoutuanNumber(Integer lvyoutuanNumber) {
        this.lvyoutuanNumber = lvyoutuanNumber;
    }
    /**
	 * 获取：旅游团热度
	 */
    public Integer getLvyoutuanClicknum() {
        return lvyoutuanClicknum;
    }


    /**
	 * 设置：旅游团热度
	 */
    public void setLvyoutuanClicknum(Integer lvyoutuanClicknum) {
        this.lvyoutuanClicknum = lvyoutuanClicknum;
    }
    /**
	 * 获取：旅游团详情
	 */
    public String getLvyoutuanContent() {
        return lvyoutuanContent;
    }


    /**
	 * 设置：旅游团详情
	 */
    public void setLvyoutuanContent(String lvyoutuanContent) {
        this.lvyoutuanContent = lvyoutuanContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getLvyoutuanDelete() {
        return lvyoutuanDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setLvyoutuanDelete(Integer lvyoutuanDelete) {
        this.lvyoutuanDelete = lvyoutuanDelete;
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
