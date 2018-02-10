/*
 * CompanyInfoMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.user.dao;


import com.transport.user.pojo.po.CompanyInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CompanyInfoMapper extends MapperBase<CompanyInfo> {

    @Select({"select * from company_info where company_id = #{companyId}"})
    CompanyInfo selectCompanInfo(@Param("companyId")Integer companyId);
}