package com.service.impl;

import com.bean.Role;
import com.mapper.RoleMapper;
import com.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("RoleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    public List<Role> getRole(Role role){
        return roleMapper.getRole(role);
    }

}
