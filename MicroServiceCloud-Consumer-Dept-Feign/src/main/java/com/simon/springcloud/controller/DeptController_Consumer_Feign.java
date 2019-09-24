package com.simon.springcloud.controller;

import com.simon.springcloud.entities.Dept;
import com.simon.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


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
public class DeptController_Consumer_Feign {

    @Autowired
    private DeptClientService deptClientService=null;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(Dept dept) {
        return this.deptClientService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}")
    public Dept getDept(@PathVariable("id") Long id) {
        return this.deptClientService.get(id);
    }

    @RequestMapping(value = "/dept/list")
    public List<Dept> getAllDept() {
        System.out.println("hello######################");
        return this.deptClientService.list();
    }


}
