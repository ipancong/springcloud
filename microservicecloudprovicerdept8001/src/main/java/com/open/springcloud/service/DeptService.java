package com.open.springcloud.service;

import com.open.entity.Dept;

import java.util.List;

public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(int id);

    public List<Dept> list();
}
