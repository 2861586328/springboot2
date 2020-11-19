package com.wzx.test01;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;

import java.sql.SQLException;

public class TestHikari {
    @Test
    public void test01() throws SQLException {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/test01");
        config.setUsername("root");
        config.setPassword("123456");
        HikariDataSource ds = new HikariDataSource(config);
        System.out.println(ds.getConnection());

    }

    @Test
    public void test02() throws SQLException {
        //直接初始化HikariDataSource
        HikariDataSource hds = new HikariDataSource();
        hds.setJdbcUrl("jdbc:mysql://localhost:3306/test01");
        hds.setUsername("root");
        hds.setPassword("123456");
        System.out.println(hds.getConnection());
    }

}
