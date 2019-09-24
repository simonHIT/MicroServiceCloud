package com.simon.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: MicroServiceCloud
 * @description: DeptConsumer启动类入口
 * @author: zxb
 * @create: 2019-09-11 11:10
 **/
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.simon.springcloud"})
//@ComponentScan("com.simon.springcloud")
public interface DeptConsumerApplicationFeign {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplicationFeign.class,args);
    }
}
