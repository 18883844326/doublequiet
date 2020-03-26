package com.example.doublequiet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@Slf4j
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class DoubleQuietApplication {

    public static void main(String[] args) {
        SpringApplication.run(DoubleQuietApplication.class, args);
        log.info("启动成功");
    }

}
