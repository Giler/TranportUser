/*
 * TankInfo.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.user.pojo.po;

import java.util.Date;

/**
 * 油罐的基本信息
 * 
 * @author 
 * @version 1.0 2017-05-30
 */
public class TankInfo {

    //编号
    private Integer tankId;
    //所属公司
    private Integer company;
    //油罐地点
    private Integer tankAddress;
    //所属人
    private Integer customer;
    //添加油罐时间
    private Date createTime;
    //油量少于本值的时候进行提醒
    private Double reminderOil;
    //此油罐是否可用
    private Integer available;
    //容量
    private Double capacity;
    //类型，汽油柴油或者分时使用
    private Integer tankType;

    public Integer getTankId() {
        return tankId;
    }
    public void setTankId(Integer tankId) {
        this.tankId = tankId;
    }
    public Integer getCompany() {
        return company;
    }
    public void setCompany(Integer company) {
        this.company = company;
    }
    public Integer getTankAddress() {
        return tankAddress;
    }
    public void setTankAddress(Integer tankAddress) {
        this.tankAddress = tankAddress;
    }
    public Integer getCustomer() {
        return customer;
    }
    public void setCustomer(Integer customer) {
        this.customer = customer;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Double getReminderOil() {
        return reminderOil;
    }
    public void setReminderOil(Double reminderOil) {
        this.reminderOil = reminderOil;
    }
    public Integer getAvailable() {
        return available;
    }
    public void setAvailable(Integer available) {
        this.available = available;
    }
    public Double getCapacity() {
        return capacity;
    }
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }
    public Integer getTankType() {
        return tankType;
    }
    public void setTankType(Integer tankType) {
        this.tankType = tankType;
    }
}