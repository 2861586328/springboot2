package com.wzx.demo07springmvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//以前是在springmvc.xml中配置，现在的话使用@Configuration加@Bean
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //拦截器 判断用户是否登录，未登录重定向到登录页
        System.out.println("preHandle ");
        return true;//true就是放行 false就是不放行
    }
}
