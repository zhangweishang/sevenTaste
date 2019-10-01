package com.sise.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 商品收藏表
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
public class ProductCollect implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品收藏id
     */
    @TableId(value = "product_collect_id", type = IdType.AUTO)
    private Integer productCollectId;

    /**
     * 商品id
     */
    @TableField("product_id")
    private Integer productId;

    /**
     * 微信用户唯一标识
     */
    @TableField("open_id")
    private String openId;

    public Integer getProductCollectId() {
        return productCollectId;
    }

    public void setProductCollectId(Integer productCollectId) {
        this.productCollectId = productCollectId;
    }
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    @Override
    public String toString() {
        return "ProductCollect{" +
        "productCollectId=" + productCollectId +
        ", productId=" + productId +
        ", openId=" + openId +
        "}";
    }
}
