package com.example.lichuang.shiro.service.impl;

import com.example.lichuang.shiro.service.IRoleService;
import com.example.lichuang.shiro.entity.Role;
import com.example.lichuang.shiro.mapper.RoleDao;
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
