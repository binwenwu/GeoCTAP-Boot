package com.gis.geoctap.moudle01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.gis.geoctap.moudle01.dao")
@SpringBootApplication
public class Moudle01Application {

    public static void main(String[] args) {
        SpringApplication.run(Moudle01Application.class, args);
    }

}
