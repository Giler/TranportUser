package com.transport.user.service;


import com.transport.user.pojo.po.CustomerInfo;

public interface CustomerInfoService extends BaseService<CustomerInfo> {
    //根据ID获取客户内容
    CustomerInfo getCustomerInfoByID(Integer customerId);
}
