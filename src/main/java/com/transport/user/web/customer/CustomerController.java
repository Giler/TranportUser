package com.transport.user.web.customer;


import com.transport.user.pojo.po.CustomerInfo;
import com.transport.user.pojo.vo.ResultData;
import com.transport.user.service.CustomerInfoService;
import com.transport.user.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController extends BaseController{

    @Autowired
    CustomerInfoService customerInfoService;

    @GetMapping("/customer/getList")
    public ResultData getCustomerList(CustomerInfo customerInfo){
        ResultData resultData = null;
        List<CustomerInfo> customerInfos = customerInfoService.selectObjectList(customerInfo);
        resultData.succ(customerInfos);
        return resultData;
    }

}
