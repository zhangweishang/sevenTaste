package com.sise.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 商品信息表
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
public class ProductInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    @TableId(value = "product_id", type = IdType.AUTO)
    private Integer productId;

    /**
     * 商铺id
     */
    @TableField("store_id")
    private Integer storeId;

    /**
     * 商品类型id
     */
    @TableField("product_type_id")
    private Integer productTypeId;

    /**
     * 商品类别
     */
    @TableField("product_category")
    private String productCategory;

    /**
     * 商品名称
     */
    @TableField("product_name")
    private String productName;

    /**
     * 商品价格
     */
    @TableField("product_price")
    private BigDecimal productPrice;

    /**
     * 商品库存
     */
    @TableField("product_stock")
    private Integer productStock;

    /**
     * 商品图标
     */
    @TableField("product_icon")
    private String productIcon;

    /**
     * 商品描述
     */
    @TableField("product_description")
    private String productDescription;

    /**
     * 商品状态
     */
    @TableField("product_status")
    private String productStatus;

    /**
     * 商品月销量
     */
    @TableField("product_month_sales")
    private Integer productMonthSales;

    /**
     * 商品好评率
     */
    @TableField("product_praise_rate")
    private Float productPraiseRate;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }
    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }
    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }
    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }
    public Integer getProductMonthSales() {
        return productMonthSales;
    }

    public void setProductMonthSales(Integer productMonthSales) {
        this.productMonthSales = productMonthSales;
    }
    public Float getProductPraiseRate() {
        return productPraiseRate;
    }

    public void setProductPraiseRate(Float productPraiseRate) {
        this.productPraiseRate = productPraiseRate;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
        "productId=" + productId +
        ", storeId=" + storeId +
        ", productTypeId=" + productTypeId +
        ", productCategory=" + productCategory +
        ", productName=" + productName +
        ", productPrice=" + productPrice +
        ", productStock=" + productStock +
        ", productIcon=" + productIcon +
        ", productDescription=" + productDescription +
        ", productStatus=" + productStatus +
        ", productMonthSales=" + productMonthSales +
        ", productPraiseRate=" + productPraiseRate +
        "}";
    }
}
