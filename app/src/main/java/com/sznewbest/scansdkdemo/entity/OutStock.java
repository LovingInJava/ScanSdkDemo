package com.sznewbest.scansdkdemo.entity;

import java.util.Date;

/**
 * @Project : ScanSdkDemo
 * @Description : 出库单实体类
 * @Author : wsm
 * @Iteration : 1.0
 * @Date : 2019-07-01  16:52
 * @ModificationHistory
 * Who          When          What
 * ----------   ------------- -----------------------------------
 * wsm          2019/07/01    create
 */
public class OutStock {
    private String outCode;
    private String cusName;
    private String receiver;
    private String phone;
    private String address;
    private Character outStatus;
    private String createBy;
    private Date createTime;
    private Date updateTime;
    private String updateBy;
    private String remarks;

    public void setOutCode (String outCode) {this.outCode = outCode;}
    public String getOutCode(){ return outCode;}
    public void setCusName (String cusName) {this.cusName = cusName;}
    public String getCusName(){ return cusName;}
    public void setReceiver (String receiver) {this.receiver = receiver;}
    public String getReceiver(){ return receiver;}
    public void setPhone (String phone) {this.phone = phone;}
    public String getPhone(){ return phone;}
    public void setAddress (String address) {this.address = address;}
    public String getAddress(){ return address;}
    public void setOutStatus (Character outStatus) {this.outStatus = outStatus;}
    public Character getOutStatus(){ return outStatus;}
    public void setCreateBy (String createBy) {this.createBy = createBy;}
    public String getCreateBy(){ return createBy;}
    public void setCreateTime (Date createTime) {this.createTime = createTime;}
    public Date getCreateTime(){ return createTime;}
    public void setUpdateTime (Date updateTime) {this.updateTime = updateTime;}
    public Date getUpdateTime(){ return updateTime;}
    public void setUpdateBy (String updateBy) {this.updateBy = updateBy;}
    public String getUpdateBy(){ return updateBy;}
    public void setRemarks (String remarks) {this.remarks = remarks;}
    public String getRemarks(){ return remarks;}
}
