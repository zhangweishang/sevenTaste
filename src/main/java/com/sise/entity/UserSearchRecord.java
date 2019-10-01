package com.sise.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 用户搜索记录表
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
public class UserSearchRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 搜索记录id
     */
    @TableId(value = "search_record_id", type = IdType.AUTO)
    private Integer searchRecordId;

    /**
     * 微信用户唯一标识
     */
    @TableField("open_id")
    private String openId;

    /**
     * 搜索内容
     */
    @TableField("search_content")
    private String searchContent;

    public Integer getSearchRecordId() {
        return searchRecordId;
    }

    public void setSearchRecordId(Integer searchRecordId) {
        this.searchRecordId = searchRecordId;
    }
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
    public String getSearchContent() {
        return searchContent;
    }

    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent;
    }

    @Override
    public String toString() {
        return "UserSearchRecord{" +
        "searchRecordId=" + searchRecordId +
        ", openId=" + openId +
        ", searchContent=" + searchContent +
        "}";
    }
}
