package com.simon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: MicroServiceCloud
 * @description: config 配置中心 主启动类
 * @author: Simon
 * @create: 2019-09-25 18:28
 **/
@SpringBootApplication
@EnableConfigServer
public interface ConfigApplication3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication3344.class,args);
    }
}
