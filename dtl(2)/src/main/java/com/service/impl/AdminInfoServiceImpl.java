package com.service.impl;

import com.bean.AdminInfo;
import com.mapper.AdminInfoMapper;
import com.service.AdminInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("AdminInfoService")
public class AdminInfoServiceImpl implements AdminInfoService {

    @Autowired
    AdminInfoMapper adminInfoMapper;

    public List<AdminInfo> getAdminInfo(AdminInfo adminInfo){
        return adminInfoMapper.getAdminInfo(adminInfo);
    }

}
