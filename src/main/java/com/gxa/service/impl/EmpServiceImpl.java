package com.gxa.service.impl;

import com.gxa.entity.Emp;
import com.gxa.mapper.EmpMapper;
import com.gxa.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> queryAll() {
        List<Emp> emps = this.empMapper.queryAll();
        return emps;
    }
}
