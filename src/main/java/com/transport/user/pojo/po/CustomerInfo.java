/*
 * CustomerInfo.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.user.pojo.po;

import java.util.Date;

/**
 * 存储客户基本信息
 * 
 * @author 
 * @version 1.0 2017-05-30
 */
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

    public Integer getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }
    public Integer getCustomerAge() {
        return customerAge;
    }
    public void setCustomerAge(Integer customerAge) {
        this.customerAge = customerAge;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }
    public String getCustomerAddress() {
        return customerAddress;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public Integer getCreator() {
        return creator;
    }
    public void setCreator(Integer creator) {
        this.creator = creator;
    }
	@Override
	public String toString() {
		return "CustomerInfo [customerId=" + customerId + ", customerName="
				+ customerName + ", customerAge=" + customerAge
				+ ", customerPhone=" + customerPhone + ", customerAddress="
				+ customerAddress + ", createTime=" + createTime + ", creator="
				+ creator + "]";
	}
    
}