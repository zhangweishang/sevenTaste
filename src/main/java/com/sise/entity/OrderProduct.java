package com.sise.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 订单商品表
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
public class OrderProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单商品id
     */
    @TableId(value = "order_product_id", type = IdType.AUTO)
    private Integer orderProductId;

    /**
     * 订单id
     */
    @TableField("order_id")
    private String orderId;

    /**
     * 商品id
     */
    @TableField("product_id")
    private Integer productId;

    /**
     * 商品名称
     */
    @TableField("product_name")
    private String productName;

    /**
     * 商品图标
     */
    @TableField("product_icon")
    private String productIcon;

    /**
     * 商品价格
     */
    @TableField("product_price")
    private BigDecimal productPrice;

    /**
     * 商品购买数量
     */
    @TableField("product_buy_number")
    private Integer productBuyNumber;

    public Integer getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(Integer orderProductId) {
        this.orderProductId = orderProductId;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }
    public Integer getProductBuyNumber() {
        return productBuyNumber;
    }

    public void setProductBuyNumber(Integer productBuyNumber) {
        this.productBuyNumber = productBuyNumber;
    }

    @Override
    public String toString() {
        return "OrderProduct{" +
        "orderProductId=" + orderProductId +
        ", orderId=" + orderId +
        ", productId=" + productId +
        ", productName=" + productName +
        ", productIcon=" + productIcon +
        ", productPrice=" + productPrice +
        ", productBuyNumber=" + productBuyNumber +
        "}";
    }
}
