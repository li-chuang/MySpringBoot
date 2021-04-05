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
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色编号
     */
    private Long id;

    /**
     * 角色名称
     */
    private String role;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 父节点
     */
    private Long pid;

    /**
     * 是否锁定
     */
    private Integer available;

}
