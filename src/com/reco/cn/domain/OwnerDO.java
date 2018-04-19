package com.reco.cn.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * @author cpf
 * @email mcpfzt@163.com
 * @date 2018-04-15 16:25:38
 */
public class OwnerDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //壶ID
    private Integer potId;
    //壶主ID
    private Integer ownerId;
    //壶主姓名
    private String ownerName;
    //价格
    private Float price;
    //已取
    private Boolean taken;
    //订单ID
    private Integer orderId;
    //更新日期
    private Date updateDate;

    /**
     * 设置：壶ID
     */
    public void setPotId(Integer potId) {
        this.potId = potId;
    }

    /**
     * 获取：壶ID
     */
    public Integer getPotId() {
        return potId;
    }

    /**
     * 设置：壶主ID
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * 获取：壶主ID
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * 设置：壶主姓名
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * 获取：壶主姓名
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * 设置：价格
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * 获取：价格
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 设置：已取
     */
    public void setTaken(Boolean taken) {
        this.taken = taken;
    }

    /**
     * 获取：已取
     */
    public Boolean getTaken() {
        return taken;
    }

    /**
     * 设置：订单ID
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取：订单ID
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置：更新日期
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取：更新日期
     */
    public Date getUpdateDate() {
        return updateDate;
    }
}
