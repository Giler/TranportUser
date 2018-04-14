/*
 * CustomerInfoMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.user.dao;


import com.transport.user.pojo.po.CustomerInfo;
import org.apache.ibatis.annotations.Select;


public interface CustomerInfoMapper extends MapperBase<CustomerInfo> {
    String QUERY_ITEM = " customer_id, customer_name, customer_age, customer_phone, customer_address, create_time, creator";
}