package com.pixelhub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.pixelhub.mapper")
public class PixelHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(PixelHubApplication.class, args);
    }

}
