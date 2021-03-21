package com.example.lich;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.lich.mapper")
public class DaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaoApplication.class, args);
    }
}
