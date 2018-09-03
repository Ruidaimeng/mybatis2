package com.yunda.boot.mybatis2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yunda.boot.mybatis2.dao.mapper")
public class Mybatis2Application {

    public static void main(String[] args) {
        SpringApplication.run(Mybatis2Application.class, args);
    }
}
