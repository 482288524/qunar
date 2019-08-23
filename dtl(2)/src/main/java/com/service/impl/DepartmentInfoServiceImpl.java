package com.service.impl;

import com.bean.DepartmentInfo;
import com.mapper.DepartmentInfoMapper;
import com.service.DepartmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("DepartmentInfoService")
public class DepartmentInfoServiceImpl implements DepartmentInfoService {

    @Autowired
    DepartmentInfoMapper departmentInfoMapper;

    public List<DepartmentInfo> getDepartmentInfo(DepartmentInfo departmentInfo){
        return departmentInfoMapper.getDepartmentInfo(departmentInfo);
    }

}
