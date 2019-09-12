package com.simon.springcloud.controller;

import com.simon.springcloud.entities.Dept;
import com.simon.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: MicroServiceCloud
 * @description: Dept控制层实现Rest接口
 * @author: simon
 * @create: 2019-09-10 17:13
 **/
@RequestMapping("/dept")
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptService.list();
    }

    @RequestMapping(value = "/discovery",method = RequestMethod.GET)
    public Object DiscoveryService(){
        List<String> services = discoveryClient.getServices();
        System.out.println("***********"+services.toString());

        List<ServiceInstance> instances = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance sins:instances
             ) {
            System.out.println(sins.getServiceId()+"\t"+sins.getHost()+"\t"+sins.getPort()+"\t"+sins.getUri());
        }
        return discoveryClient;
    }

}
