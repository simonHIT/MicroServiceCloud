package com.simon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program: MicroServiceCloud
 * @description: zuul gateway 主启动类
 * @author: simon
 * @create: 2019-09-25 17:00
 **/
@SpringBootApplication
@EnableZuulProxy
public interface ZuulGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApplication.class,args);
    }
}
