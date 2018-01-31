/*
 * CompanyInfo.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.user.pojo.po;

import java.util.Date;

/**
 * 公司表
 * 
 * @author 
 * @version 1.0 2017-05-30
 */
public class CompanyInfo {

    //编号
    private Integer companyId;
    //公司所属人，客户外键
    private Integer customer;
    //公司名称
    private String companyName;
    //创建时间
    private Date createTime;
    private Integer creator;
    //公司所在地
    private String companyAddress;
    //公司类型（1公立、2私人）
    private Integer companyType;
    //公司所有油罐的容纳量总和
    private Double accommodateQuantity;
    //当前所有油罐的油量总和
    private Double currentVolume;
    //手动设置的油量提醒值
    private Double reminderVolume;
    //根据其判断是否可用
    private Integer status;

    public Integer getCompanyId() {
        return companyId;
    }
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
    public Integer getCustomer() {
        return customer;
    }
    public void setCustomer(Integer customer) {
        this.customer = customer;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
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
    public String getCompanyAddress() {
        return companyAddress;
    }
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }
    public Integer getCompanyType() {
        return companyType;
    }
    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }
    public Double getAccommodateQuantity() {
        return accommodateQuantity;
    }
    public void setAccommodateQuantity(Double accommodateQuantity) {
        this.accommodateQuantity = accommodateQuantity;
    }
    public Double getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(Double currentVolume) {
        this.currentVolume = currentVolume;
    }
    public Double getReminderVolume() {
        return reminderVolume;
    }
    public void setReminderVolume(Double reminderVolume) {
        this.reminderVolume = reminderVolume;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
}