package com.sise.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 商铺信息表
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
public class StoreInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商铺id
     */
    @TableId(value = "store_id", type = IdType.AUTO)
    private Integer storeId;

    /**
     * 商铺名称
     */
    @TableField("store_name")
    private String storeName;

    /**
     * 商铺图标
     */
    @TableField("store_icon")
    private String storeIcon;

    /**
     * 商铺电话
     */
    @TableField("store_phone")
    private String storePhone;

    /**
     * 商铺公告
     */
    @TableField("store_notice")
    private String storeNotice;

    /**
     * 商铺好评率
     */
    @TableField("store_praise_rate")
    private Float storePraiseRate;

    /**
     * 商铺状态
     */
    @TableField("store_status")
    private String storeStatus;

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public String getStoreIcon() {
        return storeIcon;
    }

    public void setStoreIcon(String storeIcon) {
        this.storeIcon = storeIcon;
    }
    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }
    public String getStoreNotice() {
        return storeNotice;
    }

    public void setStoreNotice(String storeNotice) {
        this.storeNotice = storeNotice;
    }
    public Float getStorePraiseRate() {
        return storePraiseRate;
    }

    public void setStorePraiseRate(Float storePraiseRate) {
        this.storePraiseRate = storePraiseRate;
    }
    public String getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(String storeStatus) {
        this.storeStatus = storeStatus;
    }

    @Override
    public String toString() {
        return "StoreInfo{" +
        "storeId=" + storeId +
        ", storeName=" + storeName +
        ", storeIcon=" + storeIcon +
        ", storePhone=" + storePhone +
        ", storeNotice=" + storeNotice +
        ", storePraiseRate=" + storePraiseRate +
        ", storeStatus=" + storeStatus +
        "}";
    }
}
