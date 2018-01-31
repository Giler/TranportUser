/*
 * TruckInfo.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.user.pojo.po;

import java.util.Date;

/**
 * 运输车辆基本信息
 * 
 * @author 
 * @version 1.0 2017-05-30
 */
public class TruckInfo {
    //编号
    private Integer truckId;
    //车牌号
    private String truckLicensePlateNumber;
    //上次审核日期
    private Date truckLastAuditDate;
    //下次审核日期
    private Date truckNextAuditDate;
    //吨位，车辆本身重量
    private Double tonnage;
    //载重，标准可载重量
    private Double truckLoad;
    //车轮数
    private Integer wheels;
    //车皮种类（铝皮，铁皮，保温）
    private Integer truckWagonType;
    private Double mileage;

    public Integer getTruckId() {
        return truckId;
    }
    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }
    public String getTruckLicensePlateNumber() {
        return truckLicensePlateNumber;
    }
    public void setTruckLicensePlateNumber(String truckLicensePlateNumber) {
        this.truckLicensePlateNumber = truckLicensePlateNumber == null ? null : truckLicensePlateNumber.trim();
    }
    public Date getTruckLastAuditDate() {
        return truckLastAuditDate;
    }
    public void setTruckLastAuditDate(Date truckLastAuditDate) {
        this.truckLastAuditDate = truckLastAuditDate;
    }
    public Date getTruckNextAuditDate() {
        return truckNextAuditDate;
    }
    public void setTruckNextAuditDate(Date truckNextAuditDate) {
        this.truckNextAuditDate = truckNextAuditDate;
    }
    public Double getTonnage() {
        return tonnage;
    }
    public void setTonnage(Double tonnage) {
        this.tonnage = tonnage;
    }
    public Double getTruckLoad() {
        return truckLoad;
    }
    public void setTruckLoad(Double truckLoad) {
        this.truckLoad = truckLoad;
    }
    public Integer getWheels() {
        return wheels;
    }
    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }
    public Integer getTruckWagonType() {
        return truckWagonType;
    }
    public void setTruckWagonType(Integer truckWagonType) {
        this.truckWagonType = truckWagonType;
    }
    public Double getMileage() {
        return mileage;
    }
    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }
}