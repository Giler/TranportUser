package com.transport.user.web;

import com.transport.user.pojo.po.DriverInfo;
import com.transport.user.service.DriverInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Spring Boot HelloWorld 案例
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
public class HelloWorldController {

    @Autowired
    DriverInfoService driverInfoService;

    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!123456";
    }

    @RequestMapping(value = "/getLsit", method = RequestMethod.GET)
    public List<DriverInfo> getList(){ return driverInfoService.getSelectAll(); }

    @GetMapping(value = "/updateDriver")
    public int updataDriver(@RequestParam("id")Integer id,
                            @RequestParam("driverName")String driverName){
        driverInfoService.updateByDriverName(id,driverName);
        return 0;
    }
    @PostMapping("/insertDriver")
    public void insertDriver(DriverInfo driverInfo){

    }
}
