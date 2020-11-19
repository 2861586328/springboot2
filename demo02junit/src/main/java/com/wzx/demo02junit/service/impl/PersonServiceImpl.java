package com.wzx.demo02junit.service.impl;

import com.wzx.demo02junit.service.IPersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService {
    @Override
    public void savePerson() {
        System.out.println("savePerson");
    }
}
