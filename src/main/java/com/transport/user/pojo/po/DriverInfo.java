/*
 * DriverInfo.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.user.pojo.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 开车司机
 * 
 * @author 
 * @version 1.0 2017-05-30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

}