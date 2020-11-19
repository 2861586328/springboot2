package com.wzx.demo01yml.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo01Controller {
    @Value("${name1}")
    private String name1;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    @RequestMapping(path="/test01",method = RequestMethod.GET)
    public @ResponseBody
    String test01(){
        System.out.println(name1);
        System.out.println(name);
        System.out.println(age);
        return "hello";
    }
}
