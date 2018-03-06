package com.transport.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.transport.user.dao.CompanyInfoMapper;
import com.transport.user.dao.CustomerInfoMapper;
import com.transport.user.pojo.po.CompanyInfo;
import com.transport.user.pojo.po.CustomerInfo;
import com.transport.user.pojo.po.Users;
import com.transport.user.service.CustomerInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerInfoServiceImpl extends BaseServiceImpl<CustomerInfo> implements CustomerInfoService {

    @Autowired
    private CustomerInfoMapper customerInfoMapper;
    @Autowired
    private CompanyInfoMapper companyInfoMapper;

    @Override
    public CustomerInfo getCustomerInfoByID(Integer customerId) {
        CustomerInfo customerInfo = customerInfoMapper.selectByPrimaryKey(customerId);
        log.info("输出日志 #customerInfo:{} #customerInfo{}",customerInfo.toString(), JSON.toJSONString(customerInfo));
        return customerInfo;
    }


    public void test() {
        companyInfoMapper.selectCompanInfo(1);

        Users user = new Users();
        Users user2 = Users.builder().age("123").userName("456").build();
        System.out.print(user.toString());

    }

}
