package com.sise.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 订单详情表
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单详情id
     */
    @TableId(value = "order_detail_id", type = IdType.AUTO)
    private Integer orderDetailId;

    /**
     * 订单id
     */
    @TableField("order_id")
    private String orderId;

    /**
     * 收货人信息id
     */
    @TableField("receiver_info_id")
    private Integer receiverInfoId;

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

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public Integer getReceiverInfoId() {
        return receiverInfoId;
    }

    public void setReceiverInfoId(Integer receiverInfoId) {
        this.receiverInfoId = receiverInfoId;
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

    @Override
    public String toString() {
        return "OrderDetail{" +
        "orderDetailId=" + orderDetailId +
        ", orderId=" + orderId +
        ", receiverInfoId=" + receiverInfoId +
        ", storeName=" + storeName +
        ", storeIcon=" + storeIcon +
        ", storePhone=" + storePhone +
        "}";
    }
}
