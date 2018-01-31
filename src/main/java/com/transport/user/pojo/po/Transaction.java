/*
 * Transaction.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.user.pojo.po;

import java.util.Date;

/**
 * 一次交易
 * 
 * @author 
 * @version 1.0 2017-05-30
 */
public class Transaction {

    //编号
    private Integer transactionId;
    //行程外键
    private Integer trip;
    //客户外键
    private Integer customer;
    //本次购买的吨位
    private Double tonnage;
    private Long tradingUnitPrice;
    private Long tollPrice;
    //交易亏吨数
    private Double profitTon;
    //（总路费+盈亏费用+实际单价*吨位）
    private Long totalCost;
    //交易时间
    private Date tradingTime;
    //结款状态，未结、结清、部分结清、
    private Integer paymentStatus;
    //行程是否完成并锁定。
    private Integer transactionLock;

    public Integer getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }
    public Integer getTrip() {
        return trip;
    }
    public void setTrip(Integer trip) {
        this.trip = trip;
    }
    public Integer getCustomer() {
        return customer;
    }
    public void setCustomer(Integer customer) {
        this.customer = customer;
    }
    public Double getTonnage() {
        return tonnage;
    }
    public void setTonnage(Double tonnage) {
        this.tonnage = tonnage;
    }
    public Long getTradingUnitPrice() {
        return tradingUnitPrice;
    }
    public void setTradingUnitPrice(Long tradingUnitPrice) {
        this.tradingUnitPrice = tradingUnitPrice;
    }
    public Long getTollPrice() {
        return tollPrice;
    }
    public void setTollPrice(Long tollPrice) {
        this.tollPrice = tollPrice;
    }
    public Double getProfitTon() {
        return profitTon;
    }
    public void setProfitTon(Double profitTon) {
        this.profitTon = profitTon;
    }
    public Long getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(Long totalCost) {
        this.totalCost = totalCost;
    }
    public Date getTradingTime() {
        return tradingTime;
    }
    public void setTradingTime(Date tradingTime) {
        this.tradingTime = tradingTime;
    }
    public Integer getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    public Integer getTransactionLock() {
        return transactionLock;
    }
    public void setTransactionLock(Integer transactionLock) {
        this.transactionLock = transactionLock;
    }
}