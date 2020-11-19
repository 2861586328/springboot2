package com.wzx.demo06redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Demo06redisApplicationTests {

    @Autowired
    RedisTemplate<String, String> rt;

    @Test
    void test01() {
        //查找是否有缓存
        String json = rt.boundValueOps("cache1").get();

        //有就直接返回
        if (json != null) {
            System.out.println("来自缓存:" + json);
        } else {
            String json_ = "{name:jack,age:13}";
            //没有就先存，再返回
            rt.boundValueOps("cache1").set(json_);
            System.out.println("保存json " + json_);
        }


    }

}
