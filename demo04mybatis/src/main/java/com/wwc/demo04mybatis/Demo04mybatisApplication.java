package com.wzx.demo04mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wzx.demo04mybatis.dao")//存放接口
public class Demo04mybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo04mybatisApplication.class, args);
    }

}
