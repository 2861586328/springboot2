package com.wzx.demo07springmvc.configuration;

import com.wzx.demo07springmvc.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//因为springboot全注解开发，没有xml配置文件，就没有地方写<bean>
@Configuration
public class DaoBeanConfig {
    @Bean//将当前方法的返回值 放到 ioc容器
    public Person getPerson(){
        //一般不是@Service @Repository @Controller
        Person person = new Person();
        person.setPassword("12345");
        person.setUsername("root");
        return person;
    }
}
