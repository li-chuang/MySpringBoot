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
public class RolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Long id;

    /**
     * 角色编号
     */
    private Long roleId;

    /**
     * 权限编号
     */
    private Long permissionId;

}
