package com.angel.pluginmarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.angel.pluginmarket.dao")
@EnableScheduling
public class PluginMarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(PluginMarketApplication.class, args);
    }

}
