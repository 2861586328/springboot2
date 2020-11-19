package com.wzx.demo07springmvc.configuration;

import com.wzx.demo07springmvc.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MySpringMVCConfiguration implements WebMvcConfigurer {
    @Bean //<bean>
    public MyInterceptor getMyInterceptor(){
        MyInterceptor myInterceptor = new MyInterceptor();
        return myInterceptor;
    }
    //  /*  拦截所有   -->  MyInterceptor -->preHandle  -->true

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getMyInterceptor()).addPathPatterns("/*");
    }
}
