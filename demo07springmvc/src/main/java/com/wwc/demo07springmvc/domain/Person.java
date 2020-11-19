package com.wzx.demo07springmvc.domain;

import lombok.Data;

@Data
public class Person {
    private String username;
    private String password;

    public Person() {
        System.out.println("执行Person构造方法");
    }
}
