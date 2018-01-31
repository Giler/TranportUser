package com.transport.user.service.impl;

import com.transport.user.dao.CustomerInfoMapper;
import com.transport.user.pojo.po.CustomerInfo;
import com.transport.user.service.CustomerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CustomerInfoServiceImpl extends BaseServiceImpl<CustomerInfo> implements CustomerInfoService {
	
	@Autowired
	private CustomerInfoMapper customerInfoMapper;
	
	@Override
	public CustomerInfo getCustomerInfoByID(Integer customerId) {
		CustomerInfo customerInfo = customerInfoMapper.selectByPrimaryKey(customerId);
		return customerInfo;
	}

}
