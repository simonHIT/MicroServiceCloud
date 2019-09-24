package com.simon.springcloud.service;

import com.simon.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(Long id) {
                System.out.println("Hystrix--服务降级");
                return new Dept();

            }

            @Override
            public List<Dept> list() {
                System.out.println("Hystrix--服务降级");
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                System.out.println("Hystrix--服务降级");
                return false;
            }
        };
    }
}
