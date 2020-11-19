package com.wzx.demo04mybatis.dao;

import com.wzx.demo04mybatis.domain.Person;

import java.util.List;

public interface PersonDao {
    //全查
    List<Person> findAllPersons();
}
