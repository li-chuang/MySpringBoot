package com.example.lichuang.shiro.dao;

import com.example.lichuang.shiro.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDao {

    /**
     * 根据用户名 查询指定用户
     * @param name
     * @return
     */
    User queryUserByName(@Param("name") String name);
}
