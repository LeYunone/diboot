package com.leyuna.diboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.leyuna.diboot.mapper")
public class DibootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DibootApplication.class, args);
    }

}
