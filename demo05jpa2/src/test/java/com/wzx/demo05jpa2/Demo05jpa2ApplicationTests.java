package com.wzx.demo05jpa2;

import com.wzx.demo05jpa2.dao.UserDao;
import com.wzx.demo05jpa2.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class Demo05jpa2ApplicationTests {
  //  Logger l  = LoggerFactory.getLogger(this.getClass())
    @Autowired
    UserDao userDao;

    @Test
    void test01() {
        User user = new User();
        user.setGirlFriend("rose");
        user.setUsername("jack@xx.com");
        user.setName("jack");
        System.out.println(user.toString());
        log.info("test01 "+user);
        userDao.save(user);//--->orm -- >将对象值取出-->sql-->数据库
    }


}
