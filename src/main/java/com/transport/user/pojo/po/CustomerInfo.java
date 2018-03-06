/*
 * CustomerInfo.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.user.pojo.po;

import lombok.*;

import java.util.Date;

/**
 * 存储客户基本信息
 * 
 * @author 
 * @version 1.0 2017-05-30
 */
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerInfo {

    //客户编号
    private Integer customerId;
    //客户姓名
    private String customerName;
    //客户年龄
    private Integer customerAge;
    //客户手机号
    private String customerPhone;
    //客户地址
    private String customerAddress;
    //数据创建时间
    private Date createTime;
    //数据创建人
    private Integer creator;

	@Override
	public String toString() {
		return "CustomerInfo [customerId=" + customerId + ", customerName="
				+ customerName + ", customerAge=" + customerAge
				+ ", customerPhone=" + customerPhone + ", customerAddress="
				+ customerAddress + ", createTime=" + createTime + ", creator="
				+ creator + "]";
	}
    
}