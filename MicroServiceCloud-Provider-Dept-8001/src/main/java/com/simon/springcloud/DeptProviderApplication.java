package com.simon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: MicroServiceCloud
 * @description: springboot启动类
 * @author: simon
 * @create: 2019-09-10 17:19
 **/
@SpringBootApplication
@EnableEurekaClient
public class DeptProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeptProviderApplication.class,args);
    }
}
