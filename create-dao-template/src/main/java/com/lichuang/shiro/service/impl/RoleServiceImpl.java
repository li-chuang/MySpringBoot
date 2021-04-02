package com.lichuang.shiro.service.impl;

import com.lichuang.shiro.entity.Role;
import com.lichuang.shiro.mapper.RoleDao;
import com.lichuang.shiro.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements IRoleService {

}
