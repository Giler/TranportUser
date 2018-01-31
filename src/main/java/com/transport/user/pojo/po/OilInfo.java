/*
 * OilInfo.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.user.pojo.po;

import java.util.Date;

/**
 * 油品的基本信息
 * 
 * @author 
 * @version 1.0 2017-05-30
 */
public class OilInfo {

    //编号
    private Integer oilId;
    //对应的炼油厂
    private Integer refinery;
    //常量外键 由代号确定。
    private String oilLevel;
    //增量変动外键
    private Integer oilType;
    //油品颜色
    private String colour;
    //油品密度
    private Double density;
    //样品图的存放路径
    private String sample;
    //创建时间
    private Date createTime;

    public Integer getOilId() {
        return oilId;
    }
    public void setOilId(Integer oilId) {
        this.oilId = oilId;
    }
    public Integer getRefinery() {
        return refinery;
    }
    public void setRefinery(Integer refinery) {
        this.refinery = refinery;
    }
    public String getOilLevel() {
        return oilLevel;
    }
    public void setOilLevel(String oilLevel) {
        this.oilLevel = oilLevel == null ? null : oilLevel.trim();
    }
    public Integer getOilType() {
        return oilType;
    }
    public void setOilType(Integer oilType) {
        this.oilType = oilType;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour == null ? null : colour.trim();
    }
    public Double getDensity() {
        return density;
    }
    public void setDensity(Double density) {
        this.density = density;
    }
    public String getSample() {
        return sample;
    }
    public void setSample(String sample) {
        this.sample = sample == null ? null : sample.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}