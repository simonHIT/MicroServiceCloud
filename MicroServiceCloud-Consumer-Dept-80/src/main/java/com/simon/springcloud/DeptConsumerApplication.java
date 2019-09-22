package com.simon.springcloud;

import com.simon.selfRules.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: MicroServiceCloud
 * @description: DeptConsumer启动类入口
 * @author: zxb
 * @create: 2019-09-11 11:10
 **/
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name= "MICROSERVICECLOUD-DEPT" ,configuration= MySelfRule. class )
public interface DeptConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplication.class,args);
    }
}
