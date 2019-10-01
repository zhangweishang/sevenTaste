package com.sise.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 微信用户唯一标识
     */
    @TableId(value = "open_id", type = IdType.UUID)
    private String openId;

    /**
     * 用户名
     */
    @TableField("user_name")
    private String userName;

    /**
     * 用户性别
     */
    @TableField("user_gender")
    private String userGender;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    @Override
    public String toString() {
        return "User{" +
        "openId=" + openId +
        ", userName=" + userName +
        ", userGender=" + userGender +
        "}";
    }
}
