/*
 * DriverInfoMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.user.dao;

import com.transport.user.pojo.po.DriverInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface DriverInfoMapper extends MapperBase<DriverInfo> {

    @Select({"SELECT * FROM t_driver_info"})
    List<DriverInfo> selectAll();

    Integer updateDriverName(@Param("driverId")Integer driverId,
                             @Param("driverName")String driverName);

    Integer updateDriverName(Map<String,Object> map);
}