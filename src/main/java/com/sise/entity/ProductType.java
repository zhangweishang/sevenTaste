package com.sise.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 商品类型表
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
public class ProductType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_type_id", type = IdType.AUTO)
    private Integer productTypeId;

    /**
     * 商铺id
     */
    @TableField("store_id")
    private Integer storeId;

    /**
     * 商品类型名称
     */
    @TableField("product_type_name")
    private String productTypeName;

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    @Override
    public String toString() {
        return "ProductType{" +
        "productTypeId=" + productTypeId +
        ", storeId=" + storeId +
        ", productTypeName=" + productTypeName +
        "}";
    }
}
