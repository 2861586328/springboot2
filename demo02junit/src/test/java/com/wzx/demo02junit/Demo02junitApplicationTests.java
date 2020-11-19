package com.wzx.demo02junit;

import com.wzx.demo02junit.service.IPersonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo02junitApplicationTests {

    //查询所有的Person
    @Autowired
    private IPersonService service;
    @Test
    void contextLoads() {
        service.savePerson();
    }

}
