package com.simon.springcloud.service;

import com.simon.springcloud.entities.Dept;

import java.util.List;

/**
 * @program: MicroServiceCloud
 * @description: dept服务层
 * @author: zxb
 * @create: 2019-09-10 17:07
 **/
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();

}
