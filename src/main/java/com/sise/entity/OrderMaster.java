package com.sise.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 订单主表
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
public class OrderMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单id
     */
    @TableId(value = "order_id", type = IdType.UUID)
    private String orderId;

    /**
     * 微信用户唯一标识
     */
    @TableField("open_id")
    private String openId;

    /**
     * 商铺id
     */
    @TableField("store_id")
    private Integer storeId;

    /**
     * 订单总金额
     */
    @TableField("order_amount")
    private BigDecimal orderAmount;

    /**
     * 订单状态
     */
    @TableField("订单状态")
    private String 订单状态;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }
    public String get订单状态() {
        return 订单状态;
    }

    public void set订单状态(String 订单状态) {
        this.订单状态 = 订单状态;
    }

    @Override
    public String toString() {
        return "OrderMaster{" +
        "orderId=" + orderId +
        ", openId=" + openId +
        ", storeId=" + storeId +
        ", orderAmount=" + orderAmount +
        ", 订单状态=" + 订单状态 +
        "}";
    }
}
