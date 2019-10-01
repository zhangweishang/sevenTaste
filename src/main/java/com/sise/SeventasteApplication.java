package com.sise;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.sise.entity")
@MapperScan("com.sise.mapper")
@SpringBootApplication
public class SeventasteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeventasteApplication.class, args);
    }

}
