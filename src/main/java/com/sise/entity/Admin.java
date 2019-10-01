package com.sise.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 管理员表
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员id
     */
    @TableId(value = "admin_id", type = IdType.AUTO)
    private Integer adminId;

    /**
     * 管理员账号
     */
    @TableField("admin_account")
    private String adminAccount;

    /**
     * 管理员密码
     */
    @TableField("admin_password")
    private String adminPassword;

    /**
     * 管理员权限
     */
    @TableField("admin_permission")
    private String adminPermission;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }
    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }
    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
    public String getAdminPermission() {
        return adminPermission;
    }

    public void setAdminPermission(String adminPermission) {
        this.adminPermission = adminPermission;
    }

    @Override
    public String toString() {
        return "Admin{" +
        "adminId=" + adminId +
        ", adminAccount=" + adminAccount +
        ", adminPassword=" + adminPassword +
        ", adminPermission=" + adminPermission +
        "}";
    }
}
