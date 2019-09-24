package com.simon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public interface DashboardApplication9997 {
    public static void main(String[] args) {
        SpringApplication.run(DashboardApplication9997.class,args);
    }
}
