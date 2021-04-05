package com.example.lichuang.shiro.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lichuang123
 * @since 2021-04-03
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 角色列表
     */
    private String roleId;
    /**
     * 是否锁定
     */
    private Integer locked;

}
