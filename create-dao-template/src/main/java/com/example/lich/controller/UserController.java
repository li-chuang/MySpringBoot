package com.example.lich.controller;

import com.example.lich.entity.User;
import com.example.lich.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/list")
    public List<User> list(){
        List<User> students = userMapper.selectList(null);
        System.out.println("=======================");
        return students;
    }


    @GetMapping("/save")
    public String save(){
        User student = new User();
        student.setId(2);
        student.setCity("杭州");
        student.setName("马云");
        student.setSchool("杭州师范");
        userMapper.insert(student);
        System.out.println("=======================");
        return "success";
    }
}
