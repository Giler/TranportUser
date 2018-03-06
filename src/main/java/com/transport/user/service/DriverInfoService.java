package com.transport.user.service;

import com.transport.user.pojo.po.DriverInfo;

import java.util.List;
import java.util.Map;

public interface DriverInfoService extends BaseService<DriverInfo>{
    // 检索DriverInfo的全部数据
    List<DriverInfo> getSelectAll();
    Integer updateByDriverName(String driverNameOld,String driverNameNew);
    Integer updateByDriverName(Integer driverId,String driverName);
}
