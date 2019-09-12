package com.simon.springcloud.controller;

import com.simon.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @program: MicroServiceCloud
 * @description: DeptContoller消费者使用
 * @author: simon
 * @create: 2019-09-11 10:08
 **/

/**
 * 消费者controller中只涉及的服务提供者数据的使用，并不需要对数据层进行修改
 * 因此并不需要service，dao等层
 */
@RestController
@RequestMapping(value = "/consumer")
public class DeptController_Consumer {

    public static final String REST_URL_PREFIX="http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/dept/add")
    public boolean add(Dept dept){
        return restTemplate.patchForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping(value = "/dept/get/{id}")
    public Dept getDept(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get"+id,Dept.class);
    }

    @RequestMapping(value = "/dept/list")
    public List<Dept> getAllDept(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

    @RequestMapping(value = "/dept/discovery")
    public Object discoveryService(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);
    }

}
