package com.transport.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.transport.user.dao.CompanyInfoMapper;
import com.transport.user.dao.CustomerInfoMapper;
import com.transport.user.pojo.po.CompanyInfo;
import com.transport.user.pojo.po.CustomerInfo;
import com.transport.user.pojo.po.Users;
import com.transport.user.service.CustomerInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class CustomerInfoServiceImpl extends BaseServiceImpl<CustomerInfo> implements CustomerInfoService {

    @Autowired
    private CustomerInfoMapper customerInfoMapper;
    @Autowired
    private CompanyInfoMapper companyInfoMapper;

    @Override
    @Transactional(rollbackFor = { RuntimeException.class, Exception.class })
    public CustomerInfo getCustomerInfoByID(Integer customerId) {
        CustomerInfo customerInfo = customerInfoMapper.selectByPrimaryKey(customerId);
        log.info("输出日志 #customerInfo:{} #customerInfo{}",customerInfo.toString(), JSON.toJSONString(customerInfo));
        return customerInfo;
    }

    @Override
    public PageInfo<CustomerInfo> getCustomerInfoByIDList(Integer pageNum, Integer pageSize, CustomerInfo customerInfo) {
        log.info("查询客户信息 传入参数 pageNum:{},pageSize:{},customerInfo:{}",pageNum,pageSize,customerInfo);
        PageHelper.startPage(pageNum, pageSize);
        List<CustomerInfo> customerInfos = customerInfoMapper.selectObjectList(customerInfo);
        PageInfo<CustomerInfo> customerInfoPageInfo = new PageInfo<CustomerInfo>(customerInfos);
        log.info("查询客户信息 返回数据CustomerPageInfo:{}",customerInfoPageInfo);
        return customerInfoPageInfo;
    }

    public void test() {
        companyInfoMapper.selectCompanInfo(1);

        Users user = new Users();
        Users user2 = Users.builder().age("123").userName("456").build();
        System.out.print(user.toString());

    }

}
