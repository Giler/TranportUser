/*
 * OilPrice.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.user.pojo.po;

import java.util.Date;

/**
 * 油品不同时间的价格
 * 
 * @author 
 * @version 1.0 2017-05-30
 */
public class OilPrice {

    //油品价格编号
    private Integer oilPriceId;
    //油品外键
    private Integer oil;
    //当前油品价格
    private Long currentPrice;
    //油品价格实际更新时间
    private Date updateTime;
    //本次数据录入时间
    private Date createTime;
    //创建这条数据的人
    private Integer creator;
    //原始价格
    private Integer sourcePrice;

    public Integer getOilPriceId() {
        return oilPriceId;
    }
    public void setOilPriceId(Integer oilPriceId) {
        this.oilPriceId = oilPriceId;
    }
    public Integer getOil() {
        return oil;
    }
    public void setOil(Integer oil) {
        this.oil = oil;
    }
    public Long getCurrentPrice() {
        return currentPrice;
    }
    public void setCurrentPrice(Long currentPrice) {
        this.currentPrice = currentPrice;
    }
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
    public Integer getSourcePrice() {
        return sourcePrice;
    }
    public void setSourcePrice(Integer sourcePrice) {
        this.sourcePrice = sourcePrice;
    }
}