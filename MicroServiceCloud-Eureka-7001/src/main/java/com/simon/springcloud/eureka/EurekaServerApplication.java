package com.simon.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: MicroServiceCloud
 * @description: Eureka服务注册中心
 * @author: zxb
 * @create: 2019-09-11 16:01
 **/
@SpringBootApplication
/**
 * 接收其他服务能够注册进来
 */
@EnableEurekaServer
public interface EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
