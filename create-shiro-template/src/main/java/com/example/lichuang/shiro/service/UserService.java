package com.example.lichuang.shiro.service;

import com.example.lichuang.shiro.dao.UserDao;
import com.example.lichuang.shiro.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // service 调用 dao层
    @Autowired
    private UserDao userDao;

    public User queryUserByName(String name){
        return userDao.queryUserByName(name);
    }
}

