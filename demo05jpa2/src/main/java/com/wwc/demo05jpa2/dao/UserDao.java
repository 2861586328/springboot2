package com.wzx.demo05jpa2.dao;


import com.wzx.demo05jpa2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

//继承通用的接口，即可完成增删改查
public interface UserDao extends JpaRepository<User,Integer> {
}
