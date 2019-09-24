package com.simon.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.get(id);
        if (dept==null){
            throw new RuntimeException("该ID"+id+"没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id")Long id){
//        Dept dept = new Dept(id,"该id"+id+"没有对应的信息，null--@HystrixCommand","no this databases in mysql");
        Dept dept = new Dept();
        System.out.println("该ID"+id+"没有对应的信息,null--@HystrixCommand");
        return dept;
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
