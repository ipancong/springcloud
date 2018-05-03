package com.open.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("serial")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable{  // Entity orm mysql -> Dept (table) 类表映射
    private Long deptno; // 主键
    private String dname; // 部门名
    private String db_source;  // 来自哪个数据库，微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同的数据库
}
