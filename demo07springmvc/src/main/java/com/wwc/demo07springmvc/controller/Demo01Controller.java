package com.wzx.demo07springmvc.controller;

import com.wzx.demo07springmvc.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class Demo01Controller {
    @RequestMapping(path="/test01",method = RequestMethod.GET)
    public @ResponseBody //将结果转成json，如果不能转，就显示字符串
    String test01(){
        return "hello";
    }

    @RequestMapping(path="/test02",method = RequestMethod.GET)
    public @ResponseBody //将结果转成json，如果不能转，就显示字符串
    Object test02(){
        Person person = new Person();
        person.setPassword("12345");
        person.setUsername("root");
        return person;
    }
    @RequestMapping(path="/test03",method = RequestMethod.GET)
     //将结果转成json，如果不能转，就显示字符串
    Object test03(){
        Person person = new Person();
        person.setPassword("12345");
        person.setUsername("restController");
        return person;
    }
}
