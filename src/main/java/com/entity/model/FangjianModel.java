package com.entity.model;

import com.entity.FangjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 房间
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FangjianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 房间名称
     */
    private String fangjianName;


    /**
     * 房间编号
     */
    private String fangjianUuidNumber;


    /**
     * 酒店名称
     */
    private String jiudianName;


    /**
     * 房间照片
     */
    private String fangjianPhoto;


    /**
     * 房间特色
     */
    private String fangjianTese;


    /**
     * 房间位置
     */
    private String fangjianAddress;


    /**
     * 房间类型
     */
    private Integer fangjianTypes;


    /**
     * 房间原价
     */
    private Double fangjianOldMoney;


    /**
     * 房间现价/天
     */
    private Double fangjianNewMoney;


    /**
     * 房间介绍
     */
    private String fangjianContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer fangjianDelete;


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
	 * 获取：房间名称
	 */
    public String getFangjianName() {
        return fangjianName;
    }


    /**
	 * 设置：房间名称
	 */
    public void setFangjianName(String fangjianName) {
        this.fangjianName = fangjianName;
    }
    /**
	 * 获取：房间编号
	 */
    public String getFangjianUuidNumber() {
        return fangjianUuidNumber;
    }


    /**
	 * 设置：房间编号
	 */
    public void setFangjianUuidNumber(String fangjianUuidNumber) {
        this.fangjianUuidNumber = fangjianUuidNumber;
    }
    /**
	 * 获取：酒店名称
	 */
    public String getJiudianName() {
        return jiudianName;
    }


    /**
	 * 设置：酒店名称
	 */
    public void setJiudianName(String jiudianName) {
        this.jiudianName = jiudianName;
    }
    /**
	 * 获取：房间照片
	 */
    public String getFangjianPhoto() {
        return fangjianPhoto;
    }


    /**
	 * 设置：房间照片
	 */
    public void setFangjianPhoto(String fangjianPhoto) {
        this.fangjianPhoto = fangjianPhoto;
    }
    /**
	 * 获取：房间特色
	 */
    public String getFangjianTese() {
        return fangjianTese;
    }


    /**
	 * 设置：房间特色
	 */
    public void setFangjianTese(String fangjianTese) {
        this.fangjianTese = fangjianTese;
    }
    /**
	 * 获取：房间位置
	 */
    public String getFangjianAddress() {
        return fangjianAddress;
    }


    /**
	 * 设置：房间位置
	 */
    public void setFangjianAddress(String fangjianAddress) {
        this.fangjianAddress = fangjianAddress;
    }
    /**
	 * 获取：房间类型
	 */
    public Integer getFangjianTypes() {
        return fangjianTypes;
    }


    /**
	 * 设置：房间类型
	 */
    public void setFangjianTypes(Integer fangjianTypes) {
        this.fangjianTypes = fangjianTypes;
    }
    /**
	 * 获取：房间原价
	 */
    public Double getFangjianOldMoney() {
        return fangjianOldMoney;
    }


    /**
	 * 设置：房间原价
	 */
    public void setFangjianOldMoney(Double fangjianOldMoney) {
        this.fangjianOldMoney = fangjianOldMoney;
    }
    /**
	 * 获取：房间现价/天
	 */
    public Double getFangjianNewMoney() {
        return fangjianNewMoney;
    }


    /**
	 * 设置：房间现价/天
	 */
    public void setFangjianNewMoney(Double fangjianNewMoney) {
        this.fangjianNewMoney = fangjianNewMoney;
    }
    /**
	 * 获取：房间介绍
	 */
    public String getFangjianContent() {
        return fangjianContent;
    }


    /**
	 * 设置：房间介绍
	 */
    public void setFangjianContent(String fangjianContent) {
        this.fangjianContent = fangjianContent;
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
    public Integer getFangjianDelete() {
        return fangjianDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setFangjianDelete(Integer fangjianDelete) {
        this.fangjianDelete = fangjianDelete;
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
