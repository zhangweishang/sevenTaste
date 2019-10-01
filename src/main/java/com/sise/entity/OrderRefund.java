package com.sise.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 订单退款表
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
public class OrderRefund implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单退款id
     */
    @TableId(value = "order_refund_id", type = IdType.AUTO)
    private Integer orderRefundId;

    /**
     * 订单id
     */
    @TableField("order_id")
    private String orderId;

    /**
     * 退款原因
     */
    @TableField("refund_reason")
    private String refundReason;

    /**
     * 退款金额
     */
    @TableField("refund_money")
    private BigDecimal refundMoney;

    /**
     * 退款状态
     */
    @TableField("refund_status")
    private String refundStatus;

    public Integer getOrderRefundId() {
        return orderRefundId;
    }

    public void setOrderRefundId(Integer orderRefundId) {
        this.orderRefundId = orderRefundId;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }
    public BigDecimal getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(BigDecimal refundMoney) {
        this.refundMoney = refundMoney;
    }
    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    @Override
    public String toString() {
        return "OrderRefund{" +
        "orderRefundId=" + orderRefundId +
        ", orderId=" + orderId +
        ", refundReason=" + refundReason +
        ", refundMoney=" + refundMoney +
        ", refundStatus=" + refundStatus +
        "}";
    }
}
