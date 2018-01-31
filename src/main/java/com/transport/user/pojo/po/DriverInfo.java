/*
 * DriverInfo.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.user.pojo.po;

/**
 * 开车司机
 * 
 * @author 
 * @version 1.0 2017-05-30
 */
public class DriverInfo {

    //编号
    private Integer driverId;
    //司机名字
    private String driverName;
    //司机手机号
    private String driverPhone;
    //司机年龄
    private Integer driverAge;
    //驾驶A本以上时间
    private Integer vehicleAge;
    //驾驶级别，有没有A本
    private String drivingLevel;
    //之前有没有开过危险品
    private Integer dengerousPermit;
    //经验
    private Integer experince;
    //家庭住址
    private String homeAddress;
    //工作距离
    private String workingDistance;

    public Integer getDriverId() {
        return driverId;
    }
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }
    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }
    public String getDriverPhone() {
        return driverPhone;
    }
    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone == null ? null : driverPhone.trim();
    }
    public Integer getDriverAge() {
        return driverAge;
    }
    public void setDriverAge(Integer driverAge) {
        this.driverAge = driverAge;
    }
    public Integer getVehicleAge() {
        return vehicleAge;
    }
    public void setVehicleAge(Integer vehicleAge) {
        this.vehicleAge = vehicleAge;
    }
    public String getDrivingLevel() {
        return drivingLevel;
    }
    public void setDrivingLevel(String drivingLevel) {
        this.drivingLevel = drivingLevel == null ? null : drivingLevel.trim();
    }
    public Integer getDengerousPermit() {
        return dengerousPermit;
    }
    public void setDengerousPermit(Integer dengerousPermit) {
        this.dengerousPermit = dengerousPermit;
    }
    public Integer getExperince() {
        return experince;
    }
    public void setExperince(Integer experince) {
        this.experince = experince;
    }
    public String getHomeAddress() {
        return homeAddress;
    }
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }
    public String getWorkingDistance() {
        return workingDistance;
    }
    public void setWorkingDistance(String workingDistance) {
        this.workingDistance = workingDistance == null ? null : workingDistance.trim();
    }
}