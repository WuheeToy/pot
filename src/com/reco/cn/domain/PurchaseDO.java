package com.reco.cn.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * @author cpf
 * @email mcpfzt@163.com
 * @date 2018-04-15 16:25:38
 */
public class PurchaseDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Integer poId;
    //
    private String poNo;
    //壶ID
    private Integer potId;
    //款式ID
    private Integer designId;
    //
    private Date poDttm;
    //
    private Integer orderState;
    //
    private Integer sellerId;
    //
    private Integer buyerId;
    //
    private String buyerName;
    //
    private Float price;
    //
    private String deliveryAddr;
    //
    private Boolean taken;
    //
    private String expressCompany;
    //
    private String expressNo;
    //
    private String remark;
    //对应销售单ID，多个，拼接
    private String soIds;

    /**
     * 设置：
     */
    public void setPoId(Integer poId) {
        this.poId = poId;
    }

    /**
     * 获取：
     */
    public Integer getPoId() {
        return poId;
    }

    /**
     * 设置：
     */
    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    /**
     * 获取：
     */
    public String getPoNo() {
        return poNo;
    }

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
     * 设置：款式ID
     */
    public void setDesignId(Integer designId) {
        this.designId = designId;
    }

    /**
     * 获取：款式ID
     */
    public Integer getDesignId() {
        return designId;
    }

    /**
     * 设置：
     */
    public void setPoDttm(Date poDttm) {
        this.poDttm = poDttm;
    }

    /**
     * 获取：
     */
    public Date getPoDttm() {
        return poDttm;
    }

    /**
     * 设置：
     */
    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    /**
     * 获取：
     */
    public Integer getOrderState() {
        return orderState;
    }

    /**
     * 设置：
     */
    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * 获取：
     */
    public Integer getSellerId() {
        return sellerId;
    }

    /**
     * 设置：
     */
    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * 获取：
     */
    public Integer getBuyerId() {
        return buyerId;
    }

    /**
     * 设置：
     */
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    /**
     * 获取：
     */
    public String getBuyerName() {
        return buyerName;
    }

    /**
     * 设置：
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * 获取：
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 设置：
     */
    public void setDeliveryAddr(String deliveryAddr) {
        this.deliveryAddr = deliveryAddr;
    }

    /**
     * 获取：
     */
    public String getDeliveryAddr() {
        return deliveryAddr;
    }

    /**
     * 设置：
     */
    public void setTaken(Boolean taken) {
        this.taken = taken;
    }

    /**
     * 获取：
     */
    public Boolean getTaken() {
        return taken;
    }

    /**
     * 设置：
     */
    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    /**
     * 获取：
     */
    public String getExpressCompany() {
        return expressCompany;
    }

    /**
     * 设置：
     */
    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    /**
     * 获取：
     */
    public String getExpressNo() {
        return expressNo;
    }

    /**
     * 设置：
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置：对应销售单ID，多个，拼接
     */
    public void setSoIds(String soIds) {
        this.soIds = soIds;
    }

    /**
     * 获取：对应销售单ID，多个，拼接
     */
    public String getSoIds() {
        return soIds;
    }
}
