package com.lichuang.shiro.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lichuang123
 * @since 2021-03-28
 */
@TableName("tb_permission")
public class TbPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getRid() {
        return rid;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "TbPermission{" +
        "id=" + id +
        ", permission=" + permission +
        ", description=" + description +
        ", rid=" + rid +
        ", available=" + available +
        "}";
    }
}
