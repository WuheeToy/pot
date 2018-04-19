package com.reco.cn.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * @author cpf
 * @email mcpfzt@163.com
 * @date 2018-04-15 16:25:38
 */
public class DesignDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //款式ID
    private Integer design_Id;
    //作者
    private String author;
    //作者ID
    private Integer art_Id;
    //作品名称
    private String name;
    //鉴定证号
    private String jdzh;
    //作品图片
    private String productimg;
    //
    private Boolean isdbz;
    //库存数量
    private Integer kucun;
    //泥料
    private String niliao;
    //当前价格
    private Float price;
    //容量
    private String rongliang;
    //
    private String xiangqing;
    //
    private String authorproductimage;
    //
    private String authoryz;
    //
    private String authorcr;
    //
    private String authorqm;
    //
    private String productsm;
    //
    private String authorzw;
    //
    private String cs;
    //
    private String fbimage;
    //
    private String fdimage;
    //
    private String fgimage;
    //
    private String finshdate;
    //
    private String flimage;
    //
    private String fsimage;
    //
    private String fzimage;
    //
    private String ggH;
    //
    private String ggKj;
    //
    private String ggLen;
    //
    private String ggW;
    //
    private String gy;
    //
    private String pm;
    //
    private String zx;
    //
    private String sm360;
    //
    private Integer jiami;

    /**
     * 设置：款式ID
     */
    public void setDesign_Id(Integer design_Id) {
        this.design_Id = design_Id;
    }

    /**
     * 获取：款式ID
     */
    public Integer getDesign_Id() {
        return design_Id;
    }

    /**
     * 设置：作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取：作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置：作者ID
     */
    public void setArt_Id(Integer art_Id) {
        this.art_Id = art_Id;
    }

    /**
     * 获取：作者ID
     */
    public Integer getArtId() {
        return art_Id;
    }

    /**
     * 设置：作品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：作品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：鉴定证号
     */
    public void setJdzh(String jdzh) {
        this.jdzh = jdzh;
    }

    /**
     * 获取：鉴定证号
     */
    public String getJdzh() {
        return jdzh;
    }

    /**
     * 设置：作品图片
     */
    public void setProductimg(String productimg) {
        this.productimg = productimg;
    }

    /**
     * 获取：作品图片
     */
    public String getProductimg() {
        return productimg;
    }

    /**
     * 设置：
     */
    public void setIsdbz(Boolean isdbz) {
        this.isdbz = isdbz;
    }

    /**
     * 获取：
     */
    public Boolean getIsdbz() {
        return isdbz;
    }

    /**
     * 设置：库存数量
     */
    public void setKucun(Integer kucun) {
        this.kucun = kucun;
    }

    /**
     * 获取：库存数量
     */
    public Integer getKucun() {
        return kucun;
    }

    /**
     * 设置：泥料
     */
    public void setNiliao(String niliao) {
        this.niliao = niliao;
    }

    /**
     * 获取：泥料
     */
    public String getNiliao() {
        return niliao;
    }

    /**
     * 设置：当前价格
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * 获取：当前价格
     */
    public Float getPrice() {
        return price;
    }

    /**
     * 设置：容量
     */
    public void setRongliang(String rongliang) {
        this.rongliang = rongliang;
    }

    /**
     * 获取：容量
     */
    public String getRongliang() {
        return rongliang;
    }

    /**
     * 设置：
     */
    public void setXiangqing(String xiangqing) {
        this.xiangqing = xiangqing;
    }

    /**
     * 获取：
     */
    public String getXiangqing() {
        return xiangqing;
    }

    /**
     * 设置：
     */
    public void setAuthorproductimage(String authorproductimage) {
        this.authorproductimage = authorproductimage;
    }

    /**
     * 获取：
     */
    public String getAuthorproductimage() {
        return authorproductimage;
    }

    /**
     * 设置：
     */
    public void setAuthoryz(String authoryz) {
        this.authoryz = authoryz;
    }

    /**
     * 获取：
     */
    public String getAuthoryz() {
        return authoryz;
    }

    /**
     * 设置：
     */
    public void setAuthorcr(String authorcr) {
        this.authorcr = authorcr;
    }

    /**
     * 获取：
     */
    public String getAuthorcr() {
        return authorcr;
    }

    /**
     * 设置：
     */
    public void setAuthorqm(String authorqm) {
        this.authorqm = authorqm;
    }

    /**
     * 获取：
     */
    public String getAuthorqm() {
        return authorqm;
    }

    /**
     * 设置：
     */
    public void setProductsm(String productsm) {
        this.productsm = productsm;
    }

    /**
     * 获取：
     */
    public String getProductsm() {
        return productsm;
    }

    /**
     * 设置：
     */
    public void setAuthorzw(String authorzw) {
        this.authorzw = authorzw;
    }

    /**
     * 获取：
     */
    public String getAuthorzw() {
        return authorzw;
    }

    /**
     * 设置：
     */
    public void setCs(String cs) {
        this.cs = cs;
    }

    /**
     * 获取：
     */
    public String getCs() {
        return cs;
    }

    /**
     * 设置：
     */
    public void setFbimage(String fbimage) {
        this.fbimage = fbimage;
    }

    /**
     * 获取：
     */
    public String getFbimage() {
        return fbimage;
    }

    /**
     * 设置：
     */
    public void setFdimage(String fdimage) {
        this.fdimage = fdimage;
    }

    /**
     * 获取：
     */
    public String getFdimage() {
        return fdimage;
    }

    /**
     * 设置：
     */
    public void setFgimage(String fgimage) {
        this.fgimage = fgimage;
    }

    /**
     * 获取：
     */
    public String getFgimage() {
        return fgimage;
    }

    /**
     * 设置：
     */
    public void setFinshdate(String finshdate) {
        this.finshdate = finshdate;
    }

    /**
     * 获取：
     */
    public String getFinshdate() {
        return finshdate;
    }

    /**
     * 设置：
     */
    public void setFlimage(String flimage) {
        this.flimage = flimage;
    }

    /**
     * 获取：
     */
    public String getFlimage() {
        return flimage;
    }

    /**
     * 设置：
     */
    public void setFsimage(String fsimage) {
        this.fsimage = fsimage;
    }

    /**
     * 获取：
     */
    public String getFsimage() {
        return fsimage;
    }

    /**
     * 设置：
     */
    public void setFzimage(String fzimage) {
        this.fzimage = fzimage;
    }

    /**
     * 获取：
     */
    public String getFzimage() {
        return fzimage;
    }

    /**
     * 设置：
     */
    public void setGgH(String ggH) {
        this.ggH = ggH;
    }

    /**
     * 获取：
     */
    public String getGgH() {
        return ggH;
    }

    /**
     * 设置：
     */
    public void setGgKj(String ggKj) {
        this.ggKj = ggKj;
    }

    /**
     * 获取：
     */
    public String getGgKj() {
        return ggKj;
    }

    /**
     * 设置：
     */
    public void setGgLen(String ggLen) {
        this.ggLen = ggLen;
    }

    /**
     * 获取：
     */
    public String getGgLen() {
        return ggLen;
    }

    /**
     * 设置：
     */
    public void setGgW(String ggW) {
        this.ggW = ggW;
    }

    /**
     * 获取：
     */
    public String getGgW() {
        return ggW;
    }

    /**
     * 设置：
     */
    public void setGy(String gy) {
        this.gy = gy;
    }

    /**
     * 获取：
     */
    public String getGy() {
        return gy;
    }

    /**
     * 设置：
     */
    public void setPm(String pm) {
        this.pm = pm;
    }

    /**
     * 获取：
     */
    public String getPm() {
        return pm;
    }

    /**
     * 设置：
     */
    public void setZx(String zx) {
        this.zx = zx;
    }

    /**
     * 获取：
     */
    public String getZx() {
        return zx;
    }

    /**
     * 设置：
     */
    public void setSm360(String sm360) {
        this.sm360 = sm360;
    }

    /**
     * 获取：
     */
    public String getSm360() {
        return sm360;
    }

    /**
     * 设置：
     */
    public void setJiami(Integer jiami) {
        this.jiami = jiami;
    }

    /**
     * 获取：
     */
    public Integer getJiami() {
        return jiami;
    }
}
