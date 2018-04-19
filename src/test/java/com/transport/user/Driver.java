package com.transport.user;

import com.transport.user.pojo.po.DriverInfo;
import com.transport.user.service.DriverInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Driver extends Base{

    @Autowired
    DriverInfoService driverInfoService;

    @Test
    public void driverSelectAll(){
        List<DriverInfo> driverInfoList = driverInfoService.getSelectAll();
    }

    @Test
    public void updateDriverByName(){
        int result = driverInfoService.updateByDriverName("管","杜 ");

        System.out.println(result==1?"更新成功":"更新失败");
    }
    @Test
    public void updateDriverById(){
        int result = driverInfoService.updateByDriverName(6,"杜dsb");

        System.out.println(result==1?"更新成功":"更新失败");
    }


}
