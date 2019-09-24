package com.simon.springcloud.service.impl;

import com.simon.springcloud.dao.DeptMapper;
import com.simon.springcloud.entities.Dept;
import com.simon.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: MicroServiceCloud
 * @description: Dept服务层实现类
 * @author: simon
 * @create: 2019-09-10 17:09
 **/
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean add(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }
}
