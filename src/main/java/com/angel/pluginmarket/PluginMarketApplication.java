package com.angel.pluginmarket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.angel.pluginmarket.dao")
public class PluginMarketApplication {

    public static void main(String[] args) {
        SpringApplication.run(PluginMarketApplication.class, args);
    }

}
