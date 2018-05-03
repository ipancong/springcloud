package com.open.springcloud.dao;

import com.open.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(int id);

    public List<Dept> findAll();
}
