package com.simon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: MicroServiceCloud
 * @description: springboot启动类
 * @author: simon
 * @create: 2019-09-10 17:19
 **/
@SpringBootApplication
@EnableEurekaClient//声明为eureka的客户端
@EnableDiscoveryClient//服务发现
public class ConfigDeptProviderApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigDeptProviderApplication8001.class,args);
    }
}
