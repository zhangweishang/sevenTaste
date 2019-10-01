package com.sise.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 收货人信息表
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
public class ReceiverInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 收货人信息id
     */
    @TableId(value = "receiver_info_id", type = IdType.AUTO)
    private Integer receiverInfoId;

    /**
     * 微信用户唯一标识
     */
    @TableField("open_id")
    private String openId;

    /**
     * 收货人姓名
     */
    @TableField("receiver_name")
    private String receiverName;

    /**
     * 收货人性别
     */
    @TableField("receiver_gender")
    private String receiverGender;

    /**
     * 收货人电话
     */
    @TableField("receiver_phone")
    private String receiverPhone;

    /**
     * 收货人地址(宿舍号)
     */
    @TableField("receiver_address")
    private String receiverAddress;

    /**
     * 是否设为默认地址
     */
    @TableField("is_default_address")
    private String isDefaultAddress;

    public Integer getReceiverInfoId() {
        return receiverInfoId;
    }

    public void setReceiverInfoId(Integer receiverInfoId) {
        this.receiverInfoId = receiverInfoId;
    }
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    public String getReceiverGender() {
        return receiverGender;
    }

    public void setReceiverGender(String receiverGender) {
        this.receiverGender = receiverGender;
    }
    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }
    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }
    public String getIsDefaultAddress() {
        return isDefaultAddress;
    }

    public void setIsDefaultAddress(String isDefaultAddress) {
        this.isDefaultAddress = isDefaultAddress;
    }

    @Override
    public String toString() {
        return "ReceiverInfo{" +
        "receiverInfoId=" + receiverInfoId +
        ", openId=" + openId +
        ", receiverName=" + receiverName +
        ", receiverGender=" + receiverGender +
        ", receiverPhone=" + receiverPhone +
        ", receiverAddress=" + receiverAddress +
        ", isDefaultAddress=" + isDefaultAddress +
        "}";
    }
}
