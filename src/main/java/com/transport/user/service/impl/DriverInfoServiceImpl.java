package com.transport.user.service.impl;

import com.transport.user.dao.DriverInfoMapper;
import com.transport.user.pojo.po.DriverInfo;
import com.transport.user.service.DriverInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class DriverInfoServiceImpl extends BaseServiceImpl<DriverInfo> implements DriverInfoService {
    @Autowired
    DriverInfoMapper driverInfoMapper;

    @Override
    public List<DriverInfo> getSelectAll() {
        List<DriverInfo> driverInfoList = driverInfoMapper.selectAll();
        log.info("查询全部司机 #返回值：{}", driverInfoList.toString());
        return driverInfoList;
    }

    @Override
    public Integer updateByDriverName(String driverNameOld, String driverNameNew) {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("driverNameOld", driverNameOld);
        map.put("driverNameNew", driverNameNew);

        log.info("更新司机姓名信息 #传入参数 driverNameOld: {} , driverNameNew: {}", driverNameOld, driverNameNew);
        return driverInfoMapper.updateDriverName(map);
    }

    @Override
    public Integer updateByDriverName(Integer driverNameId, String driverName) {

        log.info("更新司机姓名信息 #传入参数 driverNameId: {} , driverName: {}", driverNameId, driverName);
        return driverInfoMapper.updateDriverName(driverNameId, driverName);
    }
}
