package com.simon.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @program: MicroServiceCloud
 * @description: 类关系映射实体
 * @author: simon
 * @create: 2019-09-10 15:37
 **/

@SuppressWarnings("serial")
@AllArgsConstructor//全参构造方法
@NoArgsConstructor//无参构造方法
@Data//getter\setter
@Accessors(chain = true)//链式访问
public class Dept implements Serializable{

    /**
     * 主键
     */
    private Long deptNo;
    /**
     * 部门名称
     */
    private String dName;
    /**
     * 来自哪个数据库，因为微服务架构可以一个服务对应一个数据库
     * 同一个信息被存储到不同的数据库
     */
    private String db_source;
}
