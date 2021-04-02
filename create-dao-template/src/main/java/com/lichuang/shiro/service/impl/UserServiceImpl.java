package com.lichuang.shiro.service.impl;

import com.lichuang.shiro.entity.User;
import com.lichuang.shiro.mapper.UserDao;
import com.lichuang.shiro.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
