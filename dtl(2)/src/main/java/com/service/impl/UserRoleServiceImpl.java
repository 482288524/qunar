package com.service.impl;

import com.bean.UserRole;
import com.mapper.UserRoleMapper;
import com.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("UserRoleService")
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    UserRoleMapper userRoleMapper;

    public List<UserRole> getUserRole(UserRole userRole){
        return userRoleMapper.getUserRole(userRole);
    }

}
