package com.wzx.demo05jpa2.domain;



import lombok.Data;

import javax.persistence.*;

@Entity //表示当前类，在数据库有表与它对应
@Table(name = "tb_user2")
@Data
public class User {
    @Id //表示id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键自增长
    private int id;
    private String username;
    private String password;
    private String girlFriend;
    private String name;


}
