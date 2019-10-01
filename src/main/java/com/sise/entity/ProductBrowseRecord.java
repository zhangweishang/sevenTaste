package com.sise.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 商品浏览记录表
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
public class ProductBrowseRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 浏览记录id
     */
    @TableId(value = "browse_record_id", type = IdType.AUTO)
    private Integer browseRecordId;

    /**
     * 微信用户唯一标识
     */
    @TableField("open_id")
    private String openId;

    /**
     * 商品id
     */
    @TableField("product_id")
    private Integer productId;

    /**
     * 浏览次数
     */
    @TableField("browse_count")
    private Integer browseCount;

    public Integer getBrowseRecordId() {
        return browseRecordId;
    }

    public void setBrowseRecordId(Integer browseRecordId) {
        this.browseRecordId = browseRecordId;
    }
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
    public Integer getBrowseCount() {
        return browseCount;
    }

    public void setBrowseCount(Integer browseCount) {
        this.browseCount = browseCount;
    }

    @Override
    public String toString() {
        return "ProductBrowseRecord{" +
        "browseRecordId=" + browseRecordId +
        ", openId=" + openId +
        ", productId=" + productId +
        ", browseCount=" + browseCount +
        "}";
    }
}
