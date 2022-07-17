package com.leo23;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.leo23.mapper")
public class YepApplication {
    public static void main(String[] args) {
        SpringApplication.run(YepApplication.class, args);
    }
}
