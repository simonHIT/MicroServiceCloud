package com.simon.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: MicroServiceCloud
 * @description: Eureka服务注册中心
 * @author: zxb
 * @create: 2019-09-12 16:22
 **/
@SpringBootApplication
@EnableEurekaServer
public interface EurekaServerApplication7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication7002.class,args);
    }
}
