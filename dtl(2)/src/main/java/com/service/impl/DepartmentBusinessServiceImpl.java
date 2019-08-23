package com.service.impl;

import com.bean.DepartmentBusiness;
import com.mapper.DepartmentBusinessMapper;
import com.service.DepartmentBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("DepartmentBusinessService")
public class DepartmentBusinessServiceImpl implements DepartmentBusinessService {

    @Autowired
    DepartmentBusinessMapper departmentBusinessMapper;

    public List<DepartmentBusiness> getDepartmentBusiness(DepartmentBusiness departmentBusiness){
        return departmentBusinessMapper.getDepartmentBusiness(departmentBusiness);
    }

}
