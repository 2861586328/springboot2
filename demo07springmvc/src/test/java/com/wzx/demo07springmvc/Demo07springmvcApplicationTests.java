package com.wzx.demo07springmvc;

import com.wzx.demo07springmvc.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo07springmvcApplicationTests {

    @Autowired
    Person person;//从ioc里面取对象
    @Test
    void test01() {
        System.out.println(person);
    }

}
