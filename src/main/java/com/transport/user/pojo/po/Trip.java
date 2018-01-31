/*
 * Trip.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.user.pojo.po;

import java.util.Date;

/**
 * 一次行程
 * 
 * @author 
 * @version 1.0 2017-05-30
 */
public class Trip {

    //编号
    private Integer tripId;
    //司机外键
    private Integer driver;
    //运输车外键
    private Integer truck;
    //中介外键
    private Integer intermediary;
    //炼油厂外键
    private Integer refinery;
    //油品外键
    private Integer oil;
    //本次运输吨数
    private Double tonnage;
    //每吨油单价
    private Long oilUnitPrice;
    //总价
    private Long total;
    //运输每吨单价
    private Long freightUnitPrice;
    //运输总价
    private Long freight;
    //本次总费用
    private Long roadToll;
    private Date departureTime;
    private Date backTime;
    //押运人外键（司机）
    private Integer escort;

    public Integer getTripId() {
        return tripId;
    }
    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }
    public Integer getDriver() {
        return driver;
    }
    public void setDriver(Integer driver) {
        this.driver = driver;
    }
    public Integer getTruck() {
        return truck;
    }
    public void setTruck(Integer truck) {
        this.truck = truck;
    }
    public Integer getIntermediary() {
        return intermediary;
    }
    public void setIntermediary(Integer intermediary) {
        this.intermediary = intermediary;
    }
    public Integer getRefinery() {
        return refinery;
    }
    public void setRefinery(Integer refinery) {
        this.refinery = refinery;
    }
    public Integer getOil() {
        return oil;
    }
    public void setOil(Integer oil) {
        this.oil = oil;
    }
    public Double getTonnage() {
        return tonnage;
    }
    public void setTonnage(Double tonnage) {
        this.tonnage = tonnage;
    }
    public Long getOilUnitPrice() {
        return oilUnitPrice;
    }
    public void setOilUnitPrice(Long oilUnitPrice) {
        this.oilUnitPrice = oilUnitPrice;
    }
    public Long getTotal() {
        return total;
    }
    public void setTotal(Long total) {
        this.total = total;
    }
    public Long getFreightUnitPrice() {
        return freightUnitPrice;
    }
    public void setFreightUnitPrice(Long freightUnitPrice) {
        this.freightUnitPrice = freightUnitPrice;
    }
    public Long getFreight() {
        return freight;
    }
    public void setFreight(Long freight) {
        this.freight = freight;
    }
    public Long getRoadToll() {
        return roadToll;
    }
    public void setRoadToll(Long roadToll) {
        this.roadToll = roadToll;
    }
    public Date getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
    public Date getBackTime() {
        return backTime;
    }
    public void setBackTime(Date backTime) {
        this.backTime = backTime;
    }
    public Integer getEscort() {
        return escort;
    }
    public void setEscort(Integer escort) {
        this.escort = escort;
    }
}