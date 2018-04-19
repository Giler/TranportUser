package com.transport.user.service;


import com.github.pagehelper.PageInfo;
import com.transport.user.pojo.po.CustomerInfo;

public interface CustomerInfoService extends BaseService<CustomerInfo> {
    //根据ID获取客户内容
    CustomerInfo getCustomerInfoByID(Integer customerId);
    // 分页获取用户信息
    PageInfo<CustomerInfo>  getCustomerInfoByIDList(Integer pageNum,Integer pageSize, CustomerInfo customerInfo);
}
