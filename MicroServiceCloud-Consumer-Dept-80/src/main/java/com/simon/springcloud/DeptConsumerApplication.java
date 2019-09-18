package com.simon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: MicroServiceCloud
 * @description: DeptConsumer启动类入口
 * @author: zxb
 * @create: 2019-09-11 11:10
 **/
@EnableEurekaClient
@SpringBootApplication
public interface DeptConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplication.class,args);
    }
}
