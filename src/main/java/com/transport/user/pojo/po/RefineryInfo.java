/*
 * RefineryInfo.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.user.pojo.po;

import java.util.Date;

/**
 * 炼油厂基本信息
 * 
 * @author 
 * @version 1.0 2017-05-30
 */
public class RefineryInfo {

    //炼油厂编码
    private Integer refineryId;
    //炼油厂具体地址
    private String location;
    //炼油厂添加时间
    private Date createTime;
    //添加此炼油厂的人，用户外键（不是客户）
    private Integer creator;
    //炼油厂所在省份
    private Integer province;
    //炼油厂所在城市
    private Integer city;
    //炼油厂名称
    private String refineryName;
    //根据其判断是否显示或删除
    private Integer invoice;
    //消耗量除以间隔时间
    private Integer state;
    //根据外界因素手动输入修正速率，有正负之分
    private Integer pushInfo;
    //本次消耗速率较上次增减率
    private Integer officialOffer;
    //炼油厂官方网址
    private String website;

    public Integer getRefineryId() {
        return refineryId;
    }
    public void setRefineryId(Integer refineryId) {
        this.refineryId = refineryId;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Integer getCreator() {
        return creator;
    }
    public void setCreator(Integer creator) {
        this.creator = creator;
    }
    public Integer getProvince() {
        return province;
    }
    public void setProvince(Integer province) {
        this.province = province;
    }
    public Integer getCity() {
        return city;
    }
    public void setCity(Integer city) {
        this.city = city;
    }
    public String getRefineryName() {
        return refineryName;
    }
    public void setRefineryName(String refineryName) {
        this.refineryName = refineryName == null ? null : refineryName.trim();
    }
    public Integer getInvoice() {
        return invoice;
    }
    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }
    public Integer getState() {
        return state;
    }
    public void setState(Integer state) {
        this.state = state;
    }
    public Integer getPushInfo() {
        return pushInfo;
    }
    public void setPushInfo(Integer pushInfo) {
        this.pushInfo = pushInfo;
    }
    public Integer getOfficialOffer() {
        return officialOffer;
    }
    public void setOfficialOffer(Integer officialOffer) {
        this.officialOffer = officialOffer;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }
}