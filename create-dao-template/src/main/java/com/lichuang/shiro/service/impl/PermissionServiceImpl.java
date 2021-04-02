package com.lichuang.shiro.service.impl;

import com.lichuang.shiro.entity.Permission;
import com.lichuang.shiro.mapper.PermissionDao;
import com.lichuang.shiro.service.IPermissionService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lichuang123
 * @since 2021-04-03
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionDao, Permission> implements IPermissionService {

}
