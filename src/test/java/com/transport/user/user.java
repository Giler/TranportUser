package com.transport.user;

import com.transport.user.pojo.po.CustomerInfo;
import com.transport.user.service.CustomerInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class user {
    @Autowired
    CustomerInfoService customerInfoService;

    @Test
    public void showuUser(){
        Integer customerId = 1;
        CustomerInfo customerInfo = customerInfoService.getObjectById(customerId);
        System.out.print(customerInfo);
    }
}
