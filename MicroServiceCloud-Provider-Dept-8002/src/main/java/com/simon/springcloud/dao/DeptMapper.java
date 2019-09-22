package com.simon.springcloud.dao;

import com.simon.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: MicroServiceCloud
 * @description: Dept数据操作接口
 * @author: zxb
 * @create: 2019-09-10 16:58
 **/
@Mapper
public interface DeptMapper {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();

}
