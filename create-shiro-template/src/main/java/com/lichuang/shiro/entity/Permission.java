package com.lichuang.shiro.entity;

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
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long id;

    /**
     * 权限编号
     */
    private String permission;

    /**
     * 权限描述
     */
    private String description;

    /**
     * 此权限关联角色的id
     */
    private Long rid;
    /**
     * 是否锁定
     */
    private Integer available;

}
