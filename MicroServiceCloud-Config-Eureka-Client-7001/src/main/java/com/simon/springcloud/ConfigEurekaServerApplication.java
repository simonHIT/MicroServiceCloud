package com.simon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public interface ConfigEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaServerApplication.class,args);
    }
}
